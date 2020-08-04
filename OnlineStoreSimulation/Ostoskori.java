/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

import java.util.ArrayList;

/**
 *
 * @author Eero
 */
public class Ostoskori {

    ArrayList<Tuote> Okori = new ArrayList<Tuote>();

    public void lis‰‰Ostoskoriin(Tuote tuote) {
        Okori.add(tuote);
        System.out.println("Tuote " + tuote.getTuote() + " lis‰tty ostoskoriin");
    }

    public void tulostaOstoskori() {
        System.out.println("Ostoskorisi sis‰lt‰‰: ");
        for (Tuote i : Okori) {
            System.out.println(i + "Ä");
        }
    }

    public double korinSumma() {
        double summa = 0;
        for (Tuote i : Okori) {
            summa = summa + i.getHinta();
        }
        return summa;
    }
    public void tyhjenn‰() {
        Okori.clear();
        }
    }
    


