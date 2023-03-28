public class Americano {

    private int agua = 180;
    private int cafe = 15;
    private int crema = 0;


    public Americano() {
    }

    public Americano(int agua, int cafe, int crema) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    @Override
    public String toString() {
        return "Americano{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                '}';
    }
}
