package com.company;

import java.sql.*;

import com.company.personnages.Guerrier;
import com.company.personnages.Magicien;
import org.mariadb.jdbc.Driver;

public class ConnectionBase {

    protected Connection conn;
    protected Statement state;

    //CTRL + SHIFT + O pour générer les imports
    public ConnectionBase() {
    }

    public void connect() {


        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver O.K.");

            String url = "jdbc:mariadb://localhost:3306/hero";
            String user = "mtakacs2";
            String passwd = "motdepassedemerde";

            conn = DriverManager.getConnection(url, user, passwd);
            //Connection conn = DriverManager.getConnection("jdbc:mysql://C:/wamp64/bin/mariadb/mariadb10.4.10/data/hero" + "user=mtakacs2&password=motdepassedemerde");
            System.out.println("Connexion effective !");


        } catch (Exception e) {
            System.out.println("Echec de connexion !");
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }


    public void getHeroes() {
        try {
            state = conn.createStatement();

            ResultSet result = state.executeQuery("SELECT * FROM HERO");
            ResultSetMetaData resultMeta = result.getMetaData();


            for (int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t |");

            System.out.println("");

            while (result.next()) {
                for (int j = 1; j <= resultMeta.getColumnCount(); j++)
                    System.out.print("\t" + result.getObject(j).toString() + "\t |");

            }
            System.out.println("");


            result.close();
            state.close();


        } catch (Exception e) {
            System.out.println("Echec de getHeroes !");
            System.out.println(e.toString());
            e.printStackTrace();

        }
    }


    public Personnage getHero(int idPerso) {
        Personnage perso = null;
        try {
            state = conn.createStatement();


            ResultSet result = state.executeQuery("SELECT * FROM `hero` WHERE id=" + idPerso + "\n ");
            ResultSetMetaData resultMeta = result.getMetaData();


            if (result.next()) {
//            Personnage perso = result.getObject();
                String type = result.getString("Type");
                if (type.equals("Guerrier")) {
                    perso = new Guerrier();
                } else {
                    perso = new Magicien();
                }

                perso.setNomPerso(result.getString("Nom"));
                perso.setNiveauVieMin(result.getInt("NiveauVie"));
                perso.setForceMin((result.getInt("NiveauForce")));

            }


//            for (int i = 1; i <= resultMeta.getColumnCount(); i++)
//                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t |");
//
//            System.out.println("");
//
//            while (result.next()) {
//                for (int j = 1; j <= resultMeta.getColumnCount(); j++)
//                    System.out.print("\t" + result.getObject(j).toString() + "\t |");
//
//            }
//            System.out.println("");


            result.close();
            state.close();


        } catch (Exception e) {
            System.out.println("Echec de getHero !");
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return perso;
    }



    public void createHero(Personnage monPerso) {
        try {
            state = conn.createStatement();
            Menu menu = new Menu();
            menu.ajouterNouveauPerso();

            String requete = "INSERT INTO hero (`Type`, `Nom`, `NiveauVie`, `NiveauForce`, `ArmeOuSort`, `Bouclier`) VALUES (" + monPerso.champsSQL() + " )\n";

            ResultSet result = state.executeQuery("INSERT INTO hero (`Type`, `Nom`, `NiveauVie`, `NiveauForce`, `ArmeOuSort`, `Bouclier`) VALUES (" + monPerso.champsSQL() + " )\n");
            ResultSetMetaData resultMeta = result.getMetaData();


            for (int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t |");

            System.out.println("");

            while (result.next()) {
                for (int j = 1; j <= resultMeta.getColumnCount(); j++)
                    System.out.print("\t" + result.getObject(j).toString() + "\t |");

            }
            System.out.println("");


            result.close();
            state.close();


        } catch (Exception e) {
            System.out.println("Echec de createHero !");
            System.out.println(e.toString());
            e.printStackTrace();

        }
    }

    public void updateHero(Personnage monPerso, int idPerso) {

        try {
            state = conn.createStatement();
            Menu menu = new Menu();
            monPerso.setNomPerso(menu.entrerNom());


            String query = "UPDATE hero SET Nom = \"" + monPerso.getNomPerso() + "\" WHERE Id=" + idPerso;
            System.out.println(query);

            ResultSet result = state.executeQuery(query);
            ResultSetMetaData resultMeta = result.getMetaData();


        } catch (Exception e) {
            System.out.println("Echec de updateHero !");
            System.out.println(e.toString());
            e.printStackTrace();

        }
    }

    public void deleteHero(int idPerso){
        try {
            state = conn.createStatement();
            Menu menu = new Menu();


            String query = "DELETE FROM hero WHERE Id=" + idPerso;
            System.out.println(query);

            ResultSet result = state.executeQuery(query);
            ResultSetMetaData resultMeta = result.getMetaData();


        } catch (Exception e) {
            System.out.println("Echec de updateHero !");
            System.out.println(e.toString());
            e.printStackTrace();

        }


    }




}



