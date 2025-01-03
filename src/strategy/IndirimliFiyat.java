//İndirimli fiyatlandırma stratejisi.
package strategy;

import java.awt.desktop.SystemEventListener;

public class IndirimliFiyat implements FiyatStratejisi{
    @Override
    public double fiyatHesapla(double temelFiyat) {
        return temelFiyat * 0.9; //%10 indirim
    }
}
