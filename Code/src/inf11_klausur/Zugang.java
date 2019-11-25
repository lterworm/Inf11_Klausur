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
public class Zugang {
    
    // Attribute:
    private String name;
    private final String benutzername; 
    private String passwort;
    private Spielfigur figur;
    
    // Konstruktor:
    Zugang(String name, String benutzername, String passwort, String nameSpielfigur){
        this.name = name;
        this.benutzername = benutzername;
        this.passwort = passwort;
        figur = new Spielfigur(nameSpielfigur);
    }

    public String getBenutzername() {
        return benutzername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
    
}
