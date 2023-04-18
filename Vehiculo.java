public class Vehiculo {

    protected int numRuedas;
    protected String combustible;
    protected String motor;
    protected int numPuertas;

    public Vehiculo() {
    }

    public Vehiculo(int numRuedas, String combustible, String motor, int numPuertas) {
        this.numRuedas = numRuedas;
        this.combustible = combustible;
        this.motor = motor;
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numRuedas=" + numRuedas +
                ", combustible='" + combustible + '\'' +
                ", motor='" + motor + '\'' +
                ", numPuertas=" + numPuertas +
                '}';
    }

    public void encender() {
        System.out.println("Encendiendo...");
    }

    public void apagar() {
        System.out.println("Apagando...");
    }
}
