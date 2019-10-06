public class Guitar extends Instrument implements IPlay, ISell {

    private int noOfStrings;
    private double buyPrice;


    public Guitar(String type, String material, String colour, int noOfStrings, double buyPrice){
        super(type, material, colour);
        this.noOfStrings = noOfStrings;
        this.buyPrice = buyPrice;

    }

    public int getNoOfStrings() {
        return noOfStrings;
    }



    public String getPlay(String sound) {
        return "Guitar noise" + sound;
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
