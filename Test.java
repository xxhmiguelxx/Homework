import java.awt.*;

public class Test {

    //PERSONA
    public static void main(String[] args) {

        Persona persona1 = new Persona("Miguel", 19, 1.75, 'M');
        System.out.println("Su nombre es: " + persona1.getNombre());
        System.out.println("Su edad es: " + persona1.getEdad());
        System.out.println("Su estatura es: " + persona1.getEstatura());
        System.out.println("Su sexo es: " + persona1.getSexo());

        System.out.println(persona1.toString());


        String per1 = persona1.toString();
        System.out.println(per1.toUpperCase());

        String per2 = persona1.toString();
        System.out.println(per2.toLowerCase());
        System.out.println("--------------------");

        //AUTOMOVIL

        Automovil auto1 = new Automovil("Nissan", "Versa",(byte) 22, Color.blue);
        String a1 = auto1.toString();
        System.out.println(a1);
        System.out.println("--------------------");

        //MONITOR

        Monitor mon1 = new Monitor();
        System.out.println("El monitor es de " + mon1.getPulgadas() + " pulgadas");
        System.out.println("Su marca es: " + mon1.getMarca());
        System.out.println("Su modelo es el: " + mon1.getModelo());
        System.out.println("Cuesta " + mon1.getPrecio() + " MXN");
        System.out.println("--------------------");


        //CELULAR

        Celular cel1 = new Celular("Samsung", Color.BLACK, 128, 6.5);
        String c1 = cel1.toString();
        System.out.println(c1);








    }
}
