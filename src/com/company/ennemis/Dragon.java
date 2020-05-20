package com.company.ennemis;

import com.company.Ennemi;
import com.company.Personnage;


public class Dragon extends Ennemi {

    public Dragon(){
        super("Dragon", 15, 4);
        this.pointVieEnnemi = 15;
    }


    public Dragon(String pNomEnnemi, int pPointVieEnnemi, int pPointAttaqueEnnemi) {
        super(pNomEnnemi, pPointVieEnnemi, pPointAttaqueEnnemi);
    }

}

