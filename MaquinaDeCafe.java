public class MaquinaDeCafe {

    private int cantidadAgua; //ml 500 MAX
    private int cantidadCafe; //gr 1000 MAX
    private int cantidadCrema; //ml 1500 MAX
    private int cantidadVasosTamaño; //U 50 stock MAX

    int cond;


    public MaquinaDeCafe() {

        cantidadAgua = 5000; //ml
        cantidadCafe = 1000; //gr
        cantidadCrema = 1500; //ml
        cantidadVasosTamaño = 50; //unidades
    }

    public MaquinaDeCafe(int cantidadAgua, int cantidadCafe, int cantidadCrema, int cantidadVasosTamaño) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadCafe = cantidadCafe;
        this.cantidadCrema = cantidadCrema;
        this.cantidadVasosTamaño = cantidadVasosTamaño;
    }
//MOSTRAMOS AGUA
    public int getCantidadAgua() {

        return cantidadAgua;
    }
//ESTABLECE AGUA
    public void setCantidadAgua(int cantidadAgua) {
        if(cantidadAgua <=0) {
            cantidadAgua = getCantidadAgua();
            System.out.println("La maquina se ha quedado sin agua");
        }

        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        if(cantidadCafe <=0) {
            cantidadCafe = getCantidadCafe();

            System.out.println("La maquina se ha quedado sin café");
        }
        this.cantidadCafe = cantidadCafe;
    }


    public int getCantidadCrema() {
        return cantidadCrema;
    }

    public void setCantidadCrema(int cantidadCrema) {
        if(cantidadCrema <=0) {
            cantidadCrema = getCantidadCrema();
            System.out.println("La maquina se ha quedado sin crema");
        }
        this.cantidadCrema = cantidadCrema;
    }

    public int getCantidadVasosTamaño() {
        return cantidadVasosTamaño;
    }

    public void setCantidadVasosTamaño(int cantidadVasosTamaño) {
        if(cantidadVasosTamaño <=0){
            cantidadVasosTamaño= getCantidadVasosTamaño();
            System.out.println("La máquina se ha quedado sin vasos");
        }
        this.cantidadVasosTamaño = cantidadVasosTamaño;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "cantidadAgua=" + cantidadAgua +
                ", cantidadCafe=" + cantidadCafe +
                ", cantidadCrema=" + cantidadCrema +
                ", cantidadVasosTamaño=" + cantidadVasosTamaño +
                '}';
    }

    public void servirAmericano(){
        System.out.println("Sirviendo café americano...");
        if (cantidadAgua <180 || cantidadCafe <15 || cantidadCrema <0 || cantidadVasosTamaño <1) {
            System.out.println("ERROR");
            setCantidadAgua(getCantidadAgua()+180);
            setCantidadCafe(getCantidadCafe()+15);
            setCantidadCrema(getCantidadCrema()+0);
            setCantidadVasosTamaño(getCantidadVasosTamaño()+1);
        }else {
            System.out.println("Café servido :D");


        }
    }


    public void servirExpreso(){
        System.out.println("Sirviendo café expreso...");
        if (cantidadAgua <120 || cantidadCafe <20 || cantidadCrema <0 || cantidadVasosTamaño <1) {
            System.out.println("ERROR");
            setCantidadAgua(getCantidadAgua()+120);
            setCantidadCafe(getCantidadCafe()+20);
            setCantidadCrema(getCantidadCrema()+0);
            setCantidadVasosTamaño(getCantidadVasosTamaño()+1);
        }else {
            System.out.println("Café servido :D");


        }

    }
    public void servirCapuchino(){
        System.out.println("Sirviendo café capuchino...");
        if (cantidadAgua <100 || cantidadCafe <14 || cantidadCrema <70 || cantidadVasosTamaño <1) {
            System.out.println("ERROR");
            setCantidadAgua(getCantidadAgua()+100);
            setCantidadCafe(getCantidadCafe()+14);
            setCantidadCrema(getCantidadCrema()+70);
            setCantidadVasosTamaño(getCantidadVasosTamaño()+1);
        }else {
            System.out.println("Café servido :D");


        }

    }
    public void revisarRecursos(){
        System.out.println("Los recursos restantes son: "
                + "Agua=" + getCantidadAgua() + "ml "
                + "Cafe=" + getCantidadCafe() + "gr "
                + "Crema=" + getCantidadCrema() +"gr "
                +"Vasos=" + getCantidadVasosTamaño());
    }
}
