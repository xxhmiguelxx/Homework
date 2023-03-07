import java.util.Scanner;

public class Gato {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cadena de 9 simbolos");

        String gato = sc.nextLine();

        System.out.println(gato.substring(0,3));
        System.out.println(gato.substring(3,6));
        System.out.println(gato.substring(6,9));





    }
}
