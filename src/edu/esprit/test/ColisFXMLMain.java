/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.test;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import edu.esprit.*;
import edu.esprit.entities.Colis;
import edu.esprit.utils.TypeColis;
import edu.esprit.utils.UnitePoids;

/**
 *
 * @author hanajjar
 */
public class ColisFXMLMain extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        
                Parent root = FXMLLoader.load(getClass().getResource("/edu/esprit/GUI/ColisShowFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Covoiturage yee MAN ");
        
    }
    
    
 public static void main(String[] args) { 
      launch(args);
    }
}
