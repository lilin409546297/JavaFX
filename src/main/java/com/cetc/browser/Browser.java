package com.cetc.browser;

import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Browser extends Region {

    private WebView webView = new WebView();
    private WebEngine webEngine = webView.getEngine();

    public Browser() {

        Platform.runLater(() -> {
            webEngine.load(Thread.currentThread().getContextClassLoader().getResource("browser/index.html").toExternalForm());
        });
        getChildren().add(webView);
    }

    @Override
    protected void layoutChildren() {
        layoutInArea(webView, 0, 0, getWidth(), getHeight(), 0, HPos.CENTER, VPos.CENTER);
    }

    @Override
    protected double computePrefWidth(double height) {
        return 900;
    }

    @Override
    protected double computePrefHeight(double width) {
        return 900;
    }
}
