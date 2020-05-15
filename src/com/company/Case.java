package com.company;

import java.util.ArrayList;

public class Case {

    public String toString() {
        return "Je suis une case vide";

    }

    public void interaction(Personnage personnage){

        if (personnage instanceof Magicien) {
            System.out.println("Le magicien récupère le sort");
        } else if (personnage instanceof Guerrier) {
            System.out.println("Les guerriers ne possèdent pas de sort");
        }

    }


}
