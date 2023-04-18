public class Taxi extends Automovil{

    private String tipo;
    private double banderazo;
    private String nomConductor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Taxi() {
    }

    public Taxi(int numRuedas, String combustible, String motor, int numPuertas, String marca, String modelo, int año, String tipo, double banderazo, String nomConductor) {
        super(numRuedas, combustible, motor, numPuertas, marca, modelo, año);
        this.tipo = tipo;
        this.banderazo = banderazo;
        this.nomConductor = nomConductor;
    }

    public double getBanderazo() {
        return banderazo;
    }

    public void setBanderazo(double banderazo) {
        this.banderazo = banderazo;
    }

    public String getNomConductor() {
        return nomConductor;
    }

    public void setNomConductor(String nomConductor) {
        this.nomConductor = nomConductor;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "tipo='" + tipo + '\'' +
                ", banderazo=" + banderazo +
                ", nomConductor='" + nomConductor + '\'' +
                ", marca='" + marca + '\'' +
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
        System.out.println("Encendiendo el taxi...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el taxi...");
    }
}
