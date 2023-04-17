package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

public class ListeHistorique {

        //      CODE QUI PERMET D'AFFICHER LES HISTORIQUE D'AUJOUD'HUI
        public static ResultSet todayHistory(){
            try {
                DBConnection db = new DBConnection();
                Statement stm = null;
                String DBtable="historique";
                String DBdatetime="datetime";

                LocalDate today = LocalDate.now();
                String todays= String.valueOf(today);
                String sql="SELECT * FROM "+DBtable+" WHERE "+DBdatetime+" LIKE '%"+todays+"%';";
                return stm.executeQuery(sql);
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
        //
        //      CODE QUI PERMET D'AFFICHER LES HISTORIQUE A LA DATE QU'ON MET AU PARAMETRE
        public static ResultSet searchHistory(String time){
            try {
                DBConnection db = new DBConnection();
                Statement stm = null;
                String DBtable="historique";
                String DBdatetime="datetime";
                String sql="SELECT * FROM "+DBtable+" WHERE "+DBdatetime+" LIKE '%"+time+"%';";
                return stm.executeQuery(sql);
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
        //
        //      CODE QUI PERMET D'AFFICHER TOUS LES HISTORIQUE
        public static ResultSet allHistory(){
            try {
                DBConnection db = new DBConnection();
                Statement stm = null;
                String DBtable="historique";
                String DBdatetime="datetime";

                String sql="SELECT * FROM "+DBtable+";";
                return stm.executeQuery(sql);
            /*while (rs.next()){
                String username1= rs.getString(DBusername);
                String evenement1= rs.getString(DBevenement);
                String time1= rs.getString(DBdatetime);
            }*/
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
        

}


