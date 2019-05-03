/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.services;

import edu.esprit.entities.Colis;
import edu.esprit.iservices.IServiceColis;
import edu.esprit.utils.DataSource;
import edu.esprit.utils.TypeColis;
import edu.esprit.utils.UnitePoids;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hanajjar
 */
public class ColisService implements IServiceColis {

    Connection conn = DataSource.getInstance().getConnection();
    Statement stmt;

    @Override
    public void create(Colis colis) {
        try {

            String req = "INSERT INTO colis (hauteur, largeur, longueur, poids, unite, typeColis, description, prix, idMembre, dateDepart, datePublication, pointDepart, pointArrive, toleranceTime) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(req, Statement.RETURN_GENERATED_KEYS);

            st.setDouble(1, colis.getHauteur());
            st.setDouble(2, colis.getLargeur());
            st.setDouble(3, colis.getLongueur());
            st.setDouble(4, colis.getPoids());
            st.setString(5, colis.getUnite().toString());
            st.setString(6, colis.getTypeColis().toString());
            st.setString(7, colis.getDescription());
            st.setDouble(8, colis.getPrix());
            st.setInt(9, colis.getIdMembre());
            st.setTimestamp(10, colis.getDateDepart());
            st.setTimestamp(11, colis.getDatePublication());
            st.setString(12, colis.getPointDepart());
            st.setString(13, colis.getPointArrive());
            st.setString(14, colis.isToleranceTime());

            st.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Colis colis) {
        try {
            String req = "UPDATE colis SET hauteur=?, largeur=?, longueur=?, poids=?,unite=?unite=? ,typeColis=?, description=?, dateDepart=?, datePublication=?, pointDepart=?, pointArrive=?, toleranceTime=?, prix=? where idColis=? ";
            PreparedStatement st = conn.prepareStatement(req);

            st.setDouble(1, colis.getHauteur());
            st.setDouble(2, colis.getLargeur());
            st.setDouble(3, colis.getLongueur());
            st.setDouble(4, colis.getPoids());
            st.setString(5, colis.getUnite().toString());
            st.setString(6, colis.getTypeColis().toString());
            st.setString(7, colis.getDescription());
            st.setDouble(8, colis.getPrix());
            st.setInt(9, colis.getIdMembre());
            st.setTimestamp(10, colis.getDateDepart());
            st.setTimestamp(11, colis.getDatePublication());
            st.setString(12, colis.getPointDepart());
            st.setString(13, colis.getPointArrive());
            st.setString(14, colis.isToleranceTime());

            st.setInt(15, colis.getIdColis());

            st.executeUpdate();

            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Colis getById(int idColis) {
        Colis c = null;
        String req = "select * from colis  where idColis= ?";
        try {
            PreparedStatement st = conn.prepareStatement(req);
            st.setInt(1, idColis);
            ResultSet resultSet1 = st.executeQuery();

            while (resultSet1.next()) {
                c = new Colis();

                c.setIdColis(resultSet1.getInt("idColis"));
                c.setHauteur(resultSet1.getDouble("hauteur"));
                c.setLargeur(resultSet1.getDouble("largeur"));
                c.setLongueur(resultSet1.getDouble("longueur"));
                c.setPoids(resultSet1.getDouble("poids"));
                c.setUnite(UnitePoids.valueOf(resultSet1.getString("unite")));
                c.setTypeColis(TypeColis.valueOf(resultSet1.getString("typeColis")));
                c.setDescription(resultSet1.getString("description"));
                c.setPrix(resultSet1.getDouble("prix"));
                c.setIdMembre(resultSet1.getInt("idMembre"));//à completer___============================================================
                c.setDateDepart(resultSet1.getTimestamp("dateDepart"));
                c.setDatePublication(resultSet1.getTimestamp("datePublication"));
                c.setPointDepart(resultSet1.getString("pointDepart"));
                c.setPointArrive(resultSet1.getString("pointArrive"));
                c.setToleranceTime(resultSet1.getString("toleranceTime"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public ArrayList<Colis> getAll() {
        Colis c;
        ArrayList<Colis> coliss = new ArrayList<>();
        String req = "select * from colis";
        try {
            PreparedStatement st = conn.prepareStatement(req);
            ResultSet resultSet1 = st.executeQuery();
            
            while (resultSet1.next()) {
                c = new Colis();

                c.setIdColis(resultSet1.getInt("idColis"));
                c.setHauteur(resultSet1.getDouble("hauteur"));
                c.setLargeur(resultSet1.getDouble("largeur"));
                c.setLongueur(resultSet1.getDouble("longueur"));
                c.setPoids(resultSet1.getDouble("poids"));
                c.setUnite(UnitePoids.valueOf(resultSet1.getString("unite")));
                c.setTypeColis(TypeColis.valueOf(resultSet1.getString("typeColis")));
                c.setDescription(resultSet1.getString("description"));
                c.setPrix(resultSet1.getDouble("prix"));
                c.setIdMembre(resultSet1.getInt("idMembre"));//à completer___============================================================
                c.setDateDepart(resultSet1.getTimestamp("dateDepart"));
                c.setDatePublication(resultSet1.getTimestamp("datePublication"));
                c.setPointDepart(resultSet1.getString("pointDepart"));
                c.setPointArrive(resultSet1.getString("pointArrive"));
                c.setToleranceTime(resultSet1.getString("toleranceTime"));
           coliss.add(c);
            }
            } catch (SQLException e) {
			e.printStackTrace();
		}
		return coliss;   
      }

    @Override
    public void delete(Colis colis) {
        System.out.println(colis + "va être supprimé");
        try {
            String req = "DELETE FROM colis WHERE idColis = ? ";
            PreparedStatement st = conn.prepareStatement(req);
            st.setInt(1, colis.getIdColis());
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
