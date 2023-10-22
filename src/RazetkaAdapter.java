public class RazetkaAdapter implements AmericanRazetka {
    EuroRazetka euroRazetka;
    public RazetkaAdapter(EuroRazetka euroRazetka) {
        this.euroRazetka = euroRazetka;
    }
    @Override
    public void getPower() {
        euroRazetka.getPower();
    }
}