/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevenhampton.indresmon;

import com.stevenhampton.indresmon.pojos.MarketSummary;
import java.text.DecimalFormat;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;

/**
 *
 * @author sa_ha
 */
public class IndResMonPopulateScene {

    private static DecimalFormat money = new DecimalFormat("0.00");
    
    public static void populate(Scene scene, String[] cryptoCodes, String[] currencyCodes, MarketSummary ms) {
        Node label = scene.lookup("#lblLast");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(money.format(ms.getLastPrice()));
        }
        label = scene.lookup("#lblAverage");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(money.format(ms.getDayAvgPrice()));
        }
        label = scene.lookup("#lblHigh");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(money.format(ms.getDayHighestPrice()));
        }
        label = scene.lookup("#lblLow");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(money.format(ms.getDayLowestPrice()));
        }
        label = scene.lookup("#lblHighOffer");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(money.format(ms.getCurrentHighestBidPrice()));
        }
        label = scene.lookup("#lblLowBid");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(money.format(ms.getCurrentLowestOfferPrice()));
        }
        label = scene.lookup("#lblVolume");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(ms.getDayVolumeXbt().toString());
        }
        label = scene.lookup("#lblVolCurrency");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(money.format(ms.getDayVolumeXbtInSecondaryCurrrency()));
        }
        label = scene.lookup("#lblTimestamp");
        if (label != null && label instanceof Label) {
            ((Label) label).setText(ms.getCreatedTimestampUtc().toString());
        }
    }
}
