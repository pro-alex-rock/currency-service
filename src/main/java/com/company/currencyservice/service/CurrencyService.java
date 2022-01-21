package com.company.currencyservice.service;

import java.util.List;
import java.util.stream.Collectors;

import com.company.currency_info.Pair;
import com.company.currencyservice.dao.Parser;
import com.company.currencyservice.dto.CurrencyDto;
import com.company.currencyservice.model.mapper.Mapper;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private final Parser parser;
    private final Mapper mapper;

    public CurrencyService(Parser parser, Mapper mapper) {
        this.parser = parser;
        this.mapper = mapper;
    }

    public List<Pair> getCurrencyRate(String code) {
        if (code == null || code.equals("")) {
            return getPairs();
        } else {
            return List.of(getPair(code));
        }
    }

    private List<Pair> getPairs() {
        List<CurrencyDto> currency = parser.getCurrency();
        return currency.stream().map(mapper::toCurrencyPair)
                .filter(a -> (a.getRateBuy() != 0 && a.getRateSell() != 0))
                .collect(Collectors.toList());
    }

    private Pair getPair(String code) {
        return getPairs().stream().filter(c -> (code.toUpperCase())
                .equals(c.getCurrencyCodeA().name())).findFirst().get();
    }
}
