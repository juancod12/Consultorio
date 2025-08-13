package com.zeus.service;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.awt.image.BufferedImage;





public class CargarImagen {


    public static void seleccionarFotoPerfil(Stage stage, ImageView imageViewFotoPerfil) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar Foto de Perfil");

        // Filtrar solo imágenes
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("Imágenes", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        // Mostrar el explorador
        File archivoSeleccionado = fileChooser.showOpenDialog(stage);

        if (archivoSeleccionado != null) {
            Image imagen = new Image(archivoSeleccionado.toURI().toString());
            imageViewFotoPerfil.setImage(imagen);
        }
    }

    public static String guargar(ImageView imageView){

        // Obtener imagen desde el ImageView
        Image img = imageView.getImage();

        // Convertir a BufferedImage
        BufferedImage bImage = SwingFXUtils.fromFXImage(img, null);

        // Carpeta destino dentro del proyecto
        String carpetaDestino = "imagenesPerfil";
        new File(carpetaDestino).mkdirs(); // Crea la carpeta si no existe

        // Crear nombre de archivo único
        String nombreArchivo = "perfil_" + System.currentTimeMillis() + ".png";

        // Ruta completa de destino
        File archivoDestino = new File(carpetaDestino + File.separator + nombreArchivo);

        // Guardar imagen como archivo
        try {
            ImageIO.write(bImage, "png", archivoDestino);
            System.out.println("Imagen guardada en: " + archivoDestino.getAbsolutePath());
            return nombreArchivo;
        } catch (IOException e) {
            e.printStackTrace();
            return "no se cargo imagen";
        }

    }

}
