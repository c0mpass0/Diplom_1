import org.junit.Test;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;


public class BunTest {

    @Test
    public void bunGetNameReturnsName(){
        Bun bun = new Bun("Злаковая", 2);
        String expectedName = "Злаковая";

        assertEquals("Имя булки не совпадает!", expectedName, bun.getName());
    }

    @Test
    public void bunGetPriceReturnsPrice(){
        Bun bun = new Bun("Злаковая", 2);
        float expectedPrice = 2;

        assertEquals("Цена булки не совпадает!", expectedPrice, bun.getPrice(), 0);
    }
}