/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import edu.esprit.entities.Colis;
import edu.esprit.services.ColisService;
import edu.esprit.utils.TypeColis;
import edu.esprit.utils.UnitePoids;
import java.awt.TextField;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author hanajjar
 */
public class ColisAddFXMLController implements Initializable {

    @FXML
    private javafx.scene.control.TextField tbH;
    @FXML
    private javafx.scene.control.TextField tbLargeur;
    @FXML
    private javafx.scene.control.TextField tbLongueur;
    @FXML
    private javafx.scene.control.TextField tbPoids;
    @FXML
    private ChoiceBox<String> chUnite;
    @FXML
    private ChoiceBox<String> chTypeColis;
    @FXML
    private javafx.scene.control.TextField ptDepart;
    @FXML
    private javafx.scene.control.TextField ptArrive;
   
    @FXML
    private ChoiceBox<String> chToleranceTime;

   // ColisService cs ;
  
    @FXML
    private JFXTimePicker timePicker;
    @FXML
    private JFXDatePicker datepicker;
    @FXML
    private TextArea tfDescription;
    @FXML
    private Label lbPrix;
    
        
    ColisService cs = new ColisService();
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
         ObservableList<String> typeColisL = FXCollections.observableArrayList("Enveloppe","Colis","Palette");
         chTypeColis.setItems(typeColisL);
         
         ObservableList<String> uniteL = FXCollections.observableArrayList("Kilogrammes","Milligrammes");
         chUnite.setItems(uniteL);
        
         ObservableList<String> toleranceTimeL = FXCollections.observableArrayList("Ponctuel","Plus o moins 5min","Plus o moins 10min","Plus o moins 15min");
         chToleranceTime.setItems(toleranceTimeL);
             } 
    

    @FXML
    private void ajouterDemande(ActionEvent event) {
        Colis c = new Colis();
        if (!(tbH.getText().equals("")) && !(tbLargeur.getText().equals("") ) && !(tbLongueur.getText().equals("")) && !(tbPoids.getText().equals(""))){
        c.setHauteur(Double.parseDouble(tbH.getText()));
        c.setLargeur(Double.parseDouble(tbLargeur.getText()));
        c.setLongueur(Double.parseDouble(tbLongueur.getText()));
        c.setPoids(Double.parseDouble(tbPoids.getText()));
       }
        c.setDescription(tfDescription.getText());
        c.setUnite(UnitePoids.valueOf(chUnite.getSelectionModel().getSelectedItem()));
        c.setTypeColis(TypeColis.valueOf(chTypeColis.getSelectionModel().getSelectedItem()));
        c.setDatePublication(Timestamp.valueOf(LocalDateTime.now()));
        if ( !(datepicker.getValue() == null ) && !(timePicker.getValue() == null)){
        c.setDateDepart(Timestamp.valueOf(datepicker.getValue().toString()+" "+timePicker.getValue().toString() +":00")); //(obligatoirs)
        }
        c.setToleranceTime(chToleranceTime.getSelectionModel().getSelectedItem());
    //c.setIdMembre(seession.getID());
   // c.setPrix(//à completer);
      c.setPointDepart(ptDepart.getText());
      c.setPointArrive(ptArrive.getText());
      
     
    //  cs.create(c); l'ajout à la BD!
        System.out.println( "c'est ça " + c);
        cs.create(c);
        System.out.println("_______________________________");
        System.out.println(chUnite.getSelectionModel().getSelectedItem() );
         
    }
   
}
