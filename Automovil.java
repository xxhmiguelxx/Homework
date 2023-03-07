import java.awt.*;

public class Automovil {

    private String marca;
    private String submarca;
    private byte modelo;
    private Color color;

    //CONSTRUCTOR POR DEFECTO

    public Automovil() {
    }

    //CONSTRUCTOR


    public Automovil(String marca, String submarca, byte modelo, Color color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", submarca='" + submarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                '}';
    }
}

