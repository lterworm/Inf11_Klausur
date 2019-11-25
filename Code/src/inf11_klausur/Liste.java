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
public class Liste {
    
    // Attribute:
    private Listenelement erster;
    
    // Konstruktor:
    Liste(){
        erster = new Abschluss();
    }
    
    // Methoden:
    
    /*
     * Aufgabe 6:
     */
    public void vorneEinfuegen(Spielfigur s){
        erster = new Knoten(s, erster);
    }
    
    /*
     * Aufgabe 7:
     */
    public int gesamtstaerkeAusgeben(){
        return erster.staerkeAusgeben();
    }
}
