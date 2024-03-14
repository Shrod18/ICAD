/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad.model;

public class Utilisateur {
    private int ID_UTILISATEUR;
    private String EMAIL_UTILISATEUR;
    private int NO_TEL_UTILISATEUR;
    private String NOM_UTILISATEUR;
    private String PRENOM_UTILISATEUR;
    private String VILLE_UTILISATEUR;
    private String ADRESSE_UTILISATEUR;
    private int CP_UTILISATEUR;
    private String FONCTION_UTILISATEUR;
    private String MDP_HASH_UTILISATEUR;

//Constructor without ID_UTILISATEUR
    public Utilisateur(String EMAIL_UTILISATEUR, int NO_TEL_UTILISATEUR, String NOM_UTILISATEUR, String PRENOM_UTILISATEUR, String VILLE_UTILISATEUR, String ADRESSE_UTILISATEUR, int CP_UTILISATEUR, String FONCTION_UTILISATEUR, String MDP_HASH_UTILISATEUR) {
        this.EMAIL_UTILISATEUR = EMAIL_UTILISATEUR;
        this.NO_TEL_UTILISATEUR = NO_TEL_UTILISATEUR;
        this.NOM_UTILISATEUR = NOM_UTILISATEUR;
        this.PRENOM_UTILISATEUR = PRENOM_UTILISATEUR;
        this.VILLE_UTILISATEUR = VILLE_UTILISATEUR;
        this.ADRESSE_UTILISATEUR = ADRESSE_UTILISATEUR;
        this.CP_UTILISATEUR = CP_UTILISATEUR;
        this.FONCTION_UTILISATEUR = FONCTION_UTILISATEUR;
        this.MDP_HASH_UTILISATEUR = MDP_HASH_UTILISATEUR;
    }

//Constructor with all attributs
    public Utilisateur(int ID_UTILISATEUR, String EMAIL_UTILISATEUR, int NO_TEL_UTILISATEUR, String NOM_UTILISATEUR, String PRENOM_UTILISATEUR, String VILLE_UTILISATEUR, String ADRESSE_UTILISATEUR, int CP_UTILISATEUR, String FONCTION_UTILISATEUR, String MDP_HASH_UTILISATEUR) {
        this.ID_UTILISATEUR = ID_UTILISATEUR;
        this.EMAIL_UTILISATEUR = EMAIL_UTILISATEUR;
        this.NO_TEL_UTILISATEUR = NO_TEL_UTILISATEUR;
        this.NOM_UTILISATEUR = NOM_UTILISATEUR;
        this.PRENOM_UTILISATEUR = PRENOM_UTILISATEUR;
        this.VILLE_UTILISATEUR = VILLE_UTILISATEUR;
        this.ADRESSE_UTILISATEUR = ADRESSE_UTILISATEUR;
        this.CP_UTILISATEUR = CP_UTILISATEUR;
        this.FONCTION_UTILISATEUR = FONCTION_UTILISATEUR;
        this.MDP_HASH_UTILISATEUR = MDP_HASH_UTILISATEUR;
    }

    public int getID_UTILISATEUR() {
        return ID_UTILISATEUR;
    }

    public void setID_UTILISATEUR(int ID_UTILISATEUR) {
        this.ID_UTILISATEUR = ID_UTILISATEUR;
    }

    public String getEMAIL_UTILISATEUR() {
        return EMAIL_UTILISATEUR;
    }

    public void setEMAIL_UTILISATEUR(String EMAIL_UTILISATEUR) {
        this.EMAIL_UTILISATEUR = EMAIL_UTILISATEUR;
    }

    public int getNO_TEL_UTILISATEUR() {
        return NO_TEL_UTILISATEUR;
    }

    public void setNO_TEL_UTILISATEUR(int NO_TEL_UTILISATEUR) {
        this.NO_TEL_UTILISATEUR = NO_TEL_UTILISATEUR;
    }

    public String getNOM_UTILISATEUR() {
        return NOM_UTILISATEUR;
    }

    public void setNOM_UTILISATEUR(String NOM_UTILISATEUR) {
        this.NOM_UTILISATEUR = NOM_UTILISATEUR;
    }

    public String getPRENOM_UTILISATEUR() {
        return PRENOM_UTILISATEUR;
    }

    public void setPRENOM_UTILISATEUR(String PRENOM_UTILISATEUR) {
        this.PRENOM_UTILISATEUR = PRENOM_UTILISATEUR;
    }

    public String getVILLE_UTILISATEUR() {
        return VILLE_UTILISATEUR;
    }

    public void setVILLE_UTILISATEUR(String VILLE_UTILISATEUR) {
        this.VILLE_UTILISATEUR = VILLE_UTILISATEUR;
    }

    public String getADRESSE_UTILISATEUR() {
        return ADRESSE_UTILISATEUR;
    }

    public void setADRESSE_UTILISATEUR(String ADRESSE_UTILISATEUR) {
        this.ADRESSE_UTILISATEUR = ADRESSE_UTILISATEUR;
    }

    public int getCP_UTILISATEUR() {
        return CP_UTILISATEUR;
    }

    public void setCP_UTILISATEUR(int CP_UTILISATEUR) {
        this.CP_UTILISATEUR = CP_UTILISATEUR;
    }

    public String getFONCTION_UTILISATEUR() {
        return FONCTION_UTILISATEUR;
    }

    public void setFONCTION_UTILISATEUR(String FONCTION_UTILISATEUR) {
        this.FONCTION_UTILISATEUR = FONCTION_UTILISATEUR;
    }

    public String getMDP_HASH_UTILISATEUR() {
        return MDP_HASH_UTILISATEUR;
    }

    public void setMDP_HASH_UTILISATEUR(String MDP_HASH_UTILISATEUR) {
        this.MDP_HASH_UTILISATEUR = MDP_HASH_UTILISATEUR;
    }
}
