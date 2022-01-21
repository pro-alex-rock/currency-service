package com.company.currencyservice.model.mapper;

import javax.xml.datatype.DatatypeConfigurationException;

import com.company.currency_info.Pair;
import com.company.currencyservice.dto.CurrencyDto;

public interface Mapper {
    Pair toCurrencyPair(CurrencyDto currencyDto);
}
