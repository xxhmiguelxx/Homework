import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo(4,"Magna","X",4);
        System.out.println(vehiculo);

        Automovil auto = new Automovil(4,"Premium","Ford 3C Turbo",4,"Ford","Focus",2023);
        System.out.println(auto);

        Taxi taxi = new Taxi(4,"Magna","MR18DE",4,
                "Nissan","Tiida",2012,
                "De sitio",8.74,"Andres Lopez");
        System.out.println(taxi);


        vehiculo.encender();
        auto.encender();
        taxi.encender();
    }
}
