package client_lourd.Controleurs;

import client_lourd.Vues.Connexion;
import client_lourd.Fenetre;

import  java.awt.event.*;
import  javax.swing.*;

public class ConnexionControl implements ActionListener{
    private JPanel vue;

    //Constructeur
    public ConnexionControl(JPanel vue){
        this.vue = vue;
    }

    //Implementation de action performed
    public void actionPerformed(ActionEvent e){
        //Si clique sur Valider
        if(e.getSource() == Connexion.btn_valide){
            System.out.println("VALIDER");
            //Verification dans la BDD A FAIRE
        }

        //Si clique sur Retour
        if(e.getSource() == Connexion.btn_retour){
            System.out.println("RETOUR CONNEXION");
            Fenetre.num_page = 1;
            Fenetre.cartes.removeAll();
            Fenetre.frame.add(Fenetre.createMainPanel());
            Fenetre.frame.repaint();
        }
    }
}
