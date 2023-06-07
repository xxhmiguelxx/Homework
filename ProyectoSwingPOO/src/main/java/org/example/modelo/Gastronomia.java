package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Gastronomia {

    private int id;
    private String nombre;
    private String origen;
    private String etimologia;
    private String aparicion;
    private String url;

    public Gastronomia() {
    }

    public Gastronomia(int id, String nombre, String origen, String etimologia, String aparicion, String url) {
        this.id = id;
        this.nombre = nombre;
        this.origen = origen;
        this.etimologia = etimologia;
        this.aparicion = aparicion;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getEtimologia() {
        return etimologia;
    }

    public void setEtimologia(String etimologia) {
        this.etimologia = etimologia;
    }

    public String getAparicion() {
        return aparicion;
    }

    public void setAparicion(String aparicion) {
        this.aparicion = aparicion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    @Override
    public String toString() {
        return "Gastronomia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", etimologia='" + etimologia + '\'' +
                ", aparicion='" + aparicion + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException { //REGRESAR IMAGEN

            URL urlImagen = new URL(this.url);//EXCEPCION ATENDIDAS / FORZADAS
        return new ImageIcon(urlImagen);

    }
}
