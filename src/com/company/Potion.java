package com.company;

import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;

public class Potion extends Case implements Materiel {
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

            personnage.addVie(viePotion);
            System.out.println("Votre " + personnage + " récupère " + viePotion + " points de vie");

    }


    @Override
    public String toString() {
        return "Case Potion {" +
                "viePotion=" + viePotion +
                '}';
    }
}
