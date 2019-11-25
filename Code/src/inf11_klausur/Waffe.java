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
public class Waffe extends Gegenstand{
    
    // Attribute:
    private final int angriffsbonus;
    private final Random random;
    
    // Konstruktor:
    Waffe(String name, int gewicht){
        super(name, gewicht);
        random = new Random();
        angriffsbonus = random.nextInt(10);
    }
    
}
