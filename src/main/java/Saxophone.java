public class Saxophone extends Instrument implements IPlay, ISell {

    private int valves;
    private double buyPrice;


    public Saxophone(String type, String material, String colour, int valves, double buyPrice) {
        super(type, material, colour);
        this.valves = valves;
        this.buyPrice = buyPrice;





    }

    public int getValves() {
        return valves;
    }

    public String getPlay(String sound) {
        return "saxophone noise" + sound;
    }

    public double getBuyPrice(double buyPrice) {
        return buyPrice;
    }

    public double getSellPrice(double sellPrice) {
        return buyPrice * 1.2;
    }
}
