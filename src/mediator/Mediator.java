//Arabulucu arayüzü.
package mediator;

import model.Musteri;

public interface Mediator {
    void siparisVer(Musteri musteri, String yemek);
    void siparisHazirla(String yemek);
    void teslimatYap(String yemek);
}
