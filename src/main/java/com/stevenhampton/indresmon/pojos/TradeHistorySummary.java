package com.stevenhampton.indresmon.pojos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CreatedTimestampUtc ",
    "HistorySummaryItems",
    "NumberOfHoursInThePastToRetrieve",
    "PrimaryCurrencyCode",
    "SecondaryCurrencyCode"
})
public class TradeHistorySummary {

    @JsonProperty("CreatedTimestampUtc ")
    private String createdTimestampUtc;
    @JsonProperty("HistorySummaryItems")
    private List<HistorySummaryItem> historySummaryItems = new ArrayList<HistorySummaryItem>();
    @JsonProperty("NumberOfHoursInThePastToRetrieve")
    private Integer numberOfHoursInThePastToRetrieve;
    @JsonProperty("PrimaryCurrencyCode")
    private String primaryCurrencyCode;
    @JsonProperty("SecondaryCurrencyCode")
    private String secondaryCurrencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CreatedTimestampUtc ")
    public String getCreatedTimestampUtc() {
        return createdTimestampUtc;
    }

    @JsonProperty("CreatedTimestampUtc ")
    public void setCreatedTimestampUtc(String createdTimestampUtc) {
        this.createdTimestampUtc = createdTimestampUtc;
    }

    public TradeHistorySummary withCreatedTimestampUtc(String createdTimestampUtc) {
        this.createdTimestampUtc = createdTimestampUtc;
        return this;
    }

    @JsonProperty("HistorySummaryItems")
    public List<HistorySummaryItem> getHistorySummaryItems() {
        return historySummaryItems;
    }

    @JsonProperty("HistorySummaryItems")
    public void setHistorySummaryItems(List<HistorySummaryItem> historySummaryItems) {
        this.historySummaryItems = historySummaryItems;
    }

    public TradeHistorySummary withHistorySummaryItems(List<HistorySummaryItem> historySummaryItems) {
        this.historySummaryItems = historySummaryItems;
        return this;
    }

    @JsonProperty("NumberOfHoursInThePastToRetrieve")
    public Integer getNumberOfHoursInThePastToRetrieve() {
        return numberOfHoursInThePastToRetrieve;
    }

    @JsonProperty("NumberOfHoursInThePastToRetrieve")
    public void setNumberOfHoursInThePastToRetrieve(Integer numberOfHoursInThePastToRetrieve) {
        this.numberOfHoursInThePastToRetrieve = numberOfHoursInThePastToRetrieve;
    }

    public TradeHistorySummary withNumberOfHoursInThePastToRetrieve(Integer numberOfHoursInThePastToRetrieve) {
        this.numberOfHoursInThePastToRetrieve = numberOfHoursInThePastToRetrieve;
        return this;
    }

    @JsonProperty("PrimaryCurrencyCode")
    public String getPrimaryCurrencyCode() {
        return primaryCurrencyCode;
    }

    @JsonProperty("PrimaryCurrencyCode")
    public void setPrimaryCurrencyCode(String primaryCurrencyCode) {
        this.primaryCurrencyCode = primaryCurrencyCode;
    }

    public TradeHistorySummary withPrimaryCurrencyCode(String primaryCurrencyCode) {
        this.primaryCurrencyCode = primaryCurrencyCode;
        return this;
    }

    @JsonProperty("SecondaryCurrencyCode")
    public String getSecondaryCurrencyCode() {
        return secondaryCurrencyCode;
    }

    @JsonProperty("SecondaryCurrencyCode")
    public void setSecondaryCurrencyCode(String secondaryCurrencyCode) {
        this.secondaryCurrencyCode = secondaryCurrencyCode;
    }

    public TradeHistorySummary withSecondaryCurrencyCode(String secondaryCurrencyCode) {
        this.secondaryCurrencyCode = secondaryCurrencyCode;
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

    public TradeHistorySummary withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
