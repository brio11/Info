package pierwszy;

public abstract class Pojemnik {

    private int pojemnosc;
    private String material;
    private String ksztalt;
    private String kolor = "bezbarwny";
    private int grubosc;
    static boolean maDno = true;
    private boolean maUchwyt = true;

    public Pojemnik() {
    }

    public Pojemnik(int pojemnosc, String material, String ksztalt, String kolor, int grubosc, boolean maUchwyt) {
        this.pojemnosc = pojemnosc;
        this.material = material;
        this.ksztalt = ksztalt;
        this.kolor = kolor;
        this.grubosc = grubosc;
        this.maUchwyt = maUchwyt;
    }

    public abstract void zrzuc();
    
    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getKsztalt() {
        return ksztalt;
    }

    public void setKsztalt(String ksztalt) {
        this.ksztalt = ksztalt;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

}
