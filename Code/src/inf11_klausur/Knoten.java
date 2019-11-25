/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf11_klausur;

/**
 *
 * @author stefan
 */
public class Knoten extends Listenelement {

    // Attribute:
    private Spielfigur inhalt;
    private Listenelement nachfolger;
    
    /*
     * Aufgabe 6 
     */
    // Konstruktor :
    Knoten(Spielfigur s, Listenelement nachfolger) {
        this.inhalt = s;
        this.nachfolger = nachfolger;
    }

    // Aufgabe 7:
    @Override
    public int staerkeAusgeben() {
        return inhalt.getStaerke() + nachfolger.staerkeAusgeben();
    }
    
}
