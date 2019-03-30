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
public enum CompagnieGenre {
homme ("Homme") , femme("femme") , hommefemme("Homme/Femme");

String type;


CompagnieGenre (String a ){
    this.type = a;
}

}