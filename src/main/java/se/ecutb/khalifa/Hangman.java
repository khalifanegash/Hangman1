package se.ecutb.khalifa;

import java.util.Arrays;

public class Hangman
{
private String hemligtord;
private String gissningord;
private int antalgissningar;
private int maxgissningar;
private char[]  bokstav;
private String felgissningar;
private String[] visatord;

public Hangman(String hemligtord ) {
    this.hemligtord = hemligtord;
    this.antalgissningar = 1;
    this.maxgissningar = 8;
    this.bokstav = hemligtord.toCharArray();
    this.visatord = new String[bokstav.length];
    this.felgissningar= "";
    Arrays.fill(visatord,"_");
}
public boolean gissa(String put){
        antalgissningar++;
        if (getVisatord().equals(put)) {
            return true;
        }
        for (int i = 0; i < bokstav.length; i++) {
            if (String.valueOf(bokstav[i]).equalsIgnoreCase(put)) {
                setVisatord(put, i);

            }
        }
        if ((bokstav.toString().contains(put)))
            setFelgissningar(put);
        for (String s : getVisatord())
        System.out.print(s + "");
    return false;

    }
    public String getHemligtord() {
        return hemligtord;
    }
    public void setHemligtord(String hemligtord) {
        this.hemligtord = hemligtord;
    }
    public String getGissningord() {
        return gissningord;
    }
    public void setGissningord(String gissningord) {
        this.gissningord = gissningord;
    }
    public int getAntalgissningar() {
        return antalgissningar;
    }
    public void setAntalgissningar(int antalgissningar) {
        this.antalgissningar = antalgissningar;
    }
    public int getMaxgissningar() {
        return maxgissningar;
    }
    public void setMaxgissningar(int maxgissningar) {
        this.maxgissningar = maxgissningar;
    }
    public char[] getBokstav() {
        return bokstav;
    }
    public String getFelgissningar() {
        return felgissningar;
    }
    public void setFelgissningar(String felgissningar) {
        this.felgissningar += felgissningar;
    }
    public void setBokstav(char[] bokstav) {
        this.bokstav = bokstav;
    }
    public String[] getVisatord() {

        return visatord;
    }
    public void setVisatord(String ord,int index) {
    String.valueOf(ord).toUpperCase();
        this.visatord [index]= ord.toUpperCase();
    }
}
