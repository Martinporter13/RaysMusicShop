public abstract class Instrument {

    private String type;
    private String material;
    private String colour;

    public Instrument(String type, String material, String colour){
        this.type = type;
        this.material = material;
        this.colour = colour;

    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
