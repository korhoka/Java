/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

import java.util.Scanner;

/**
 *
 * @author Eero
 */
public class Pankkikortti {

    static Scanner lukija = new Scanner(System.in);
    private double saldo;
    private int koodi = 1234;

    public boolean pinkoodi() {
        System.out.println("Anna kortin PIN koodi: ");
        int pkoodi = lukija.nextInt();
        int a = 0;
        if (pkoodi != koodi) {
            do {
                a++;
                System.out.println("V‰‰r‰ PIN koodi!");
                System.out.println("Anna PIN koodi uudestaan: ");
                pkoodi = lukija.nextInt();
            } while (pkoodi != koodi && a < 2);
            System.out.println("Syˆtit PIN koodin liian monta kertaa v‰‰rin.");
            System.out.println("Maksu ep‰onnistui!");
            return false;
        }
        return true;
    }

    public boolean maksu(double summa) {
        if ((summa + getSaldo()) < 0) {
            System.out.println("Kortin kate ei riit‰.");
            System.out.println("Maksu ep‰onnistui!");
            return false;
        }
        if ((summa + getSaldo()) > 0) {
            System.out.println("Maksu onnistui!");
        }
        return true;

    }

    public double getSaldo() {
        return saldo;
    }

    public int getKoodi() {
        return koodi;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setKoodi(int koodi) {
        this.koodi = koodi;
    }

}
