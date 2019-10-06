import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("guitar", "wood","red", 6, 300);
    }

    @Test
    public void canGetType(){
        assertEquals("guitar", guitar.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void canGetNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canGetPlay(){
        assertEquals("Guitar noise acoustic sound", guitar.getPlay(" acoustic sound"));
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(300, guitar.getBuyPrice(300), 0.0);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(360, guitar.getSellPrice(300), 0.0);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(60, guitar.getMarkUp(300), 0.0);
    }
}
