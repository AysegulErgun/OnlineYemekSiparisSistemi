//Müşteri model sınıfı.
package model;

import mediator.Mediator;

public class Musteri {
    private String isim;

    public Musteri(String isim){
        this.isim=isim;
    }

    public String getIsim(){
        return isim;
    }

    public void siparisVer(Mediator mediator, String yemek){
        mediator.siparisVer(this, yemek);

    }
}
