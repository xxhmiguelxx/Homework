public class Automovil extends Vehiculo{

    protected String marca;
    protected String modelo;
    protected int año;

    public Automovil() {
    }

    public Automovil(int numRuedas, String combustible, String motor, int numPuertas, String marca, String modelo, int año) {
        super(numRuedas, combustible, motor, numPuertas);
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", numRuedas=" + numRuedas +
                ", combustible='" + combustible + '\'' +
                ", motor='" + motor + '\'' +
                ", numPuertas=" + numPuertas +
                '}';
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el coche de marca "+ marca);
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el coche de marca "+ marca);
    }
}
