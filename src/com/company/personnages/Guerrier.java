package com.company.personnages;

import com.company.Personnage;



public class Guerrier extends Personnage {




    // * Constructeur sans paramètre * \\

    public Guerrier () {
        System.out.println("Creation d'un guerrier!");
        setNomPerso("Inconnu");
        setImgPerso("Inconnu");
        setNiveauVieMin(5);
        setNiveauVieMax(10);
        setForceMin(5);
        setForceMax(10);
    }



    // * Constructeur avec paramètre Nom * \\

    public Guerrier (String pNomGuerrier){
        System.out.println("Creation d'un guerrier avec un paramètre nom!");
        setNomPerso(pNomGuerrier);
        setImgPerso("Inconnu");
        setNiveauVieMin(5);
        setNiveauVieMax(10);
        setForceMin(5);
        setForceMax(10);
    }



    // * Constructeur avec paramètre Nom, image, niveau de vie, force attaque * \\

    public Guerrier (String pNomGuerrier, String pImgGuerrier, int pNiveauVieGuerrier,int pForceAttaqueGuerrier){
        System.out.println("Creation d'un guerrier avec un paramètre nom, image, niveau de vie et force d'attaque!");
        setNomPerso(pNomGuerrier);
        setImgPerso(pImgGuerrier);
        setNiveauVieMin(pNiveauVieGuerrier);
        setNiveauVieMax(pForceAttaqueGuerrier);
    }

}