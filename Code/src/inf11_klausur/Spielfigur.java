/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf11_klausur;

import java.util.ArrayList;

/**
 *
 * @author stefan
 */
public class Spielfigur {
    
    // Attribute:
    private String name;
    private int geschicklichkeit, staerke, aussehen;
    
    /*
     * In der Aufgabenstellung war angegeben, dass eine Spielfigur maximal 20
     * Gegenstaende mit sich tragen kann. Der passende Datentyp ist hier das
     * Feld. In meiner Umsetzung kann eine Spielfigur unbegrenzt viele Gegen-
     * staende aufnehmen. Hierfür ist der Datentyp ArrayList mit "Generics" 
     * (sofern in der Aufgabenstellung nicht das Kompositum erforderlich ist)
     * die einfachste Umsetzungsmöglichkeit.
     */
     private ArrayList <Gegenstand> gegenstaende;
     
//     Datentyp Feld (wie laut Aufgabenstellung gefordert:
//    private Gegenstand [] gegenstaende;
     
     
    // Konstruktor:
    Spielfigur(String name) {
        this.name = name;
        gegenstaende = new ArrayList <Gegenstand> ();
        gegenstaende.add(new Trank("Zaubertrank", 3));
        gegenstaende.add(new Waffe("Axt", 7));
    }
    /* 
     * Passender Konstruktor mit Datentyp Feld - Aufgabe 3:
     */
//    Spielfigur(String name) {
//        this.name = name;
//        gegenstaende = new Gegenstand[20];
//        gegenstaende[0] = new Trank("Zaubertrank", 3);
//        gegenstaende[1] = new Waffe("Axt", 7);
//    }

    public int getGeschicklichkeit() {
        return geschicklichkeit;
    }

    public void setGeschicklichkeit(int geschicklichkeit) {
        this.geschicklichkeit = geschicklichkeit;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getAussehen() {
        return aussehen;
    }

    public void setAussehen(int aussehen) {
        this.aussehen = aussehen;
    }
    
    public void gegenstandAufnehmen(Gegenstand g){
        gegenstaende.add(g);
    }
    
    public void gegenstandAbstossen(Gegenstand g){
        gegenstaende.remove(g);
    }
    
}
