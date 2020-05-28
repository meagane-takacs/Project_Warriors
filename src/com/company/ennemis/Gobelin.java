package com.company.ennemis;

import com.company.Ennemi;

public class Gobelin extends Ennemi {

    /**
     * @param pNomEnnemi : le nom de mon ennemi
     * @param pPointVieEnnemi : les points de vie de mon ennemi
     * @param pPointAttaqueEnnemi : les points d'attaque de mon ennemi
     * Le constructeur gobelin apelle son constructeur parent avec les mêmes paramètre
     */
    public Gobelin(String pNomEnnemi, int pPointVieEnnemi, int pPointAttaqueEnnemi) {
        super(pNomEnnemi, pPointVieEnnemi, pPointAttaqueEnnemi);
    }
}
