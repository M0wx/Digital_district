package Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatFunction {

    public static double get_moy_age()  {
        double moy=0;
        int curent_date=23;
        List ll = new ArrayList();
        ResultSet rs = null;

        try{
            DbConnexion db = new DbConnexion();
            String sql = "select date_naissance from personne";
            rs= db.getconn().createStatement().executeQuery(sql);
            while (rs.next()){
                //maka anle hoe 2000 firy izy no teraka
                String date = rs.getString("date_naissance").substring(6);
                int real_date=Integer.parseInt(date);
                int age = curent_date-real_date;
                ll.add(age);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        double summ  =0;
        for (int i = 0; i< ll.size(); i++){
            int getage = (int) ll.get(i);
            summ+=getage;
        }
        moy=summ / ll.size();
        return moy;


    }


}
