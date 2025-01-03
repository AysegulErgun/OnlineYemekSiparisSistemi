package builder;

//Builder deseni : yemek sınıfları

public class Yemek {
    private  String isim;
    private  String malzemeler;
    private  double fiyat;

    //private constructor olustur
    private Yemek( YemekBuilder builder){
        this.isim = builder.isim;
        this.malzemeler = builder.malzemeler;
        this.fiyat = builder.fiyat;
    }

    public String getIsim() {
        return isim;
    }
    public String getMalzemeler() {
        return malzemeler;
    }
    public double getFiyat() {
        return fiyat;
    }
    @Override
    public String toString() {
        return "Yemek: " + isim + ", Malzemeler: " + malzemeler + ", Fiyat: " + fiyat + " TL";
    }


    public static class YemekBuilder {
        private String isim;
        private String malzemeler;
        private double fiyat;

        public YemekBuilder isim(String isim){
            this.isim=isim;
            return this;
        }
        public YemekBuilder malzemeler(String malzemeler){
            this.malzemeler = malzemeler;
            return this;
        }
        public YemekBuilder fiyat(double fiyat){
            this.fiyat=fiyat;
            return this;
        }
        public Yemek build(){
            return new Yemek(this);
        }


    }

}
