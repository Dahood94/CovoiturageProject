/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.controller;

import edu.esprit.entities.Colis;
import edu.esprit.services.ColisService;
import edu.esprit.utils.TypeColis;
import edu.esprit.utils.UnitePoids;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author hanajjar
 */
public class ColisShowFXMLController implements Initializable {

    Label a = new Label();

    @FXML
    private GridPane gridPaneA = new GridPane();
//    @FXML
//    private GridPane g = new GridPane();

    ColisService cs = new ColisService();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Colis s = new Colis();
        Colis f = new Colis();
        Colis p = new Colis();
        Colis r = new Colis();

        s.setDescription("blabla SSSSSSSS");
        f.setDescription("flafla f");
        p.setDescription("plapla p");
        r.setDescription("slasla rRRRRRRRRRRRRR");

        s.setIdColis(20);
        f.setIdColis(30);
        p.setIdColis(40);
        r.setIdColis(50);

        ArrayList<Colis> e = new ArrayList<>();
        e.add(r);
        e.add(p);
        e.add(f);
        e.add(s);

        ArrayList<Colis> fromBase = new ArrayList<>();

        fromBase = cs.getAll();

        for (int i = 0; i < fromBase.size(); i++) {
            System.out.println(fromBase.get(i).toString());
            Colis o = fromBase.get(i);
            GridPane g = new GridPane();
            gridPaneA.add(g, 0, i);
            
                g.add(new Label("largeur de " + o.getLargeur() + " " + o.getUnite().toString()), 0, i);
//                g.add(new Label("\n "), 0, i);
                g.add(new Label("\n\nHauteur de " + o.getHauteur() + " " + o.getUnite().toString()), 0, i);
//                g.add(new Label(" \n\n\n"), 0, i);
                g.add(new Label("\n\n\n\nLongeur de " + o.getLongueur() + " " + o.getUnite().toString()), 0, i);
            
            
           
                g.add(new Label("\t Colis sera envoyer le : " + o.getDateDepart()), 1, i);
                
                
                
                g.add(new Label("\t Départ : "+o.getPointDepart()), 2, i);
                
                
                
                g.add(new Label("\t Arrivée : "+o.getPointArrive()), 3, i);
                g.add(new Label("\n\n\n\n\nConducteur : "+o.getIdMembre()), 3, i);
                
                g.add(new Label("\n\n\n\n\n\n\n \t\t publiée le " + o.getDatePublication()), 3, i);
           

//            gridPaneA.add(new Label("largeur de " + o.getLargeur() + "\n de la rgeur de " + o.getLargeur() + "\n"
//                    + "d'hauteur de " + o.getHauteur()), 0, i);

//            gridPaneA.add(new Label(" c'est un(e) " + o.getTypeColis()), 1, i);
//            gridPaneA.add(new Label("\n\n Le " + o.getDateDepart()), 1, i);
//            gridPaneA.add(new Label("Publiée le " + o.getDatePublication()), 3, i);
//            for (int j = 0; j <= i; j++) {
//                gridPaneA.add(new Label("\n\n\n__________________________"), j, i);
//            }
//            gridPaneA.add(new Label("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"), 1, i);

//            gridPaneA.add(new Label("\n_________________________"),i,0);
        }
        //  e.forEach(l -> gridPaneA.add(new Label(l.getDescription()), 1, 0));
    }

}
