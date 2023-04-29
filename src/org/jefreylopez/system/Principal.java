/*
    Nombre: Jefrey Eduardo López Ampérez
    Código Técnico: IN5AM
    Carné:2018422
    Fecha de creación: 16-03-2022
    Fecha de modificaciones: 2-04-2022
 */

package org.jefreylopez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        
        Scene escena  = new Scene(root);
        
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

