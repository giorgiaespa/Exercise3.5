public class Triangolo implements Forma {
    private double base;
    private double altezza;
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void calcolaArea() {
        System.out.println("L'area del triangolo è: " + base * altezza / 2);
    }
}
