package com.company.currencyservice.dao;

import java.util.List;

import com.company.currencyservice.dto.CurrencyDto;

public interface Parser {
    List<CurrencyDto> getCurrency();
}
