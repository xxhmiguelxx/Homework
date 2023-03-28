public class Vasos {

    private int cantidad=50;

    public Vasos() {
    }

    public Vasos(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Vasos{" +
                "cantidad=" + cantidad +
                '}';
    }
}
