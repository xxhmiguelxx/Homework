public class Capuchino {

    private int agua=100;
    private int cafe=14;
    private int crema=70;

    public Capuchino() {
    }

    public Capuchino(int agua, int cafe, int crema) {
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
        return "Capuchino{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                '}';
    }
}
