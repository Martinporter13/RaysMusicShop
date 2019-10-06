import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.stock = new ArrayList<ISell>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int stockCount(){
        return stock.size();
    }

    public void addStockItem(ISell item){
        stock.add(item);
    }

    public void removeStockItem(){
        stock.clear();
    }

    public void removeStockByItem(ISell item){
        stock.remove(item);
    }
}


