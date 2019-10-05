import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Saxophone saxophone;

    @Before
    public void before(){
        shop = new Shop("RaysMusicShop");
        guitar = new Guitar("electric", "metal", "blue", 6, 300);
        piano = new Piano("keyboard", "plastic", "purple", 32, 250);
        saxophone = new Saxophone("the best type", "solid gold", "gold", 8, 500000);
    }

    @Test
    public void canGetName(){
        assertEquals("RaysMusicShop", shop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddGuitar(){
        shop.addStockItem(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canAddPiano(){
        shop.addStockItem(piano);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canAddSaxophone(){
        shop.addStockItem(saxophone);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveAllStock(){
        shop.addStockItem(guitar);
        shop.addStockItem(piano);
        shop.addStockItem(saxophone);
        shop.removeStockItem();
        assertEquals(0, shop.stockCount());
    }

}
