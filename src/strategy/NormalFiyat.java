//Normal fiyatlandırma stratejisi.
package strategy;

public class NormalFiyat implements FiyatStratejisi{

    @Override
    public double fiyatHesapla(double temelFiyat) {
        return temelFiyat;
    }
}
