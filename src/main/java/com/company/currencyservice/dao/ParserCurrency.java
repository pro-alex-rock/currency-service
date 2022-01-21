package com.company.currencyservice.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.company.currencyservice.dto.CurrencyDto;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
//@ConfigurationProperties(prefix = "spring.application")
public class ParserCurrency implements Parser {

    //@Value("${spring.application.URL}")
    private String URL = "https://api.monobank.ua/bank/currency";
    private final RestTemplate restTemplate;

    public ParserCurrency(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public List<CurrencyDto> getCurrency() {
        CurrencyDto[] currencies = Objects.requireNonNull(restTemplate.getForObject(URL, CurrencyDto[].class));
        return Arrays.stream(currencies).collect(Collectors.toList());
    }
}
