public class Expreso {

    private int agua = 120;
    private int cafe = 20;
    private int crema = 0;

    public Expreso() {
    }

    public Expreso(int agua, int cafe, int crema) {
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
        return "Expreso{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                '}';
    }
}
