package org.example.controlador;

import org.example.modelo.Gastronomia;
import org.example.modelo.ModeloTabla;
import org.example.vista.VentanaGastronomia;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

public class ControladorGastronomia extends MouseAdapter { //IMPLEMENTS MOUSE LISTENER

    private VentanaGastronomia view;
    private ModeloTabla modelo;

    public ControladorGastronomia(VentanaGastronomia view) {
        this.view = view;

        modelo = new ModeloTabla();
        this.view.getTblGastronomia().setModel(modelo);

        this.view.getBtnCargar().addMouseListener(this);

        this.view.getBtnAgregar().addMouseListener(this);

        this.view.getTblGastronomia().addMouseListener(this);

        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) { //USO DE CLASE ABSTRACTA / RECUPERAR DATOS


        if (e.getSource() == this.view.getBtnCargar()){
            System.out.println("Se dio clic en el boton cargar");


            modelo.cargarDatos();
            this.view.getTblGastronomia().setModel(modelo);
            this.view.getTblGastronomia().updateUI();

        }
        if (e.getSource() == this.view.getBtnAgregar()){
            System.out.println("Se dio clic en boton agregar");

            Gastronomia gastronomia = new Gastronomia();
            gastronomia.setId(0);
            gastronomia.setNombre(this.view.getTxtNombre().getText()); //PROVIENE DE LA VISTA
            gastronomia.setOrigen(this.view.getTxtOrigen().getText());
            gastronomia.setEtimologia(this.view.getTxtEtimologia().getText());
            gastronomia.setAparicion(this.view.getTxtAparicion().getText());
            gastronomia.setUrl(this.view.getTxtUrl().getText()); //URL

            if(modelo.agregarGatronomia(gastronomia)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblGastronomia().updateUI(); //ACTUALIZAR
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo agregar","Error",JOptionPane.ERROR_MESSAGE);


            }
            this.view.limpiar();


        }
        if (e.getSource()== this.view.getTblGastronomia()){
            System.out.println("Se dio clic en la tabla");

            int row = this.view.getTblGastronomia().getSelectedRow();

            Gastronomia temp = modelo.obtenerGastronomia(row);

            try{
                this.view.getImagenGastronomia().setIcon(temp.getImagen());
            }catch (MalformedURLException mue){
                System.out.println(e.toString());
            }


        }



        //ACTUALIZAR

        if (e.getSource()==this.view.getBtnActualizar()){
            System.out.println("Se dio clic en el boton actualizar");

            int a = this.view.getTblGastronomia().getSelectedRow();
            int act = JOptionPane.showConfirmDialog(view,"¿Quiere realizar una actualizacion?","ACTUALIZAR",JOptionPane.YES_NO_OPTION);
            if (act == JOptionPane.YES_OPTION) {
                if (a >= 0) {
                    Gastronomia actualizacion = new Gastronomia();
                    actualizacion.setNombre(this.view.getTxtNombre().getText());
                    actualizacion.setOrigen(this.view.getTxtOrigen().getText());
                    actualizacion.setEtimologia(this.view.getTxtEtimologia().getText());
                    actualizacion.setAparicion(this.view.getTxtAparicion().getText());
                    actualizacion.setUrl(this.view.getTxtUrl().getText());
                    modelo.updateDatos(a, actualizacion);
                    this.view.getTblGastronomia().clearSelection();

                } else {
                    JOptionPane.showMessageDialog(view, "Primero seleccione la fila que desea actualizar", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                this.view.limpiar();

        }



    }

        //ELIMINAR
        if(e.getSource()==view.getBtnEliminar()){
            System.out.println("Se dio clic en el boton eliminar");

            int seleccion = view.getTblGastronomia().getSelectedRow();
            if (seleccion != -1) {
                int op = JOptionPane.showConfirmDialog(view,"¿Quiere eliminar esta fila?","ELIMINAR FILA",JOptionPane.YES_NO_OPTION);
                if (op == JOptionPane.YES_OPTION) {
                    modelo.deleteDatos(seleccion);
                    view.getTblGastronomia().clearSelection();
                }
            } else {
                this.view.getTblGastronomia().updateUI();
                JOptionPane.showMessageDialog(view, "Primero seleccione la fila que desea eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
}
}

