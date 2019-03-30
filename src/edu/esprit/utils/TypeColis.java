/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.utils;

/**
 *
 * @author hanajjar
 */
public enum TypeColis {
    envp ("Enveloppe") , col("Colis") , pal("Palette");
    
    String type;

    private TypeColis(String b) {
        this.type = b;
    }
    
    
}
