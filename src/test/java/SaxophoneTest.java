import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("brass", "brass", "gold", 6, 400);
    }

    @Test
    public void canGetType(){
        assertEquals("brass", saxophone.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void canGetValves(){
        assertEquals(6, saxophone.getValves());
    }

    @Test
    public void canGetPlay(){
        assertEquals("saxophone noise saxophone sound", saxophone.getPlay(" saxophone sound"));
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(400, saxophone.getBuyPrice(400), 0.0);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(480, saxophone.getSellPrice(400), 0.0);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(80, saxophone.getMarkUp(400), 0.0);
    }

}
