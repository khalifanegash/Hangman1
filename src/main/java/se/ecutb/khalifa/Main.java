package se.ecutb.khalifa;
import java.util.Scanner;
public class Main {
 static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean live = false;
        char svar;
        do {
            Hangman hangman = new Hangman("LEJON");
            Spela spela = new Spela(hangman);
            System.out.println(hangman.getHemligtord());
            for (String s : hangman.getVisatord()) {
                System.out.print(s + " ");
            }
            spela.spelPlats();
            System.out.println("vill du forsätter spela :(y/n)");
            svar = scanner.next().charAt(0);
            if(svar== 'y')
                live= true;
            else
                live= false;
        } while (live);

        }
    }






