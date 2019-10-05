import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void Piano(){
        piano = new Piano("grand", "marble", "green", 32, 1000);
    }

    @Test
    public void canGetType(){
        assertEquals("grand", piano.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("marble", piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("green", piano.getColour());
    }

    @Test
    public void canGetKeys(){
        assertEquals(32, piano.getKeys());
    }

    @Test
    public void canGetPlay(){
        assertEquals("Piano noise classic song", piano.getPlay(" classic song"));
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(1000, piano.getBuyPrice(1000), 0.0);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(1200, piano.getSellPrice(1000), 0.0);
    }
}
