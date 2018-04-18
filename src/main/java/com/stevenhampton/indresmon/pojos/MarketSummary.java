/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevenhampton.indresmon.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author sa_ha
 */
public class MarketSummary {

    private Double DayLowestPrice;

    private String SecondaryCurrencyCode;

    private Double DayAvgPrice;

    private Date CreatedTimestampUtc;

    private Double CurrentLowestOfferPrice;

    private Double LastPrice;

    private Double CurrentHighestBidPrice;

    private Double DayVolumeXbtInSecondaryCurrrency;

    private Double DayHighestPrice;

    private String PrimaryCurrencyCode;

    private Double DayVolumeXbt;

    @JsonProperty("DayLowestPrice")
    public Double getDayLowestPrice() {
        return DayLowestPrice;
    }

    @JsonProperty("DayLowestPrice")
    public void setDayLowestPrice(Double DayLowestPrice) {
        this.DayLowestPrice = DayLowestPrice;
    }

    @JsonProperty("SecondaryCurrencyCode")
    public String getSecondaryCurrencyCode() {
        return SecondaryCurrencyCode;
    }

    @JsonProperty("SecondaryCurrencyCode")
    public void setSecondaryCurrencyCode(String SecondaryCurrencyCode) {
        this.SecondaryCurrencyCode = SecondaryCurrencyCode;
    }

    @JsonProperty("DayAvgPrice")
    public Double getDayAvgPrice() {
        return DayAvgPrice;
    }

    @JsonProperty("DayAvgPrice")
    public void setDayAvgPrice(Double DayAvgPrice) {
        this.DayAvgPrice = DayAvgPrice;
    }

    @JsonProperty("CreatedTimestampUtc")
    public Date getCreatedTimestampUtc() {
        return CreatedTimestampUtc;
    }

    @JsonProperty("CreatedTimestampUtc")
    public void setCreatedTimestampUtc(Date CreatedTimestampUtc) {
        this.CreatedTimestampUtc = CreatedTimestampUtc;
    }

    @JsonProperty("CurrentLowestOfferPrice")
    public Double getCurrentLowestOfferPrice() {
        return CurrentLowestOfferPrice;
    }

    @JsonProperty("CurrentLowestOfferPrice")
    public void setCurrentLowestOfferPrice(Double CurrentLowestOfferPrice) {
        this.CurrentLowestOfferPrice = CurrentLowestOfferPrice;
    }

    @JsonProperty("LastPrice")
    public Double getLastPrice() {
        return LastPrice;
    }

    @JsonProperty("LastPrice")
    public void setLastPrice(Double LastPrice) {
        this.LastPrice = LastPrice;
    }

    @JsonProperty("CurrentHighestBidPrice")
    public Double getCurrentHighestBidPrice() {
        return CurrentHighestBidPrice;
    }

    @JsonProperty("CurrentHighestBidPrice")
    public void setCurrentHighestBidPrice(Double CurrentHighestBidPrice) {
        this.CurrentHighestBidPrice = CurrentHighestBidPrice;
    }

    @JsonProperty("DayVolumeXbtInSecondaryCurrrency")
    public Double getDayVolumeXbtInSecondaryCurrrency() {
        return DayVolumeXbtInSecondaryCurrrency;
    }

    @JsonProperty("DayVolumeXbtInSecondaryCurrrency")
    public void setDayVolumeXbtInSecondaryCurrrency(Double DayVolumeXbtInSecondaryCurrrency) {
        this.DayVolumeXbtInSecondaryCurrrency = DayVolumeXbtInSecondaryCurrrency;
    }

    @JsonProperty("DayHighestPrice")
    public Double getDayHighestPrice() {
        return DayHighestPrice;
    }

    @JsonProperty("DayHighestPrice")
    public void setDayHighestPrice(Double DayHighestPrice) {
        this.DayHighestPrice = DayHighestPrice;
    }

    @JsonProperty("PrimaryCurrencyCode")
    public String getPrimaryCurrencyCode() {
        return PrimaryCurrencyCode;
    }

    @JsonProperty("PrimaryCurrencyCode")
    public void setPrimaryCurrencyCode(String PrimaryCurrencyCode) {
        this.PrimaryCurrencyCode = PrimaryCurrencyCode;
    }

    @JsonProperty("DayVolumeXbt")
    public Double getDayVolumeXbt() {
        return DayVolumeXbt;
    }

    @JsonProperty("DayVolumeXbt")
    public void setDayVolumeXbt(Double DayVolumeXbt) {
        this.DayVolumeXbt = DayVolumeXbt;
    }

    @Override
    public String toString() {
        return MarketSummary.class.getSimpleName()
                + " [DayLowestPrice = " + DayLowestPrice 
                + ", SecondaryCurrencyCode = " + SecondaryCurrencyCode 
                + ", DayAvgPrice = " + DayAvgPrice 
                + ", CreatedTimestampUtc  = " + CreatedTimestampUtc 
                + ", CurrentLowestOfferPrice = " + CurrentLowestOfferPrice 
                + ", LastPrice = " + LastPrice 
                + ", CurrentHighestBidPrice = " + CurrentHighestBidPrice 
                + ", DayVolumeXbtInSecondaryCurrrency = " + DayVolumeXbtInSecondaryCurrrency 
                + ", DayHighestPrice = " + DayHighestPrice 
                + ", PrimaryCurrencyCode = " + PrimaryCurrencyCode 
                + ", DayVolumeXbt = " + DayVolumeXbt + "]";
    }
}
