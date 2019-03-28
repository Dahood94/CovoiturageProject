/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import utils.TypeAnnonce;
import utils.CompagnieGenre;

/**
 *
 * @author hanajjar
 */
public class Annonce {
    
    private int idAannonce;
    private int idMembre;
    private Date dateDepart;
    private Date datePublication ;
    private String pointDepart;
    private String pointArrive;
    private int nbrePlace;
    private TypeAnnonce typeA;
    private double prixPlace;
    private String voiture;
    private CompagnieGenre compagnieGenre;

    public Annonce() {
    }

    public int getIdAannonce() {
        return idAannonce;
    }

    public int getIdMembre() {
        return idMembre;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public String getPointDepart() {
        return pointDepart;
    }

    public String getPointArrive() {
        return pointArrive;
    }

    public int getNbrePlace() {
        return nbrePlace;
    }

    public TypeAnnonce getTypeA() {
        return typeA;
    }

    public double getPrixPlace() {
        return prixPlace;
    }

    public String getVoiture() {
        return voiture;
    }

    public CompagnieGenre getCompagnieGenre() {
        return compagnieGenre;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public void setPointDepart(String pointDepart) {
        this.pointDepart = pointDepart;
    }

    public void setPointArrive(String pointArrive) {
        this.pointArrive = pointArrive;
    }

    public void setNbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

    public void setTypeA(TypeAnnonce typeA) {
        this.typeA = typeA;
    }

    public void setPrixPlace(double prixPlace) {
        this.prixPlace = prixPlace;
    }

    public void setVoiture(String voiture) {
        this.voiture = voiture;
    }

    public void setCompagnieGenre(CompagnieGenre compagnieGenre) {
        this.compagnieGenre = compagnieGenre;
    }
    
    
    
    
    
    
}
