package com.company.currencyservice.endpoint;

import com.company.currency_info.GetCurrencyRate;
import com.company.currency_info.GetCurrencyRateResponse;
import com.company.currencyservice.service.CurrencyService;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CurrencyEndpoint {

    private final CurrencyService currencyService;

    public CurrencyEndpoint(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PayloadRoot(namespace = "http://company.com/currency-info", localPart = "getCurrencyRate")
    @ResponsePayload
    public GetCurrencyRateResponse getCurrencyRate(@RequestPayload GetCurrencyRate currencyRate) {
        GetCurrencyRateResponse response = new GetCurrencyRateResponse();
        response.set_return(currencyService.getCurrencyRate(currencyRate.getCurrency()));
        return response;
    }
}
