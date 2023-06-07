package org.example.persistencia;

import org.example.modelo.Gastronomia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoGastronomiaDB {

    //USO DE CONEXION SINGLETON Y CLASE PREPARED STATEMENT


    public DemoGastronomiaDB() {
    }

    public void insertPreparedStatement(){

        String aNombre = "Cochinita pibil";
        String aOrigen = "Yucatan";
        String aEtimologia = "Cocinado bajo tierra";
        String aAparicion = "Siglo XVI";
        String aUrl = "https://noticieros.televisa.com/viajes/wp-content/uploads/2018/12/cochinita-pibil-1-twitter.comRecetasMexicana.jpg";

        String sqlInsert = "INSERT INTO Gastronomia(Nombre,Origen,Etimologia,Aparicion,URLImagen) VALUES(?,?,?,?,?)";

        try{

            PreparedStatement pstm = ConexionSingleton.getInstance("BaseGM.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,aNombre);
            pstm.setString(2,aOrigen);
            pstm.setString(3,aEtimologia);
            pstm.setString(4,aAparicion);
            pstm.setString(5,aUrl);

            int rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");

        }catch (SQLException sqle){
            System.out.println("Error Prepared Statement " + sqle.getMessage());
        }

    }

    public boolean insertarGastronomia(Gastronomia gastronomia){

        String sqlInsert = "INSERT INTO Gastronomia(Nombre,Origen,Etimologia,Aparicion,URLImagen) VALUES(?,?,?,?,?)";

        int rowCount = 0;

        try{

            PreparedStatement pstm = ConexionSingleton.getInstance("BaseGM.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,gastronomia.getNombre());
            pstm.setString(2,gastronomia.getOrigen());
            pstm.setString(3,gastronomia.getEtimologia());
            pstm.setString(4,gastronomia.getAparicion());
            pstm.setString(5,gastronomia.getUrl());

            rowCount = pstm.executeUpdate();


        }catch (SQLException sqle){
            System.out.println("Error Prepared Statement " + sqle.getMessage());
        }
        return rowCount > 0;
    }


}
