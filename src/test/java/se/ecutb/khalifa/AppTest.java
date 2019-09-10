package se.ecutb.khalifa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest 
{static Hangman  hangman = new Hangman("lejon");
static Spela spela = new Spela(hangman);
static String hemligtord;
boolean vinnare;
int no =0;
int max= 8;
char ord;
    @Before
    public void data(){
        hemligtord = hangman.getHemligtord();
        ord = 'l';

        while (!vinnare && no < max ){
            no++;
            for (int i = 0; i< hemligtord.toCharArray().length; i++){
                if (ord == hemligtord.toCharArray()[i]) {
                    vinnare=true;
                }
            }
            vinnare = false;
        }
    }
    @Test
    public void testgissa()
    {
        assertEquals(false,hangman.gissa(String.valueOf(ord)));
    }
}
