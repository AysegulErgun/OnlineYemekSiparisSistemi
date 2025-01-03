import builder.Yemek;
import mediator.Mediator;
import mediator.YemekSiparisiAraBulucu;
import model.Musteri;
import strategy.FiyatStratejisi;
import strategy.IndirimliFiyat;
import strategy.NormalFiyat;
import strategy.PremiumFiyat;

public class Main {
    public static void main(String[] args) {
        // Builder Deseni: builder.Yemek oluştur
        Yemek pizza = new Yemek.YemekBuilder()
                .isim("Pizza")
                .malzemeler("Peynir, Domates, Zeytin")
                .fiyat(100)
                .build();

        Yemek hamburger = new Yemek.YemekBuilder()
                .isim("Hamburger")
                .malzemeler("Et, Marul, Domates")
                .fiyat(70)
                .build();

        System.out.println(pizza);
        System.out.println(hamburger);

        // Strategy Deseni: Fiyatlandırma
        FiyatStratejisi normalFiyat = new NormalFiyat();
        FiyatStratejisi indirimliFiyat = new IndirimliFiyat();

        System.out.println("Pizza Normal Fiyat: " + normalFiyat.fiyatHesapla(100) + " TL");
        System.out.println("Hamburger İndirimli Fiyat: " + indirimliFiyat.fiyatHesapla(70) + " TL");

        // Mediator Deseni: Sipariş verme
        Mediator arabulucu = new YemekSiparisiAraBulucu();
        Musteri musteri = new Musteri("Ayşe");

        musteri.siparisVer(arabulucu, "Pizza");
    }
}
