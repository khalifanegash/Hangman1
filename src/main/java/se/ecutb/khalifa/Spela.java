package se.ecutb.khalifa;
import java.util.Scanner;
public class Spela {
    static Scanner scanner = new Scanner(System.in);
   private Hangman hangman;
   private boolean vinnare;
   public Spela (Hangman hangman){
       this.hangman = hangman;
   }
   public void spelPlats() {
       while (!vinnare && hangman.getAntalgissningar() <= hangman.getMaxgissningar()) {
           System.out.println(" Gissning : " + hangman.getAntalgissningar() + " / " + hangman.getMaxgissningar());
           System.out.println("gissa en bokstav:");
           vinnare = hangman.gissa(scanner.next());
       }
       if (hangman.getVisatord().toString().contains("_"))
               System.out.println(" spelet över! ");
           else {
               System.out.println( "\n Du vann");
           }
       }
}


