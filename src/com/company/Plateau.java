package com.company;

import com.company.ennemis.Dragon;
import com.company.ennemis.Gobelin;
import com.company.ennemis.Sorcier;
import com.company.equipement_guerrier.Epee;
import com.company.equipement_guerrier.Massue;
import com.company.equipement_guerrier_et_magicien.GrandePotion;
import com.company.equipement_guerrier_et_magicien.PotionStandard;
import com.company.equipement_magicien.BouleDeFeu;
import com.company.equipement_magicien.Eclair;

import java.util.ArrayList;


public class Plateau {
    private int nbCasePlateau;
    private int posJoueur;
    ArrayList<Case> cases;


    public Plateau() {
        nbCasePlateau = 64;
        posJoueur = 0;
        cases = new ArrayList<Case>();
        remplirPlateau();
    }

    public int lancerDes() {
        int dice = 0;
        dice = 1 + (int) (Math.random() * 6);
        System.out.println(" ");
        System.out.println("J'ai tiré le numéro " + dice);
        return dice;
    }

    /*
    Parametre : nombre de case à avancer
    Retour : nouvel position du joueur
     */

    /**
     *
     * @param nb
     * @return
     * @throws PersonnageHorsPlateauException
     */
    public int avancerJoueur(int nb) throws PersonnageHorsPlateauException {
        posJoueur = posJoueur + nb;
        if (posJoueur > nbCasePlateau) {
            throw new PersonnageHorsPlateauException();
        }
        System.out.println("Mon pion avance donc de " + nb);
        return posJoueur;
    }

    /**
     *
     * @param monPerso
     * @return
     */
    public int tourDeJeu(Personnage monPerso) {
        int nbLancerDes = lancerDes();
        try {
            avancerJoueur(nbLancerDes);
        } catch (PersonnageHorsPlateauException e) {
            //e.printStackTrace();
            System.out.println("On revient à la case 64");
            posJoueur = nbCasePlateau;

        }
        System.out.println("Je suis à la case " + posJoueur);
        Case maCase = cases.get(posJoueur - 1); //-1 Pour que la case 1 du plateau corresponde a l'index 0
        System.out.println(maCase);
        maCase.interaction(monPerso);
        return nbLancerDes;

    }

    /**
     *
     * @param monPerso
     */
    public void jeu(Personnage monPerso) {
        while (posJoueur < nbCasePlateau) {
            tourDeJeu(monPerso);
        }

    }

    private void remplirPlateau() {

        // Case 1
        cases.add(new Eclair("Eclair", 2));

        // Case 2
        cases.add(new Massue("Massue", 3));

        // Case 3
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 4
        cases.add(new Eclair("Eclair", 2));

        // Case 5
        cases.add(new Massue("Massue", 3));

        // Case 6
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 7
        cases.add(new PotionStandard("Potion standard", 2));

        // Case 8
        cases.add(new Eclair("Eclair", 2));

        // Case 9
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 10
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 11
        cases.add(new Massue("Massue", 3));

        // Case 12
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 13
        cases.add(new PotionStandard("Potion standard", 2));

        // Case 14
        cases.add(new Case());

        // Case 15
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 16
        cases.add(new Case());

        // Case 17
        cases.add(new Eclair("Eclair", 2));

        // Case 18
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 19
        cases.add(new Epee("Epee", 5));

        // Case 20
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 21
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 22
        cases.add(new Massue("Massue", 3));

        // Case 23
        cases.add(new Eclair("Eclair", 2));

        // Case 24
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 25
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 26
        cases.add(new Epee("Epee", 5));

        // Case 27
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 28
        cases.add(new GrandePotion("Grande Potion", 5));

        // Case 29
        cases.add(new Case());

        // Case 30
        cases.add(new Gobelin("Gobelin", 6, 1));

        // Case 31
        cases.add(new PotionStandard("Potion standard", 2));

        // Case 32
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 33
        cases.add(new PotionStandard("Potion standard", 2));

        // Case 34
        cases.add(new Case());

        // Case 35
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 36
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 37
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 38
        cases.add(new Massue("Massue", 3));

        // Case 39
        cases.add(new PotionStandard("Potion standard", 2));

        // Case 40
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 41
        cases.add(new GrandePotion("Grande Potion", 5));

        // Case 42
        cases.add(new Epee("Epee", 5));

        // Case 43
        cases.add(new PotionStandard("Potion standard", 2));

        // Case 44
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 45
        cases.add(new Dragon("Dragon", 15, 4));

        // Case 46
        cases.add(new Case());

        // Case 47
        cases.add(new Sorcier("Sorcier", 9, 2));

        // Case 48
        cases.add(new BouleDeFeu("Boule de feu", 7));

        // Case 49
        cases.add(new BouleDeFeu("Boule de feu", 7));

        // Case 50
        cases.add(new Case());

        // Case 51
        cases.add(new Case());

        // Case 52
        cases.add(new Dragon("Dragon", 15, 4));

        // Case 53
        cases.add(new Epee("Epee", 5));

        // Case 54
        cases.add(new Case());

        // Case 55
        cases.add(new Case());

        // Case 56
        cases.add(new Dragon("Dragon", 15, 4));

        // Case 57
        cases.add(new Case());

        // Case 58
        cases.add(new Case());

        // Case 59
        cases.add(new Case());

        // Case 60
        cases.add(new Case());

        // Case 61
        cases.add(new Case());

        // Case 62
        cases.add(new Dragon("Dragon", 15, 4));

        // Case 63
        cases.add(new Case());

        // Case 64
        cases.add(new Case());

    }
}
