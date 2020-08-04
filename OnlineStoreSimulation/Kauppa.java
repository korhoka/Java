/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eero
 */
public class Kauppa {

    static Scanner scanner = new Scanner(System.in, "iso-8859-1");

    public static void main(String[] args) {
        Ostoskori kori = new Ostoskori();
        Pankkikortti pkortti = new Pankkikortti();
        pkortti.setSaldo(100);
        System.out.println("Rahaa tilill‰: " + pkortti.getSaldo() + "Ä");
        System.out.println("---------------------");
        // Luodaan mappi eri ryhmille miehet, naiset, lapset...
        Map<String, Map> groups = new HashMap<>();
        // Luodaan mappi kategorioiden tallentamista ryhm‰‰n varten
        Map<String, Map> newGroup = new HashMap<>();
        // Luodaan mappi itemien ker‰‰mist‰ varten
        Map<String, Tuote> newItems = new HashMap<>();
        newItems.put("Pese Vessa", new Tuote("Pese Vessa", 10, 100));
        newGroup.put("Pesu", newItems);
        newItems = new HashMap<>();
        newItems.put("Siivoa Lattia", new Tuote("Siivoa Lattia", 10, 100));
        newGroup.put("Siivous", newItems);
        groups.put("Duunit", newGroup);
        newItems = new HashMap<>();
        newGroup = new HashMap<>();
        newItems.put("Chinot", new Tuote("Chinot", 10, -49.99));
        newItems.put("Farkut", new Tuote("Farkut", 10, -69.99));
        newItems.put("Shortsit", new Tuote("Shortsit", 10, -39.99));
        newItems.put("College-housut", new Tuote("College-housut", 10, -29.99));
        // Lis‰t‰‰n kategoria ryhm‰‰n
        newGroup.put("Housut", newItems);
        // Voidaan tyhjent‰‰ newItems ja t‰ytt‰‰ uudestaan uuden kategorian tuotteilla
        newItems = new HashMap<>();
        newItems.put("T-paita", new Tuote("T-paita", 10, -14.99));
        newItems.put("Kauluspaita", new Tuote("Kauluspaita", 10, -34.99));
        newItems.put("Pitk‰hihainen paita", new Tuote("Pitk‰hihainen paita", 10, -29.99));
        newItems.put("Hihaton paita", new Tuote("Hihaton paita", 10, -19.99));
        newGroup.put("Paidat", newItems);
        newItems = new HashMap<>();
        newItems.put("Bokserit", new Tuote("Bokserit", 10, -14.99));
        newItems.put("Alushousut", new Tuote("Alushousut", 10, -13.99));
        newItems.put("Bokserishortsit", new Tuote("Bokserishortsit", 10, -22.99));
        newGroup.put("Alusvaatteet", newItems);
        newItems = new HashMap<>();
        newItems.put("Talvitakki", new Tuote("Talvitakki", 10, -139.99));
        newItems.put("Untuvatakki", new Tuote("Untuvatakki", 10, -249.99));
        newItems.put("Tuulitakki", new Tuote("Tuulitakki", 10, -89.99));
        newItems.put("Kuoritakki", new Tuote("Kuoritakki", 10, -149.99));
        newGroup.put("Takit", newItems);
        newItems = new HashMap<>();
        newItems.put("Lippis", new Tuote("Lippis", 10, -14.99));
        newItems.put("Pipo", new Tuote("Pipo", 10, -9.99));
        newGroup.put("P‰‰hineet", newItems);
        newItems = new HashMap<>();
        newItems.put("Kaulakoru", new Tuote("Kaulakoru", 10, -39.99));
        newItems.put("Kultainen rannekello", new Tuote("Kultainen rannekello", 10, -399.99));
        newItems.put("Ter‰ksinen rannekello", new Tuote("Ter‰ksinen rannekello", 10, -199.99));
        newItems.put("Nahkainen rannekello", new Tuote("Nahkainen rannekello", 10, -249.99));
        newGroup.put("Korut", newItems);
        newItems = new HashMap<>();
        newItems.put("Nahkasalkku", new Tuote("Nahkasalkku", 10, -69.99));
        newItems.put("Reppu", new Tuote("Reppu", 10, -39.99));
        newGroup.put("Laukut", newItems);
        newItems = new HashMap<>();
        newItems.put("Kaulahuivi", new Tuote("Kaulahuivi", 10, -14.99));
        newItems.put("Tuubihuivi", new Tuote("Tuubihuivi", 10, -14.99));
        newItems.put("Raitahuivi", new Tuote("Raitahuivi", 10, -14.99));
        newGroup.put("Huivit", newItems);
        newItems = new HashMap<>();
        newItems.put("Nahkakeng‰t", new Tuote("Nahkakeng‰t", 10, -109.99));
        newItems.put("Tennarit", new Tuote("Tennarit", 10, -84.999));
        newItems.put("Sandaalit", new Tuote("Sandaalit", 10, -29.99));
        newGroup.put("Keng‰t", newItems);
        newItems = new HashMap<>();
        newItems.put("Juoksukeng‰t", new Tuote("Juoksukeng‰t", 10, -139.99));
        newItems.put("Juoksuhousut", new Tuote("Juoksuhousut", 10, -39.99));
        newItems.put("Urheilupaita", new Tuote("Urheilupaita", 10, -19.99));
        newGroup.put("Urheilu", newItems);
        // Jatketaan samalla kaavalla, kunnes lopuksi ryhm‰ on valmis
        groups.put("Miehet", newGroup);
        groups.put("Pojat", newGroup);
        // Aloitetaan uusi ryhm‰
        newGroup = new HashMap<>();
        newItems = new HashMap<>();
        //naisten kuteet ja muut
        newItems.put("Farkut", new Tuote("Farkut", 10, -110.00));
        newItems.put("Legginsit", new Tuote("Legginsit", 10, -60.00));
        newItems.put("Sukkahousut", new Tuote("Sukkahousut", 10, -10.00));
        newGroup.put("Housut", newItems);
        newItems = new HashMap<>();
        newItems.put("Valkoinen T-paita", new Tuote("Valkoinen T-paita", 10, -14.99));
        newItems.put("Kukka toppi", new Tuote("Kukka toppi", 10, -14.99));
        newItems.put("Sininen pitk‰hihainen", new Tuote("Sininen pitk‰hihainen", 10, -19.99));
        newGroup.put("Paidat", newItems);
        newItems = new HashMap<>();
        newItems.put("Farkkumekko", new Tuote("Farkkumekko", 10, -25.00));
        newItems.put("Minihame", new Tuote("Minihame", 10, -10.00));
        newItems.put("Mustamekko", new Tuote("Mustamekko", 10, -24.95));
        newGroup.put("Mekot", newItems);
        newItems = new HashMap<>();
        newItems.put("Punaiset alushousut", new Tuote("Punaiset alushousut", 10, -9.95));
        newItems.put("Mustat alushousut", new Tuote("Mustat alushousut", 10, -9.95));
        newGroup.put("Alusvaatteet", newItems);
        newItems = new HashMap<>();
        newItems.put("Farkkutakki", new Tuote("Farkkutakki", 10, -55.95));
        newItems.put("Ruskea kangastakki", new Tuote("Ruskea kangastakki", 10, -34.95));
        newItems.put("Musta pikkutakki", new Tuote("Musta pikkutakki", 10, -24.95));
        newGroup.put("Takit", newItems);
        newItems = new HashMap<>();
        newItems.put("Juoksukeng‰t", new Tuote("Juoksukeng‰t", 10, -59.95));
        newItems.put("Sandaalit", new Tuote("Sandaalit", 10, -19.95));
        newItems.put("Mustat tennarit", new Tuote("Mustat tennarit", 10, -24.95));
        newItems.put("Punaiset juhlakeng‰t", new Tuote("Punaiset juhlakeng‰t", 10, -34.95));
        newGroup.put("Keng‰t", newItems);
        newItems = new HashMap<>();
        newItems.put("Juoksuhousut", new Tuote("Juoksuhousut", 10, -25.00));
        newItems.put("Valkoinen urheilupaita", new Tuote("Valkoinen urheilupaita", 10, -14.99));
        newGroup.put("Urheilu", newItems);
        newItems = new HashMap<>();
        newItems.put("Timantti kaulakoru", new Tuote("Timantti kaulakoru", 10, -99.99));
        newGroup.put("Korut", newItems);
        newItems = new HashMap<>();
        newItems.put("Kaulahuivi", new Tuote("Kaulahuivi", 10, -15.00));
        newGroup.put("Huivit", newItems);
        newItems = new HashMap<>();
        newItems.put("Punainen lippalakki", new Tuote("Punainen lippalakki", 10, -15.99));
        newGroup.put("P‰‰hineet", newItems);
        newItems = new HashMap<>();
        newItems.put("Harmaat olohousut", new Tuote("Harmaat olohousut", 10, -24.95));
        newGroup.put("Oloasut", newItems);
        newItems = new HashMap<>();
        newItems.put("Harmaa huppari", new Tuote("Harmaa huppari", 10, -24.95));
        newGroup.put("Oloasut", newItems);

        groups.put("Tytˆt", newGroup);
        groups.put("Naiset", newGroup);

        while (true) {
            System.out.println("Valitse ryhm‰:");
            for (String group : groups.keySet()) {
                System.out.println("  " + group);
            }
            String input = getInput();
            if (input.equals("x")) {
                break;
            }
            Map<String, Map> get = groups.get(input);
            if (get == null) {
                System.out.println("Ryhm‰‰ " + input + " ei ole!");
                continue;
            }

            while (true) {
                System.out.println("Valitse kategoria:");
                for (String cat : get.keySet()) {
                    System.out.println("  " + cat);
                }

                String input1 = getInput();
                if (input1.equals("x")) {
                    break;
                }
                Map<String, Tuote> get1 = get.get(input1);
                if (get1 == null) {
                    System.out.println("Kategoriaa " + input1 + " ei ole!");
                    continue;
                }
                while (true) {
                    System.out.println("Valitse tuote:");
                    for (String item : get1.keySet()) {
                        System.out.println((get1.get(item)) + "Ä");

                    }
                    String input2 = getInput();
                    if (input2.equals("x")) {
                        break;

                    }

                    Tuote tuote = get1.get(input2);
                    if (tuote == null) {
                        System.out.println("---------------------------------");
                        System.out.println("Tuotetta " + input2 + " ei ole!");
                        System.out.println("---------------------------------");
                        continue;
                    }
                    if (tuote.getTuote()=="Pese Vessa" || tuote.getTuote()=="Siivoa Lattia") {
                        pkortti.setSaldo(pkortti.getSaldo()+tuote.getHinta());
                        System.out.println("Rahaa tilill‰: " + pkortti.getSaldo() + "Ä");
                        System.out.println("---------------------");
                        break;
                    }
                   
                    if (tuote.getLkm() == 0) {
                        System.out.println("Tuote " + input2 + " on loppunut!");
                    }
                    double hinta = tuote.getHinta();
                    if (hinta == 0) {
                        System.out.println("---------------------------------");
                        System.out.println("Tuotetta " + input2 + " ei ole!");
                        System.out.println("---------------------------------");
                        continue;
                    } else {
                        kori.lis‰‰Ostoskoriin(tuote);
                        kori.tulostaOstoskori();
                        System.out.println("Yht. " + kori.korinSumma() + "Ä");
                        System.out.println("Haluatko siirty‰ maksamaaan?(k/e)");
                        char vastaus = scanner.nextLine().charAt(0);
                        if (vastaus == 'k') {
                            if (pkortti.pinkoodi() == false) {
                                System.out.println("Tilin saldo: " + pkortti.getSaldo() + "Ä");
                                kori.tyhjenn‰();
                                break;
                            } else {
                                if (pkortti.maksu(kori.korinSumma()) == true) {
                                    tuote.setLkm(tuote.getLkm() - 1);
                                    pkortti.setSaldo(pkortti.getSaldo() + kori.korinSumma());
                                    System.out.println("Tilin saldo: " + pkortti.getSaldo() + "Ä");
                                    kori.tyhjenn‰();
                                    break;
                                } else {
                                    System.out.println("Tilin saldo: " + pkortti.getSaldo() + "Ä");
                                    kori.tyhjenn‰();
                                    break;

                                }
                            }

                        }
                    }
                }
            }
        }
    }

    static String getInput() {
        System.out.println("x lopettaa tai menee takaisinp‰in");
        System.out.print("> ");
        return scanner.nextLine();
    }
}
