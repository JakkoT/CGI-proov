package org.example.cgi_sb;

public class Film {
    private String nimi;
    private int vanusepiirang;
    private String keel;
    private int id;

    public Kohad getKohad() {
        return kohad;
    }

    private Kohad kohad = new Kohad();

    public Film(String nimi, int vanusepiirang, String keel, int id) {
        this.nimi = nimi;
        this.vanusepiirang = vanusepiirang;
        this.keel = keel;
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }
    public int getVanusepiirang() {
        return vanusepiirang;
    }
    public String getKeel() {
        return keel;
    }
    public int getId(){
        return id;
    }


    @Override
    public String toString() {
        return "Film{" +
                "nimi='" + nimi + '\'' +
                ", vanusepiirang=" + vanusepiirang +
                ", keel='" + keel + '\'' +
                '}';
    }
}
