/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf11_klausur;

import java.util.Random;

/**
 *
 * @author stefan
 */
public class Trank extends Gegenstand {
    
    // Attribute:
    private final int geschicklichkeit;
    private final Random random;
    
    // Konstruktor:
    Trank(String name, int gewicht){
        super(name, gewicht);
        random = new Random();
        geschicklichkeit = random.nextInt(10);    
    }
    
}
