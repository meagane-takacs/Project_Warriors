package com.company;

import com.company.personnages.Guerrier;

public class Potion extends Case {
    protected int viePotion;

    public Potion(){

        super("");
        this.viePotion = 0;
    }


    public Potion(String pNomPotion, int pViePotion){
        super(pNomPotion);
        viePotion = pViePotion;
    }

    public int getViePotion() {
        return viePotion;
    }

    public void setViePotion(int viePotion) {
        this.viePotion = viePotion;
    }

    public void interaction(Personnage personnage) {

        if (personnage instanceof Guerrier) {
            personnage.addVie(viePotion);
            System.out.println("Votre Guerrier récupère " + viePotion + " points de vie");
        }

    }


    @Override
    public String toString() {
        return "Case Potion{" +
                "viePotion=" + viePotion +
                '}';
    }
}
