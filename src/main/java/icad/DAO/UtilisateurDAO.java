package icad.DAO;

import icad.model.MySQLConnection;
import icad.model.Utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jb.loirot
 */
public class UtilisateurDAO {

    private Connection connexion;

    public UtilisateurDAO() throws Exception {
        this.connexion = MySQLConnection.getConnexion();
    }

    public Utilisateur create(Utilisateur utilisateur) {
        return utilisateur;
    }

    public static Connection getConnexion() {
        return getConnexion();
    }

    public void ajouterUtilisateur (Utilisateur utilisateur) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = UtilisateurDAO.getConnexion();
            preparedStatement = connexion.prepareStatement("INSERT INTO noms(nom, prenom) VALUES(?, ?);");
            preparedStatement.setString(1, utilisateur.getNOM_UTILISATEUR());
            preparedStatement.setString(2, utilisateur.getPRENOM_UTILISATEUR());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

//    public Utilisateur get(int ID_UTILISATEUR) {
//    return instance ;
//    }
    
    
//    public static UtilisateurDAO getInstance() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//
//        }
//        UtilisateurDAO instance = new UtilisateurDAO (
//                "jdbc:mysql://localhost:3306/javaee", "root", "");
//        return instance;
//    }
//
}
