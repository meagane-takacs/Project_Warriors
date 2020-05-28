package com.company.ennemis;

import com.company.Ennemi;
import com.company.Personnage;


public class Dragon extends Ennemi {

    public Dragon(){
        super("Dragon", 15, 4);
        this.pointVieEnnemi = 15;
    }


    /**
     * @param pNomEnnemi : le nom de mon ennemi
     * @param pPointVieEnnemi : les points de vie de mon ennemi
     * @param pPointAttaqueEnnemi : les points d'attaque de mon ennemi
     * Le constructeur dragon apelle son constructeur parent avec les mêmes paramètre
     */
    public Dragon(String pNomEnnemi, int pPointVieEnnemi, int pPointAttaqueEnnemi) {
        super(pNomEnnemi, pPointVieEnnemi, pPointAttaqueEnnemi);
    }

}

