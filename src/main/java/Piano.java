public class Piano extends Instrument implements IPlay, ISell {

    private int keys;
    private double buyPrice;



    public Piano(String type, String material, String colour, int keys, double buyPrice){
        super(type, material, colour);
        this.keys = keys;
        this.buyPrice = buyPrice;

    }

    public int getKeys() {
        return keys;
    }



    public String getPlay(String sound) {
        return "Piano noise" + sound;
    }

    public double getBuyPrice(double buyPrice) {
        return buyPrice;
    }

    public double getSellPrice(double sellPrice) {
        return buyPrice * 1.2;
    }

    public double getMarkUp(double markUp) {
        return getSellPrice(markUp) - buyPrice;
    }
}
