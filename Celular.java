import java.awt.*;
public class Celular {

    private String marca;
    private Color color;
    private int memoria;
    private double pulgadas;

    public Celular() {
    }

    public Celular(String marca, Color color, int memoria, double pulgadas) {
        this.marca = marca;
        this.color = color;
        this.memoria = memoria;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", color=" + color +
                ", memoria=" + memoria +
                ", pulgadas=" + pulgadas +
                '}';
    }
}
