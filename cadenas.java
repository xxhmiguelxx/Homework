public class cadenas{

    public static void main(String[] args){

        // String

        String nombre = "Hector";
        System.out.println("Su nombre es: "+ nombre);
        System.out.println("Su nombre tiene " + nombre.length() + " letras");

        String a,b;
        a= "Hola";
        b= "";
        System.out.println(a.isEmpty());


        String apellido1, apellido2;
        apellido1= "Camargo";
        apellido2= "Roldan";
        System.out.println(apellido1.equals(apellido2));

        String correo = "xxh_miguelxx@hotmail.com";
        System.out.println("Su correo es: " + correo);
        int posicion1 =correo.indexOf("x");
        int posicion2 =correo.lastIndexOf("x");
        System.out.println("La primera x esta en la posicion: " + posicion1);
        System.out.println("La ultima x esta en la posicion: " + posicion2);

        String estado= "Estado de Mexico";
        String may= estado.toUpperCase();
        String min= estado.toLowerCase();
        System.out.println(may);
        System.out.println(min);

        String fullname= "Hector Miguel Camargo Roldan";
        String firstname=fullname.substring(0,13);
        String lastname= fullname.substring(14,28);
        System.out.println("Su nombre completo es: " + fullname);
        System.out.println("Sus nombres son: " + firstname);
        System.out.println("Sus apellidos son: " + lastname);


        // Interger

        String año= "2023";
        int ent= Integer.parseInt(año);
        System.out.println(ent);

        String pi= "3.1416";
        double n = Double.parseDouble(pi);
        String n1= Double.toString(n);
        System.out.println(n1);

        // String Builder

        StringBuilder sb= new StringBuilder();
        sb.append("Mi banda favorita ");
        sb.append("se llama Jungle");
        System.out.println(sb);
        





    




    
    }
}