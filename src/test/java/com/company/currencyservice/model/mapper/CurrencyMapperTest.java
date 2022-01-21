package com.company.currencyservice.model.mapper;

import java.sql.Date;

import com.company.currency_info.CurrencyCode;
import com.company.currency_info.Pair;
import com.company.currencyservice.dto.CurrencyDto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyMapperTest {

    private final Mapper mapper = new CurrencyMapper();

    @Test
    public void givenNullAndShouldThrowRuntimeException() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> mapper.toCurrencyPair(null));
        assertEquals("CurrencyDto cannot be empty!", exception.getMessage());
    }

    @Test
    public void shouldMappingDtoFail() {
        Pair actualPair = new Pair();
        actualPair.setCurrencyCodeA(CurrencyCode.EUR);
        actualPair.setCurrencyCodeB(CurrencyCode.UAH);
        actualPair.setDate(new Date(1642759806));
        actualPair.setRateBuy(8.00);
        actualPair.setRateSell(8.02);
        actualPair.setRateCross(1.0000);

        CurrencyDto currencyDtoActual = new CurrencyDto();
        currencyDtoActual.setCurrencyCodeA(826);
        currencyDtoActual.setCurrencyCodeB(392);
        currencyDtoActual.setDate(2642759806L);
        currencyDtoActual.setRateBuy(5.00);
        currencyDtoActual.setRateSell(27.02);
        currencyDtoActual.setRateCross(30.0000);
        Pair expectedPair = mapper.toCurrencyPair(currencyDtoActual);

        assertNotEquals(expectedPair.getCurrencyCodeA(), actualPair.getCurrencyCodeA());
        assertNotEquals(expectedPair.getCurrencyCodeB(), actualPair.getCurrencyCodeB());
        assertNotEquals(expectedPair.getDate(), actualPair.getDate());
        assertNotEquals(expectedPair.getRateBuy(), actualPair.getRateBuy());
        assertNotEquals(expectedPair.getRateSell(), actualPair.getRateSell());
        assertNotEquals(expectedPair.getRateCross(), actualPair.getRateCross());
    }

    @Test
    public void shouldMappingDtoSuccess() {
        Pair actualPair = new Pair();
        actualPair.setCurrencyCodeA(CurrencyCode.EUR);
        actualPair.setCurrencyCodeB(CurrencyCode.UAH);
        actualPair.setDate(new Date(1642759806));
        actualPair.setRateBuy(8.00);
        actualPair.setRateSell(8.02);
        actualPair.setRateCross(1.0000);

        CurrencyDto currencyDtoActual = new CurrencyDto();
        currencyDtoActual.setCurrencyCodeA(978);
        currencyDtoActual.setCurrencyCodeB(980);
        currencyDtoActual.setDate(1642759806L);
        currencyDtoActual.setRateBuy(8.00);
        currencyDtoActual.setRateSell(8.02);
        currencyDtoActual.setRateCross(1.0000);
        Pair expectedPair = mapper.toCurrencyPair(currencyDtoActual);

        assertEquals(expectedPair.getCurrencyCodeA(), actualPair.getCurrencyCodeA());
        assertEquals(expectedPair.getCurrencyCodeB(), actualPair.getCurrencyCodeB());
        assertEquals(expectedPair.getDate(), actualPair.getDate());
        assertEquals(expectedPair.getRateBuy(), actualPair.getRateBuy());
        assertEquals(expectedPair.getRateSell(), actualPair.getRateSell());
        assertEquals(expectedPair.getRateCross(), actualPair.getRateCross());
    }

}