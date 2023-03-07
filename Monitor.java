public class Monitor {

    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private int precio;

    public Monitor() {


        this.pulgadas = 24.5;
        this.marca = "LG";
        this.modelo = "24GQ";
        this.tipo = "LED";
        this.precio = 3629;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
