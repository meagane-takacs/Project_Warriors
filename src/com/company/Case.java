package com.company;

import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;

public class Case {

    protected String nomCase;

    public Case() {
        this("");
    }

    public Case(String nomCase){
        this.nomCase = nomCase;
    }


    @Override
    public String toString() {
        return "Case vide {On passe au tour suivant}";
    }
}
