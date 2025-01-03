//Arabulucu sınıfı.
package mediator;

import model.Musteri;

public class YemekSiparisiAraBulucu implements Mediator{
    @Override
    public void siparisVer(Musteri musteri, String yemek) {
        System.out.println("Müşteri " + musteri.getIsim() + " '" + yemek + "'siparişi verdi.");
        siparisHazirla(yemek);
    }

    @Override
    public void siparisHazirla(String yemek) {
        System.out.println("Restoran: '"+yemek+"'siparişi hazırlanıyor...");
        teslimatYap(yemek);
    }

    @Override
    public void teslimatYap(String yemek) {
        System.out.println("Teslimat çalışanı '"+yemek+"'siparişini teslim ediyor...");
    }
}
