package com.company;

public class Potion extends Case {
    protected String nomPotion;
    protected int viePotion;

    public Potion(String pNomPotion, int pViePotion){
        nomPotion = pNomPotion;
        viePotion = pViePotion;
    }

    public String toString() {
        return "nom: " + this.nomPotion + " point de vie + " + this.viePotion;

    }


}
