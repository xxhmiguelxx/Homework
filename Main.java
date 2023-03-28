import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MaquinaDeCafe maq= new MaquinaDeCafe();

        //maq.setCantidadAgua(50);
        //System.out.println(maq);
        //System.out.println(maq.getCantidadAgua());

        Americano ame=new Americano();
        //System.out.println(ame);

        Expreso exp = new Expreso();
        //System.out.println(exp);

        Capuchino cap=new Capuchino();
        //System.out.println(cap);

        Vasos vasos=new Vasos();
        //System.out.println("La cantidad de vasos es de "+ vasos.getCantidad());

        //System.out.println("Sirviendo capuchino...");

        //INICIO


        Scanner scanner= new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);

        int seguir=1;

        while (seguir == 1) {

        System.out.println("          Bienvenido");
        System.out.println("-------------------------------");
        System.out.println("¿Qué desea hacer? Escoga un número");
        System.out.println("1) Servir café americano");
        System.out.println("2) Servir café expreso");
        System.out.println("3) Servir café capuchino");
        System.out.println("4) Consultar recursos de la máquina");

        int opcion=scanner.nextInt();



            switch (opcion) {
                case 1:

                        maq.servirAmericano();


                        maq.setCantidadAgua(maq.getCantidadAgua() - ame.getAgua());
                        maq.setCantidadCafe(maq.getCantidadCafe() - ame.getCafe());
                        maq.setCantidadCrema(maq.getCantidadCrema() - ame.getCrema());
                        maq.setCantidadVasosTamaño(maq.getCantidadVasosTamaño() - 1);


                        //System.out.println("¿Desea saber el estado de la maquina?");

                        maq.revisarRecursos();

                        break;
                case 2:
                    maq.servirExpreso();

                    maq.setCantidadAgua(maq.getCantidadAgua() - exp.getAgua());
                    maq.setCantidadCafe(maq.getCantidadCafe() - exp.getCafe());
                    maq.setCantidadCrema(maq.getCantidadCrema() - exp.getCrema());
                    maq.setCantidadVasosTamaño(maq.getCantidadVasosTamaño() - 1);
                    maq.revisarRecursos();
                    break;
                case 3:
                    maq.servirCapuchino();

                    maq.setCantidadAgua(maq.getCantidadAgua() - cap.getAgua());
                    maq.setCantidadCafe(maq.getCantidadCafe() - cap.getCafe());
                    maq.setCantidadCrema(maq.getCantidadCrema() - cap.getCrema());
                    maq.setCantidadVasosTamaño(maq.getCantidadVasosTamaño() - 1);
                    maq.revisarRecursos();
                    break;
                case 4:
                    maq.revisarRecursos();

            }

            System.out.println("¡GRACIAS POR USAR LA MÁQUINA!");
            System.out.println("Teclea 1 para ir al inicio");
            System.out.println("Teclea 0 para apagar la máquina");

            seguir=scanner2.nextInt();
        }




        /* maq.servirCapuchino();
        maq.setCantidadAgua(5000 - cap.getAgua());
        //System.out.println("El estado de la maquina es: " + "Agua=" + maq.getCantidadAgua());
        System.out.println(maq);
        maq.revisarVasos();
        System.out.println(maq.getCantidadAgua());*/





    }
}
