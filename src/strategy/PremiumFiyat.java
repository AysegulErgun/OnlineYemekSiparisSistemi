//Premium fiyatlandırma stratejisi.
package strategy;

public class PremiumFiyat implements FiyatStratejisi {
    @Override
    public double fiyatHesapla(double temelFiyat) {
        return temelFiyat * 1.2; //%20 zam
    }
}
