/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevenhampton.indresmon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author sa_ha
 */
public class IndResMon extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/IndResMon.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        // Retrieve data and set contents of labels to values
        IndResMonController indResController = (IndResMonController)loader.getController();
        indResController.refreshCryptos(null);
        indResController.refreshCurrencies(null);
        indResController.refreshMarketSummary(null);
        indResController.refreshTradeHistorySummary(null);
        
        stage.setScene(scene);
        stage.setTitle("Independent Reserve Monitor");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("indres.png")));
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
  
}
