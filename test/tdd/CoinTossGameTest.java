package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossGameTest {

    private CoinTossGame coinTossGame;
    @BeforeEach

    public void setUp(){

        coinTossGame=new CoinTossGame();
    }

    @Test
    public void testThatGameExists() {

        assertNotNull(coinTossGame);
    }

    @Test
    public void testMenuOption_1(){

        String menu = CoinTossGame.geGameMenu();
        assertTrue(menu.equals("""
                1.Toss Coin
                2.Exit Game
                3.Yes
                4.New
               
                
                """));


    }
}
