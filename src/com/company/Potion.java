package com.company;

import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;

public class Potion extends Case implements iMateriel {
    protected int viePotion;


    public Potion(){

        super("");
        this.viePotion = 0;
    }


    /**
     * @param pNomPotion
     * @param pViePotion
     */
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

    /**
     * Interaction du personnage avec les sorts, les potions et les armes, passent par l'interface iMateriel
     * @param personnage
     */
    public void interactionMateriel(Personnage personnage) {

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
