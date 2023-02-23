import java.util.Scanner;
 
public class Programa{
    public static void main(String[] args){

        Scanner entrada= new Scanner (System.in);

        String nombre= "";
        String prof= "";
        String pais="";
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su profesion: ");
        prof = entrada.nextLine();

        System.out.println("Ingrese su pais de nacimiento: ");
        pais = entrada.nextLine();

        String may1= nombre.toUpperCase();
        String may2= prof.toUpperCase();
        String may3= pais.toUpperCase();

        System.out.println("Nombre: " + may1);
        System.out.println("Profesion: " + may2);
        System.out.println("Pais: " + may3);
        

       
         
    }
}