/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.iservices;

import edu.esprit.entities.Colis;
import java.util.ArrayList;

/**
 *
 * @author hanajjar
 */
public interface IServiceColis {
        public void create(Colis colis);
	public void update(Colis colis);
	public Colis getById(int colis);
	public ArrayList<Colis> getAll();
	public void delete(Colis colis);
	
}
