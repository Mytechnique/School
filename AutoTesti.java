/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

/**
 *
 * @author h8599
 */
public class AutoTesti {
    
    public static void main(String args[]) {
        //luodaan olio Auto-luokasta
        Auto auto = new Auto();
        auto.setMerkki("Saab");
        auto.setVuosimalli(1900);
        auto.kiihdyta();
        System.out.println(auto.getTieto());
        
        // luodaan toinen olio Auto-luokasta
        Auto bil = new Auto("Audi", 2015, 200);
        System.out.println(bil.getTieto());
    }
}
