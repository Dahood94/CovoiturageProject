/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

import edu.esprit.utils.TypeColis;
import edu.esprit.utils.UnitePoids;
import java.sql.Timestamp;

/**
 *
 * @author hanajjar
 */
public class Colis {
    
//caractérestique du colis_______________________________________________________________________________________________
    private int idColis;
    private double hauteur;
    private double largeur;
    private double longueur;
    private double poids;
    private UnitePoids unite;
    private TypeColis typeColis;
    private String description;
//caractérestique du colis________________________________________________________________________________________________

    private double prix;

//caractérestique de l'annonce________________________________________________________________________________________________
    private int idMembre; // TYPE MEMBRE !!!!!!!!
    private Timestamp dateDepart;
    private Timestamp datePublication ;
    private String pointDepart;
    private String pointArrive;
     private boolean toleranceTime;
//caractérestique de l'annonce________________________________________________________________________________________________

    public Colis() {
    }
     
    public Colis(int idColis, double hauteur, double largeur, double longueur, double poids, UnitePoids unite, TypeColis typeColis, String description, double prix, int idMembre, Timestamp dateDepart, Timestamp datePublication, String pointDepart, String pointArrive, boolean toleranceTime) {
        this.idColis = idColis;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.longueur = longueur;
        this.poids = poids;
        this.unite = unite;
        this.typeColis = typeColis;
        this.description = description;
        this.prix = prix;
        this.idMembre = idMembre;
        this.dateDepart = dateDepart;
        this.datePublication = datePublication;
        this.pointDepart = pointDepart;
        this.pointArrive = pointArrive;
        this.toleranceTime = toleranceTime;
    }

    public Colis(double hauteur, double largeur, double longueur, double poids, UnitePoids unite, TypeColis typeColis, String description, double prix, int idMembre, Timestamp dateDepart, Timestamp datePublication, String pointDepart, String pointArrive, boolean toleranceTime) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.longueur = longueur;
        this.poids = poids;
        this.unite = unite;
        this.typeColis = typeColis;
        this.description = description;
        this.prix = prix;
        this.idMembre = idMembre;
        this.dateDepart = dateDepart;
        this.datePublication = datePublication;
        this.pointDepart = pointDepart;
        this.pointArrive = pointArrive;
        this.toleranceTime = toleranceTime;
    }

    public int getIdColis() {
        return idColis;
    }

    public double getHauteur() {
        return hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getPoids() {
        return poids;
    }

    public UnitePoids getUnite() {
        return unite;
    }

    public TypeColis getTypeColis() {
        return typeColis;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public int getIdMembre() {
        return idMembre;
    }

    public Timestamp getDateDepart() {
        return dateDepart;
    }

    public Timestamp getDatePublication() {
        return datePublication;
    }

    public String getPointDepart() {
        return pointDepart;
    }

    public String getPointArrive() {
        return pointArrive;
    }

    public boolean isToleranceTime() {
        return toleranceTime;
    }

    public void setIdColis(int idColis) {
        this.idColis = idColis;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setUnite(UnitePoids unite) {
        this.unite = unite;
    }

    public void setTypeColis(TypeColis typeColis) {
        this.typeColis = typeColis;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    public void setDateDepart(Timestamp dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setDatePublication(Timestamp datePublication) {
        this.datePublication = datePublication;
    }

    public void setPointDepart(String pointDepart) {
        this.pointDepart = pointDepart;
    }

    public void setPointArrive(String pointArrive) {
        this.pointArrive = pointArrive;
    }

    public void setToleranceTime(boolean toleranceTime) {
        this.toleranceTime = toleranceTime;
    }

    @Override
    public String toString() {
        return "Colis{" + "hauteur=" + hauteur + ", largeur=" + largeur + ", longueur=" + longueur + ", poids=" + poids + ", unite=" + unite + ", typeColis=" + typeColis + ", description=" + description + ", prix=" + prix + ", idMembre=" + idMembre + ", dateDepart=" + dateDepart + ", datePublication=" + datePublication + ", pointDepart=" + pointDepart + ", pointArrive=" + pointArrive + ", toleranceTime=" + toleranceTime + '}';
    }

     
     
}
