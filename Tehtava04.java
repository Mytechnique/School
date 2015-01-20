/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

import java.util.Scanner;

/**
 *
 * @author Mythe
 */
public class Tehtava04 {
    public static void main(String args[]) {
        // Kysytään käyttäjältä vuosiluku
        int vuosi;
        System.out.print("Syötä vuosiluku: ");
        Scanner scanner = new Scanner(System.in);
        vuosi = scanner.nextInt();
        
        // Määritetään onko annettu vuosi karkausvuosi vai ei
        if (((vuosi % 4 == 0) && !(vuosi % 100 == 0)) || (vuosi % 400 == 0))
            System.out.println("Vuosi on karkausvuosi. ");
        else System.out.println("Vuosi ei ole karkausvuosi.");
    }
    
}
