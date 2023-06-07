package org.example.modelo;

import org.example.persistencia.GastronomiaDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.nio.charset.MalformedInputException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel { //METODOS TABLA

    public static final int COLUMNS = 6;
    private ArrayList<Gastronomia> datos;
    private GastronomiaDAO gdao; //BASE DE DATOS ACCESO

    public ModeloTabla() {
        gdao = new GastronomiaDAO(); //INSTANCIA
        datos = new ArrayList<>();
    }

    public ModeloTabla(ArrayList<Gastronomia> datos) {
        this.datos = datos;
        gdao = new GastronomiaDAO();
    }


    @Override
    public int getRowCount() { //
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "Lugar de origen del platillo";
            case 3:
                return "Etimologia";
            case 4:
                return "Fecha o siglo de aparicion";
            case 5:
                return "URL de imagen";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { //OBTENER DATOS PARA MANDAR A TABLA
        Gastronomia tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getOrigen();
            case 3:
                return tmp.getEtimologia();
            case 4:
                return tmp.getAparicion();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {

        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId();
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) o);
                break;
            case 2:
                datos.get(rowIndex).setOrigen((String) o);
                break;
            case 3:
                datos.get(rowIndex).setEtimologia((String) o);
                break;
            case 4:
                datos.get(rowIndex).setAparicion((String) o);
                break;
            case 5:
                datos.get(rowIndex).setUrl((String) o);
                break;
            default:
                System.out.println("No se modifica");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos(){
        try {
            ArrayList<Gastronomia> ot = gdao.obtenerTodo(); //REVISAR
            System.out.println(ot);
            datos = gdao.obtenerTodo(); //EXCEPCION - TRY CATCH
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    //ACTUALIZAR
    public void updateDatos(int e, Gastronomia gastronomia) {
        if(0 >= 0 && e < datos.size()){

            Gastronomia update = datos.get(e);

            update.setNombre(gastronomia.getNombre());
            update.setOrigen(gastronomia.getOrigen());
            update.setEtimologia(gastronomia.getEtimologia());
            update.setAparicion(gastronomia.getAparicion());
            update.setUrl(gastronomia.getUrl());

            try {
                gdao.update(update);
            }catch (SQLException sqle){
                System.out.println(sqle.getMessage());
            }
        }



    }
    //ELIMINAR
    public void deleteDatos(int e){
        if(e>=0 && e <datos.size()){
            Gastronomia gastronomia = datos.get(e);

            try{
                if(gdao.delete(Integer.toString(gastronomia.getId()))){
                    datos.remove(e);
                    deleteDatos(e);
                }else {
                    System.out.println("Error");
                }
            }catch (SQLException sqle){
                System.out.println(sqle.getMessage());
            }
        }

    }

    public boolean agregarGatronomia(Gastronomia gastronomia){

        boolean resultado = false;

        try {
            if (gdao.insertar(gastronomia)){
                datos.add(gastronomia);
                resultado = true;//DESDE CONTROLADOR / EXCEPCIONES

            }  else{
                resultado = false;

            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());

        }
        return resultado;

    }
    public Gastronomia obtenerGastronomia(int rowIndex) throws IndexOutOfBoundsException{
        return datos.get(rowIndex);

}
}
