package org.example.persistencia;

import org.example.modelo.Gastronomia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GastronomiaDAO implements InterfazDAO{

    public GastronomiaDAO() { //CONSTRUCTOR
    }

    //INSERT

    @Override
    public boolean insertar(Object obj) throws SQLException {

        String sqlInsert = "INSERT INTO Gastronomia(Nombre,Origen,Etimologia,Aparicion,URLImagen) VALUES(?,?,?,?,?)"; //PREPARE STATEMENT

        int rowCount = 0;

        PreparedStatement pstm = ConexionSingleton.getInstance("BaseGM.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Gastronomia)obj).getNombre());
        pstm.setString(2,((Gastronomia)obj).getOrigen());
        pstm.setString(3,((Gastronomia)obj).getEtimologia());
        pstm.setString(4,((Gastronomia)obj).getAparicion());
        pstm.setString(5,((Gastronomia)obj).getUrl());

        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    //UPDATE

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Gastronomia SET Nombre = ?, Origen = ?, Etimologia = ?, Aparicion = ?, URLImagen = ? WHERE ID=?;";

        int rowCount = 0;

        PreparedStatement pstm = ConexionSingleton.getInstance("BaseGM.db").getConnection().prepareStatement(sqlUpdate);

        pstm.setString(1,((Gastronomia)obj).getNombre());
        pstm.setString(2,((Gastronomia)obj).getOrigen());
        pstm.setString(3,((Gastronomia)obj).getEtimologia());
        pstm.setString(4,((Gastronomia)obj).getAparicion());
        pstm.setString(5,((Gastronomia)obj).getUrl());

        pstm.setInt(6,((Gastronomia)obj).getId());

        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    //DELETE
    @Override
    public boolean delete(String id) throws SQLException {

        String sqlDelete="DELETE FROM Gastronomia WHERE ID=?;";

        int rowCount = 0; //CUANTOS SE ELIMINARON
        PreparedStatement pstm = ConexionSingleton.getInstance("BaseGM.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id)); //CAMBIO
        rowCount =pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {

        String sql = "SELECT * FROM Gastronomia";
        ArrayList<Gastronomia> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("BaseGM.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Gastronomia(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));

        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {

        String sql = "SELECT * FROM Gastronomia WHERE ID=?;";
        Gastronomia gastronomia = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("BaseGM.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            gastronomia=new Gastronomia(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));

            return gastronomia;
        }
        return null;

    }
}
