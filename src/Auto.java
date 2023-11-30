public class Auto {

    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;
    private  int km;

    

    public Auto(int cilindrata, String targa, String marca, String modello, int km) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.km = km;
    }


    public void controlloKm() {
        if (km > 400000) {
            System.out.println("Scala un pò di km");
        } else {
            System.out.println("Puoi ancora usarla");
        }
    }


    public int getKm() { return km;}

    public void setKm(int km) { this.km = km;}


    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }



    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }



    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
