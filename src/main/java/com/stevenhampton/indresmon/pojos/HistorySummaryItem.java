package com.stevenhampton.indresmon.pojos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AverageSecondaryCurrencyPrice",
    "ClosingSecondaryCurrencyPrice",
    "StartTimestampUtc",
    "EndTimestampUtc",
    "HighestSecondaryCurrencyPrice",
    "LowestSecondaryCurrencyPrice",
    "NumberOfTrades",
    "OpeningSecondaryCurrencyPrice",
    "PrimaryCurrencyVolume",
    "SecondaryCurrencyVolume"
})
public class HistorySummaryItem {

    @JsonProperty("AverageSecondaryCurrencyPrice")
    private Double averageSecondaryCurrencyPrice;
    @JsonProperty("ClosingSecondaryCurrencyPrice")
    private Double closingSecondaryCurrencyPrice;
    @JsonProperty("StartTimestampUtc")
    private Date startTimestampUtc;
    @JsonProperty("EndTimestampUtc")
    private Date endTimestampUtc;
    @JsonProperty("HighestSecondaryCurrencyPrice")
    private Double highestSecondaryCurrencyPrice;
    @JsonProperty("LowestSecondaryCurrencyPrice")
    private Double lowestSecondaryCurrencyPrice;
    @JsonProperty("NumberOfTrades")
    private Integer numberOfTrades;
    @JsonProperty("OpeningSecondaryCurrencyPrice")
    private Double openingSecondaryCurrencyPrice;
    @JsonProperty("PrimaryCurrencyVolume")
    private Double primaryCurrencyVolume;
    @JsonProperty("SecondaryCurrencyVolume")
    private Double secondaryCurrencyVolume;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AverageSecondaryCurrencyPrice")
    public Double getAverageSecondaryCurrencyPrice() {
        return averageSecondaryCurrencyPrice;
    }

    @JsonProperty("AverageSecondaryCurrencyPrice")
    public void setAverageSecondaryCurrencyPrice(Double averageSecondaryCurrencyPrice) {
        this.averageSecondaryCurrencyPrice = averageSecondaryCurrencyPrice;
    }

    public HistorySummaryItem withAverageSecondaryCurrencyPrice(Double averageSecondaryCurrencyPrice) {
        this.averageSecondaryCurrencyPrice = averageSecondaryCurrencyPrice;
        return this;
    }

    @JsonProperty("ClosingSecondaryCurrencyPrice")
    public Double getClosingSecondaryCurrencyPrice() {
        return closingSecondaryCurrencyPrice;
    }

    @JsonProperty("ClosingSecondaryCurrencyPrice")
    public void setClosingSecondaryCurrencyPrice(Double closingSecondaryCurrencyPrice) {
        this.closingSecondaryCurrencyPrice = closingSecondaryCurrencyPrice;
    }

    public HistorySummaryItem withClosingSecondaryCurrencyPrice(Double closingSecondaryCurrencyPrice) {
        this.closingSecondaryCurrencyPrice = closingSecondaryCurrencyPrice;
        return this;
    }

    @JsonProperty("StartTimestampUtc")
    public Date getStartTimestampUtc() {
        return startTimestampUtc;
    }

    @JsonProperty("StartTimestampUtc")
    public void setStartTimestampUtc(Date startTimestampUtc) {
        this.startTimestampUtc = startTimestampUtc;
    }

    public HistorySummaryItem withStartTimestampUtc(Date startTimestampUtc) {
        this.startTimestampUtc = startTimestampUtc;
        return this;
    }

    @JsonProperty("EndTimestampUtc")
    public Date getEndTimestampUtc() {
        return endTimestampUtc;
    }

    @JsonProperty("EndTimestampUtc")
    public void setEndTimestampUtc(Date endTimestampUtc) {
        this.endTimestampUtc = endTimestampUtc;
    }

    public HistorySummaryItem withEndTimestampUtc(Date endTimestampUtc) {
        this.endTimestampUtc = endTimestampUtc;
        return this;
    }

    @JsonProperty("HighestSecondaryCurrencyPrice")
    public Double getHighestSecondaryCurrencyPrice() {
        return highestSecondaryCurrencyPrice;
    }

    @JsonProperty("HighestSecondaryCurrencyPrice")
    public void setHighestSecondaryCurrencyPrice(Double highestSecondaryCurrencyPrice) {
        this.highestSecondaryCurrencyPrice = highestSecondaryCurrencyPrice;
    }

    public HistorySummaryItem withHighestSecondaryCurrencyPrice(Double highestSecondaryCurrencyPrice) {
        this.highestSecondaryCurrencyPrice = highestSecondaryCurrencyPrice;
        return this;
    }

    @JsonProperty("LowestSecondaryCurrencyPrice")
    public Double getLowestSecondaryCurrencyPrice() {
        return lowestSecondaryCurrencyPrice;
    }

    @JsonProperty("LowestSecondaryCurrencyPrice")
    public void setLowestSecondaryCurrencyPrice(Double lowestSecondaryCurrencyPrice) {
        this.lowestSecondaryCurrencyPrice = lowestSecondaryCurrencyPrice;
    }

    public HistorySummaryItem withLowestSecondaryCurrencyPrice(Double lowestSecondaryCurrencyPrice) {
        this.lowestSecondaryCurrencyPrice = lowestSecondaryCurrencyPrice;
        return this;
    }

    @JsonProperty("NumberOfTrades")
    public Integer getNumberOfTrades() {
        return numberOfTrades;
    }

    @JsonProperty("NumberOfTrades")
    public void setNumberOfTrades(Integer numberOfTrades) {
        this.numberOfTrades = numberOfTrades;
    }

    public HistorySummaryItem withNumberOfTrades(Integer numberOfTrades) {
        this.numberOfTrades = numberOfTrades;
        return this;
    }

    @JsonProperty("OpeningSecondaryCurrencyPrice")
    public Double getOpeningSecondaryCurrencyPrice() {
        return openingSecondaryCurrencyPrice;
    }

    @JsonProperty("OpeningSecondaryCurrencyPrice")
    public void setOpeningSecondaryCurrencyPrice(Double openingSecondaryCurrencyPrice) {
        this.openingSecondaryCurrencyPrice = openingSecondaryCurrencyPrice;
    }

    public HistorySummaryItem withOpeningSecondaryCurrencyPrice(Double openingSecondaryCurrencyPrice) {
        this.openingSecondaryCurrencyPrice = openingSecondaryCurrencyPrice;
        return this;
    }

    @JsonProperty("PrimaryCurrencyVolume")
    public Double getPrimaryCurrencyVolume() {
        return primaryCurrencyVolume;
    }

    @JsonProperty("PrimaryCurrencyVolume")
    public void setPrimaryCurrencyVolume(Double primaryCurrencyVolume) {
        this.primaryCurrencyVolume = primaryCurrencyVolume;
    }

    public HistorySummaryItem withPrimaryCurrencyVolume(Double primaryCurrencyVolume) {
        this.primaryCurrencyVolume = primaryCurrencyVolume;
        return this;
    }

    @JsonProperty("SecondaryCurrencyVolume")
    public Double getSecondaryCurrencyVolume() {
        return secondaryCurrencyVolume;
    }

    @JsonProperty("SecondaryCurrencyVolume")
    public void setSecondaryCurrencyVolume(Double secondaryCurrencyVolume) {
        this.secondaryCurrencyVolume = secondaryCurrencyVolume;
    }

    public HistorySummaryItem withSecondaryCurrencyVolume(Double secondaryCurrencyVolume) {
        this.secondaryCurrencyVolume = secondaryCurrencyVolume;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public HistorySummaryItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
