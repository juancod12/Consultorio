package com.zeus.until;

import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class DienteVista extends Group{
    
    public DienteVista(double centerX, double centerY){

        double size = 15;
        double medio = size / 2;
    

        // Centro
        Rectangle centro = new Rectangle(centerX,centerY, size, size);
        centro.setFill(Color.WHITE);
        centro.setStroke(Color.BLACK);

        // Trapecio superior
        Polygon top = new Polygon(
            centerX,centerY,
            centerX-medio,centerY-medio,
            centerX+size+medio,centerY-medio,
            centerX+size,centerY
        );

        top.setFill(Color.LIGHTGRAY);
        top.setStroke(Color.BLACK);
        top.setOnMouseClicked((MouseEvent event) -> {
            top.setFill(Color.BLACK);
        });

        // Trapecio Izquierdo
        Polygon bottom = new Polygon(
            centerX,centerY,
            centerX-medio,centerY-medio,
            centerX-medio, centerY+size+medio,
            centerX,centerY+size
            
        );
        bottom.setFill(Color.LIGHTGRAY);
        bottom.setStroke(Color.BLACK);
        bottom.setOnMouseClicked((MouseEvent event) -> {
            
        });

        // Trapecio Abajo
        Polygon left = new Polygon(
            centerX,centerY+size,
            centerX-medio,centerY+size+medio,
            centerX+size+medio, centerY+size+medio,
            centerX+size,centerY+size
        );
        left.setFill(Color.LIGHTGRAY);
        left.setStroke(Color.BLACK);
        left.setOnMouseClicked((MouseEvent event) -> {
            
        });

        // Triángulo derecho
        Polygon right = new Polygon(

            centerX+size,centerY,
            centerX+size+medio,centerY-medio,
            centerX+size+medio,centerY+size+medio,
            centerX+size,centerY+size
            
        );
        right.setFill(Color.LIGHTGRAY);
        right.setStroke(Color.BLACK);
        right.setOnMouseClicked((MouseEvent event) -> {
            
        });

        this.getChildren().addAll( centro,top,bottom, left , right);

    
    }

    //usar setter y getters

}

