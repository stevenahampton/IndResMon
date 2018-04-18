/**
 * Sample Skeleton for 'IndResMon.fxml' Controller Class
 */
package com.stevenhampton.indresmon;

import com.stevenhampton.indresmon.pojos.MarketSummary;
import com.stevenhampton.indresmon.pojos.TradeHistorySummary;
import com.stevenhampton.indresmon.pojos.HistorySummaryItem;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class IndResMonController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblVolume"
    private Label lblVolume; // Value injected by FXMLLoader

    @FXML // fx:id="lblVolCurrency"
    private Label lblVolCurrency; // Value injected by FXMLLoader

    @FXML // fx:id="lblHighOffer"
    private Label lblHighOffer; // Value injected by FXMLLoader

    @FXML // fx:id="lblAverage"
    private Label lblAverage; // Value injected by FXMLLoader

    @FXML // fx:id="lblTimestamp"
    private Label lblTimestamp; // Value injected by FXMLLoader

    @FXML // fx:id="lblHigh"
    private Label lblHigh; // Value injected by FXMLLoader

    @FXML // fx:id="lblLowBid"
    private Label lblLowBid; // Value injected by FXMLLoader

    @FXML // fx:id="lblLow"
    private Label lblLow; // Value injected by FXMLLoader

    @FXML // fx:id="lblLast"
    private Label lblLast; // Value injected by FXMLLoader

    @FXML
    private ChoiceBox<String> boxCrypto;

    @FXML
    private ChoiceBox<String> boxCurrency;

    @FXML
    private LineChart<?, ?> chartTradeHistory;

    @FXML
    private Slider slideHours;

    @FXML
    private Label lblHours;

    @FXML
    void eeeeee(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblVolume != null : "fx:id=\"lblVolume\" was not injected: check your FXML file 'IndResMon.fxml'.";
        assert lblVolCurrency != null : "fx:id=\"lblVolCurrency\" was not injected: check your FXML file 'IndResMon.fxml'.";
        assert lblHighOffer != null : "fx:id=\"lblHighOffer\" was not injected: check your FXML file 'IndResMon.fxml'.";
        assert lblAverage != null : "fx:id=\"lblAverage\" was not injected: check your FXML file 'IndResMon.fxml'.";
        assert lblTimestamp != null : "fx:id=\"lblTimestamp\" was not injected: check your FXML file 'IndResMon.fxml'.";
        assert lblHigh != null : "fx:id=\"lblHigh\" was not injected: check your FXML file 'IndResMon.fxml'.";
        assert lblLowBid != null : "fx:id=\"lblLowBid\" was not injected: check your FXML file 'IndResMon.fxml'.";
        assert lblLow != null : "fx:id=\"lblLow\" was not injected: check your FXML file 'IndResMon.fxml'.";
        assert lblLast != null : "fx:id=\"lblLast\" was not injected: check your FXML file 'IndResMon.fxml'.";

        lblHours.setText(Integer.toString(((Double)slideHours.getValue()).intValue()));
        
        boxCrypto.getSelectionModel().selectedItemProperty().addListener(
                (ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
                    refreshMarketSummary(null);
                    refreshTradeHistorySummary(null);
                });

        boxCurrency.getSelectionModel().selectedItemProperty().addListener(
                (ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
                    refreshMarketSummary(null);
                    refreshTradeHistorySummary(null);
                });

        slideHours.valueProperty().addListener(
                (ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
                    lblHours.setText(Integer.toString(newValue.intValue()));
                    refreshTradeHistorySummary(null);
                });
        
    }

    @FXML
    void refreshMarketSummary(ActionEvent event) {
        DecimalFormat money = new DecimalFormat("0.00");

        String crypto = boxCrypto.getValue();
        String currency = boxCurrency.getValue();

        if (crypto != null && currency != null) {
            MarketSummary ms = IndResMonServices.getMarketSummary(crypto, currency);

            // set contents of labels to supplied values
            lblLast.setText(money.format(ms.getLastPrice()));
            lblAverage.setText(money.format(ms.getDayAvgPrice()));
            lblHigh.setText(money.format(ms.getDayHighestPrice()));
            lblLow.setText(money.format(ms.getDayLowestPrice()));
            lblHighOffer.setText(money.format(ms.getCurrentHighestBidPrice()));
            lblLowBid.setText(money.format(ms.getCurrentLowestOfferPrice()));
            lblVolume.setText(ms.getDayVolumeXbt().toString());
            lblVolCurrency.setText(money.format(ms.getDayVolumeXbtInSecondaryCurrrency()));
            lblTimestamp.setText(ms.getCreatedTimestampUtc().toString());
        }
    }

    @FXML
    void refreshCryptos(ActionEvent event) {
        String[] cryptos = IndResMonServices.getValidPrimaryCodes();

        // set contents of choicebox to supplied values
        String sel = boxCrypto.getValue();
        boxCrypto.setItems(FXCollections.observableArrayList(cryptos));
        if (sel != null) {
            boxCrypto.setValue(sel);
        }
    }

    @FXML
    void refreshCurrencies(ActionEvent event) {
        String[] currencies = IndResMonServices.GetValidSecondaryCurrencyCodes();

        // set contents of choicebox to supplied values
        String sel = boxCurrency.getValue();
        boxCurrency.setItems(FXCollections.observableArrayList(currencies));
        if (sel != null) {
            boxCurrency.setValue(sel);
        }
    }

    public static int MaxHours = 240;

    @FXML
    void refreshTradeHistorySummary(ActionEvent event) {

        String crypto = boxCrypto.getValue();
        String currency = boxCurrency.getValue();
        int hours = Math.min(((Double) slideHours.getValue()).intValue(), MaxHours);

        if (crypto != null && currency != null) {
            TradeHistorySummary ths = IndResMonServices.getTradeHistorySummary(crypto, currency, hours);

            XYChart.Series series = new XYChart.Series();
            series.setName("Trade History");
            //populating the series with data
            for (int i = 1; i <= hours; i++) {
                HistorySummaryItem thi = ths.getHistorySummaryItems().get(i);
                series.getData().add(new XYChart.Data(Integer.toString(i), thi.getAverageSecondaryCurrencyPrice()));
            }
            chartTradeHistory.getData().setAll(series);
        }
    }
}
