package com.company;

public class Guerrier{
    //Stocke le nom de notre guerrier
    private String nomGuerrier;
    //Stocke l'img du guerrier
    private String imgGuerrier;
    //Stocke le niveau de vie du guerrier
    private int niveauVieGuerrier;
    // Stocke la force de l'attaque du guerrier
    private int forceAttaqueGuerrier;

    public String toString() {
        return "nom guerrier:" + this.nomGuerrier + ", image du guerrier : " + this.imgGuerrier;
    }



    // * Getters * \\

    public String getNomGuerrier() {
        return nomGuerrier;
    }

    public String getImgGuerrier(){
        return imgGuerrier;
    }

    public int getNiveauVieGuerrier() {
        return niveauVieGuerrier;
    }

    public int getForceAttaqueGuerrier() {
        return forceAttaqueGuerrier;
    }



    // * Setters * \\

    public void setNomGuerrier(String pNomGuerrier) {
        nomGuerrier = pNomGuerrier;
    }

    public void setImgGuerrier(String pImgGuerrier) {
        imgGuerrier = pImgGuerrier;
    }

    public void setNiveauVieGuerrier(int pNiveauVieGuerrier) {
        niveauVieGuerrier = pNiveauVieGuerrier;
    }

    public void setForceAttaqueGuerrier(int pForceAttaqueGuerrier) {
        forceAttaqueGuerrier = pForceAttaqueGuerrier;
    }




    // * Constructeur sans paramètre * \\

    public Guerrier () {
        System.out.println("Creation d'un guerrier!");
        nomGuerrier="Inconnu";
        imgGuerrier = "Inconnu";
        niveauVieGuerrier=0;
        forceAttaqueGuerrier=0;
    }



    // * Constructeur avec paramètre Nom * \\

    public Guerrier (String pNomGuerrier){
        System.out.println("Creation d'un guerrier avec un paramètre nom!");
        nomGuerrier= pNomGuerrier;
        imgGuerrier = "Inconnu";
        niveauVieGuerrier = 0;
        forceAttaqueGuerrier = 0;
    }



    // * Constructeur avec paramètre Nom, image, niveau de vie, force attaque * \\

    public Guerrier (String pNomGuerrier, String pImgGuerrier, int pNiveauVieGuerrier,int pForceAttaqueGuerrier){
        System.out.println("Creation d'un guerrier avec un paramètre nom, image, niveau de vie et force d'attaque!");
        nomGuerrier= pNomGuerrier;
        imgGuerrier = pImgGuerrier;
        niveauVieGuerrier = pNiveauVieGuerrier;
        forceAttaqueGuerrier = pForceAttaqueGuerrier;
    }
}