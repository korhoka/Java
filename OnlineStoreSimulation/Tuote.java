/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

/**
 *
 * @author Eero
 */
public class Tuote {

private String tuote;
    private double hinta;
    private int lkm;
   
    
    public Tuote(String tuote, int lkm, double hinta){
        this.tuote=tuote;
        this.lkm=lkm;
        this.hinta=hinta;
    }

  
    public String getTuote() {
        return tuote;
    }

    public void setTuote(String tuote) {
        this.tuote = tuote;
    }

    public double getHinta() {
        return this.hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public int getLkm() {
        return lkm;
    }

    public void setLkm(int lkm) {
        this.lkm = lkm;
    }
    
@Override
    public String toString(){
        return (tuote + " "+ hinta);
    }
    
    
}

