package org.example;

import org.example.controlador.ControladorGastronomia;
import org.example.modelo.Gastronomia;
import org.example.persistencia.DemoGastronomiaDB;
import org.example.persistencia.GastronomiaDAO;
import org.example.vista.VentanaGastronomia;

import javax.swing.*;
import java.sql.SQLException;
import java.util.concurrent.SubmissionPublisher;

public class Main {

    public static void main(String[] args) {

        /*DemoGastronomiaDB demo = new DemoGastronomiaDB();
        demo.insertPreparedStatement();

        //PRUEBA INSERTAR
        Gastronomia gastronomia=new Gastronomia(0,"Enchiladas","Mesoamerica","Flauta enchilada","Siglo XVI","https://i.blogs.es/23068c/enchiladas-verdes-rellenas-de-queso-1-/1366_2000.jpg");

        if (demo.insertarGastronomia(gastronomia)){
            System.out.println("Se inserto correctamente");//OBJETO DE TRANSFERENCIA
        }else {
            System.out.println("No se inserto");
        }

//PRUEBA UPDATE

        GastronomiaDAO gdao=new GastronomiaDAO();

        Gastronomia gastronomia=new Gastronomia(3,"Tamal","Centro de Mexico","Envuelto","Siglo XVI","https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/9BB16DA5-DD89-4AAA-ABAE-F2F472F3BCC6/Derivates/d3bc9331-61d4-4dd8-b23a-3e950c385194.jpg");

        try {
            if(gdao.update(gastronomia)){
                System.out.println("Se modifico correctamente");//EXCEPCION
            }else {
                System.out.println("No se pudo modificar...");
            }
        }catch (SQLException sqle){
            System.out.println("Error al modificar");
        }*/


//PRUEBA DELETE

        //GastronomiaDAO gdao=new GastronomiaDAO();
       /*try {
           if (gdao.delete("8")){
               System.out.println("Se elimino corectamente");

           }else {
               System.out.println("No se pudo eliminar");
           }
       }catch (SQLException sqle){
           System.out.println("Error al eliminar");
       }*/

        //PRUEBA OBTENER

       /* try {
            Gastronomia res = (Gastronomia) gdao.buscarPorId("1");
            System.out.println(res);

            for(Object gas:gdao.obtenerTodo()){
                System.out.println((Gastronomia)gas);
            }
        }catch (SQLException sqle){
            System.out.println("Error");
        }*/


        VentanaGastronomia view =new VentanaGastronomia("Gastronomia Mexicana");
        ControladorGastronomia controller = new ControladorGastronomia(view);
    }

    }

