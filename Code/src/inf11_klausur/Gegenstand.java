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
public abstract class Gegenstand {
    
    // Attribute:
    protected String name;
    protected int gewicht;
    
    Gegenstand(String name, int gewicht){
        this.name = name;
        this.gewicht = gewicht;
    }
    
    
}
