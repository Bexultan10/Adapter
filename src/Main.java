public class Main {
    public static void main(String[] args) {
        EuroRazetka razetka = new QazaqRazetka();
        Sega sega = new Sega();
        AmericanRazetka americanRazetka = new RazetkaAdapter(razetka);
        sega.playFifa(americanRazetka);
    }
}