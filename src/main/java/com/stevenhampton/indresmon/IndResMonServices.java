/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevenhampton.indresmon;

/**
 *
 * @author sa_ha
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stevenhampton.indresmon.pojos.MarketSummary;
import com.stevenhampton.indresmon.pojos.TradeHistorySummary;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IndResMonServices {

    public static String IndResMonURL = "https://api.independentreserve.com/Public/";
    
    public static String getIndResMonData(String urlString) {

        String output = null;

        try {
            URL url = new URL(urlString);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            output = br.readLine();
            conn.disconnect();

        } catch (IOException | RuntimeException ex) {
            Logger.getLogger(IndResMonServices.class.getName()).log(Level.SEVERE, null, ex);

        }

        return output;
    }

    public static MarketSummary getMarketSummary(String crypto, String currency) {
        String json = getIndResMonData(IndResMonURL 
                + "GetMarketSummary?primaryCurrencyCode="
                + crypto + "&secondaryCurrencyCode=" + currency);
        ObjectMapper objectMapper = new ObjectMapper();
        MarketSummary ms = null;
        try {
            ms = objectMapper.readValue(json, MarketSummary.class);
        } catch (IOException ex) {
            Logger.getLogger(IndResMonServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ms;
    }

    public static TradeHistorySummary getTradeHistorySummary(String crypto, String currency, int hrs) {
        String json = getIndResMonData(IndResMonURL 
                + "GetTradeHistorySummary?primaryCurrencyCode="
                + crypto + "&secondaryCurrencyCode=" + currency
                + "&numberOfHoursInThePastToRetrieve="+ hrs);
        ObjectMapper objectMapper = new ObjectMapper();
        TradeHistorySummary ths = null;
        try {
            ths = objectMapper.readValue(json, TradeHistorySummary.class);
        } catch (IOException ex) {
            Logger.getLogger(IndResMonServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ths;
    }

    public static String[] getValidPrimaryCodes() {
        String json = getIndResMonData(IndResMonURL  + "GetValidPrimaryCurrencyCodes");
        ObjectMapper objectMapper = new ObjectMapper();
        String[] cryptoCodes = null;
        try {
            cryptoCodes = objectMapper.readValue(json, String[].class);
            // convert all to uppercase
            for (int i = 0; i < cryptoCodes.length; i++) {
                cryptoCodes[i] = cryptoCodes[i].toUpperCase();
            }
        } catch (IOException ex) {
            Logger.getLogger(IndResMonServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cryptoCodes;
    }

    public static String[] GetValidSecondaryCurrencyCodes() {
        String json = getIndResMonData(IndResMonURL  + "GetValidSecondaryCurrencyCodes");
        ObjectMapper objectMapper = new ObjectMapper();
        String[] currencyCodes = null;
        try {
            currencyCodes = objectMapper.readValue(json, String[].class);
            // convert all to uppercase
            for (int i = 0; i < currencyCodes.length; i++) {
                currencyCodes[i] = currencyCodes[i].toUpperCase();
            }
        } catch (IOException ex) {
            Logger.getLogger(IndResMonServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return currencyCodes;
    }
}
