package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Historique {
    DBConnection db = new DBConnection();
    Statement stm = null;
    String DBtable="historique";
    String DBusername="username";
    String DBevenement="evenement";
    String DBdatetime="datetime";
    private String username;
    private String evenement;

    public Historique(String username, String evenement) {
        this.username = username;
        this.evenement = evenement;

        try {
            stm= db.getCon().createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEvenement() {
        return evenement;
    }

    public void setEvenement(String evenement) {
        this.evenement = evenement;
    }

    //     CODE QUI PERMET D'AJOUTER DES VALEURS DANS DANS LA TABLE HISTORIQUE DANS LA BDD
    public void updateHistorique(){
        try{
            String sqlINSERT="INSERT INTO "+DBtable+" ("+DBusername+","+DBevenement+")";
            String sqlVALUES=" VALUES ('"+this.username+"','"+this.evenement+"');";
            stm.executeUpdate(sqlINSERT+sqlVALUES);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //
    //      CODE QUI PERMET DE SUPPRIMER TOUS LES VALEURS DE LA TABLE HISTORIQUE DANS LA BDD
    public void deleteHistorique(){
        try{
            stm.executeUpdate("DELETE FROM "+DBtable+";");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //


}
