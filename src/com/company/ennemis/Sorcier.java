package com.company.ennemis;

import com.company.Ennemi;

public class Sorcier extends Ennemi {

    /**
     * @param pNomEnnemi : le nom de mon ennemi
     * @param pPointVieEnnemi : les points de vie de mon ennemi
     * @param pPointAttaqueEnnemi : les points d'attaque de mon ennemi
     * Le constructeur sorcier apelle son constructeur parent avec les mêmes paramètre
     */
    public Sorcier(String pNomEnnemi, int pPointVieEnnemi, int pPointAttaqueEnnemi) {
        super(pNomEnnemi, pPointVieEnnemi, pPointAttaqueEnnemi);
    }
}
