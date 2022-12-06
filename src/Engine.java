public class Engine extends Test {
   private int pojemosc;
   private String rodzaj;
   private int moc;
    public String pojemnosc (int pojemosc){
        return pojemosc+"litry";
    }

    public Engine(int pojemosc, String rodzaj, int moc) {
        this.pojemosc = pojemosc;
        this.rodzaj = rodzaj;
        this.moc = moc;
    }

    public int getPojemosc() {
        return pojemosc;
    }

    public void setPojemosc(int pojemosc) {
        this.pojemosc = pojemosc;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public Engine() {
    }
        @Override
    public String toString() {
        return "Engine{" +
                "pojemosc=" + pojemosc +
                ", rodzaj='" + rodzaj + '\'' +
                ", moc=" + moc +
                '}';
    }
}
