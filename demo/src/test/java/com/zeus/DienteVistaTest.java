package com.zeus;

import javafx.scene.layout.AnchorPane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class DienteVistaTest {
    
    public void dienteVistatest (AnchorPane root){

        double size = 100;
        double centerX = 150;
        double centerY = 150;
        double half = size / 2;
        double quarter = size / 4;

        // Centro
        Rectangle centro = new Rectangle(50,50, 25, 25);
        centro.setFill(Color.WHITE);
        centro.setStroke(Color.BLACK);

        // Triángulo superior
        Polygon top = new Polygon(
            37.5,37.5,   //y-
            50,50, //x-
            75,50, //x
            87.5,37.5  //y+
        );

        top.setFill(Color.LIGHTGRAY);
        top.setStroke(Color.BLACK);

        // Triángulo inferior
        Polygon bottom = new Polygon(
            37.5,37.5,   //y-
            50,50, //x-
            50, 75, //x
            37.5,87.5 //y+
            
        );
        bottom.setFill(Color.LIGHTGRAY);
        bottom.setStroke(Color.BLACK);

        // Triángulo izquierdo
        Polygon left = new Polygon(
            87.5,87.5,   //y-
            75,75, //x-
            50, 75, //x
            37.5,87.5 //y+
        );
        left.setFill(Color.LIGHTGRAY);
        left.setStroke(Color.BLACK);

        // Triángulo derecho
        Polygon right = new Polygon(
            87.5,37.5,
            87.5,87.5,
            75,75,
            75,50
            
        );
        right.setFill(Color.LIGHTGRAY);
        right.setStroke(Color.BLACK);

        root.getChildren().addAll( centro,top,bottom, left , right);

    
    }

}

