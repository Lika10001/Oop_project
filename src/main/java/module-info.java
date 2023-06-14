module Oop1 {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    requires javafx.swt;
    opens hierarchy;
    opens example;

    //opens hierarchy to javafx.fxml;
    //opens example.model to javafx.fxml;

    //exports hierarchy ;
   // exports example.model;
}