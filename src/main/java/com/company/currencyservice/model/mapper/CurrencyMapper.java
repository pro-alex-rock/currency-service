package com.company.currencyservice.model.mapper;

import java.sql.Date;

import com.company.currency_info.CurrencyCode;
import com.company.currency_info.Pair;
import com.company.currencyservice.dto.CurrencyDto;

import org.springframework.stereotype.Component;

@Component
public class CurrencyMapper implements Mapper {

    @Override
    public Pair toCurrencyPair(CurrencyDto currencyDto) {
        if (currencyDto == null) {
            throw new RuntimeException("CurrencyDto cannot be empty!");
        }
        Pair pair = new Pair();
        pair.setCurrencyCodeA(CurrencyCode.findCurrency(currencyDto.getCurrencyCodeA()));
        pair.setCurrencyCodeB(CurrencyCode.findCurrency(currencyDto.getCurrencyCodeB()));
        pair.setDate(new Date(currencyDto.getDate()));
        if (currencyDto.getRateBuy() != null) {
            pair.setRateBuy(currencyDto.getRateBuy());
        }
        if (currencyDto.getRateSell() != null) {
            pair.setRateSell(currencyDto.getRateSell());
        }
        if (currencyDto.getRateCross() != null) {
            pair.setRateCross(currencyDto.getRateCross());
        }
        return pair;
    }
}
