/*
 * Copyright (C) 2021
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the CeCILL FREE SOFTWARE LICENSE AGREEMENT
 * ; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CeCILL License V2.1 for more details.
 *
 * You should have received a copy of the CeCILL License
 * along with this program; If not, see <http://www.cecill.info/licences/Licence_CeCILL_V2.1-en.html>.
 */

package fr.edyp.epims.json;

public class ProAnalysisJson implements java.io.Serializable {

    public final static int STATE_ACCEPTED = 1;
    public final static int STATE_REFUSED = 2;
    public final static int STATE_CANCELLED = 3;
    public final static int STATE_WAITING_FOR_VALIDATION = 4;
    public final static int STATE_COMPLETED = 5;



    private int analyseId;
    private int entId;
    private int projetId;
    private int plateformeId;
    private int typeAnalyseId;
    private int etatId;

    private int analyseDateDepotDemande;
    private int analyseDateReponseProfi;
    private int analyseDateCloture;
    private int analyseOrigineSecteur;
    private int analyseOrigineNiveau;

    private int analyseFichierResultCompteur;
    private int analyseNbEchantillons;
    private int analyseInjections;
    private int analyseHeuresTravail;
    private int analyseDateVueClient;
    private int analyseAlerteRefus;

    private String analyseCommentaireClient;
    private String analyseMotivationsRefus;
    private String analyseFichierResultCrypt;
    private String analyseFichierResult;
    private String analyseIntitule;
    private String analyseDescriptionEchantillons;
    private String analyseDescriptionProjetScientifique;
    private String analyseCommentairesOperateur;

    private String customer;
    private String laboratory;
    private String telFixe;
    private String telPortable;
    private String address;
    private String mail;
    private String managerMail;

    private String userLogin;
    private String userFullname;

    private int projetTypeId;


    public ProAnalysisJson() {
    }

    public ProAnalysisJson( int analyseId, int entId, int projetId, int plateformeId, int typeAnalyseId, int etatId, int analyseDateDepotDemande, int analyseDateReponseProfi, int analyseDateCloture, int analyseOrigineSecteur, int analyseOrigineNiveau, int analyseFichierResultCompteur, int analyseNbEchantillons, int analyseInjections, int analyseHeuresTravail, int analyseDateVueClient, int analyseAlerteRefus, String analyseCommentaireClient, String analyseMotivationsRefus, String analyseFichierResultCrypt, String analyseFichierResult, String analyseIntitule, String analyseDescriptionEchantillons, String analyseDescriptionProjetScientifique, String analyseCommentairesOperateur,
                            String customer, String laboratory, String telFixe, String telPortable, String address, String mail, String managerMail, String userLogin, String userFullname, int projetTypeId) {
        this.analyseId = analyseId;
        this.entId = entId;
        this.projetId = projetId;
        this.plateformeId = plateformeId;
        this.typeAnalyseId = typeAnalyseId;
        this.etatId = etatId;

        this.analyseDateDepotDemande = analyseDateDepotDemande;
        this.analyseDateReponseProfi = analyseDateReponseProfi;
        this.analyseDateCloture = analyseDateCloture;
        this.analyseOrigineSecteur = analyseOrigineSecteur;
        this.analyseOrigineNiveau = analyseOrigineNiveau;

        this.analyseFichierResultCompteur = analyseFichierResultCompteur;
        this.analyseNbEchantillons = analyseNbEchantillons;
        this.analyseInjections = analyseInjections;
        this.analyseHeuresTravail = analyseHeuresTravail;
        this.analyseDateVueClient = analyseDateVueClient;
        this.analyseAlerteRefus = analyseAlerteRefus;

        this.analyseCommentaireClient = analyseCommentaireClient;
        this.analyseMotivationsRefus = analyseMotivationsRefus;
        this.analyseFichierResultCrypt = analyseFichierResultCrypt;
        this.analyseFichierResult = analyseFichierResult;
        this.analyseIntitule = analyseIntitule;
        this.analyseDescriptionEchantillons = analyseDescriptionEchantillons;
        this.analyseDescriptionProjetScientifique = analyseDescriptionProjetScientifique;
        this.analyseCommentairesOperateur = analyseCommentairesOperateur;

        this.customer = customer;
        this.laboratory = laboratory;
        this.telFixe = telFixe;
        this.telPortable = telPortable;
        this.address = address;
        this.mail = mail;
        this.managerMail = managerMail;

        this.userLogin = userLogin;
        this.userFullname = userFullname;

        this.projetTypeId = projetTypeId;
    }

    public int getAnalyseId() {
        return this.analyseId;
    }

    public void setAnalyseId(int analyseId) {
        this.analyseId = analyseId;
    }

    public int getEntId() {
        return entId;
    }

    public void setEntId(int entId) {
        this.entId = entId;
    }

    public int getProjetId() {
        return projetId;
    }

    public void setProjetId(int projetId) {
        this.projetId = projetId;
    }

    public int getPlateformeId() {
        return plateformeId;
    }

    public void setPlateformeId(int plateformeId) {
        this.plateformeId = plateformeId;
    }


    public int getTypeAnalyseId() {
        return typeAnalyseId;
    }

    public void setTypeAnalyseId(int typeAnalyseId) {
        this.typeAnalyseId = typeAnalyseId;
    }


    public int getEtatId() {
        return etatId;
    }

    public void setEtatId(int etatId) {
        this.etatId = etatId;
    }


    public int getAnalyseDateDepotDemande() {
        return analyseDateDepotDemande;
    }

    public void setAnalyseDateDepotDemande(int analyseDateDepotDemande) {
        this.analyseDateDepotDemande = analyseDateDepotDemande;
    }


    public int getAnalyseDateReponseProfi() {
        return analyseDateReponseProfi;
    }

    public void setAnalyseDateReponseProfi(int analyseDateReponseProfi) {
        this.analyseDateReponseProfi = analyseDateReponseProfi;
    }


    public int getAnalyseDateCloture() {
        return analyseDateCloture;
    }

    public void setAnalyseDateCloture(int analyseDateCloture) {
        this.analyseDateCloture = analyseDateCloture;
    }


    public int getAnalyseOrigineSecteur() {
        return analyseOrigineSecteur;
    }

    public void setAnalyseOrigineSecteur(int analyseOrigineSecteur) {
        this.analyseOrigineSecteur = analyseOrigineSecteur;
    }


    public int getAnalyseOrigineNiveau() {
        return analyseOrigineNiveau;
    }

    public void setAnalyseOrigineNiveau(int analyseOrigineNiveau) {
        this.analyseOrigineNiveau = analyseOrigineNiveau;
    }


    public int getAnalyseFichierResultCompteur() {
        return analyseFichierResultCompteur;
    }

    public void setAnalyseFichierResultCompteur(int analyseFichierResultCompteur) {
        this.analyseFichierResultCompteur = analyseFichierResultCompteur;
    }


    public int getAnalyseNbEchantillons() {
        return analyseNbEchantillons;
    }

    public void setAnalyseNbEchantillons(int analyseNbEchantillons) {
        this.analyseNbEchantillons = analyseNbEchantillons;
    }


    public int getAnalyseInjections() {
        return analyseInjections;
    }

    public void setAnalyseInjections(int analyseInjections) {
        this.analyseInjections = analyseInjections;
    }


    public int getAnalyseHeuresTravail() {
        return analyseHeuresTravail;
    }

    public void setAnalyseHeuresTravail(int analyseHeuresTravail) {
        this.analyseHeuresTravail = analyseHeuresTravail;
    }


    public int getAnalyseDateVueClient() {
        return analyseDateVueClient;
    }

    public void setAnalyseDateVueClient(int analyseDateVueClient) {
        this.analyseDateVueClient = analyseDateVueClient;
    }

    public int getAnalyseAlerteRefus() {
        return analyseAlerteRefus;
    }

    public void setAnalyseAlerteRefus(int analyseAlerteRefus) {
        this.analyseAlerteRefus = analyseAlerteRefus;
    }

    public String getAnalyseCommentaireClient() {
        return analyseCommentaireClient;
    }

    public void setAnalyseCommentaireClient(String analyseCommentaireClient) {
        this.analyseCommentaireClient = analyseCommentaireClient;
    }


    public String getAnalyseMotivationsRefus() {
        return analyseMotivationsRefus;
    }

    public void setAnalyseMotivationsRefus(String analyseMotivationsRefus) {
        this.analyseMotivationsRefus = analyseMotivationsRefus;
    }


    public String getAnalyseFichierResultCrypt() {
        return analyseFichierResultCrypt;
    }

    public void setAnalyseFichierResultCrypt(String analyseFichierResultCrypt) {
        this.analyseFichierResultCrypt = analyseFichierResultCrypt;
    }


    public String getAnalyseFichierResult() {
        return analyseFichierResult;
    }

    public void setAnalyseFichierResult(String analyseFichierResult) {
        this.analyseFichierResult = analyseFichierResult;
    }


    public String getAnalyseIntitule() {
        return analyseIntitule;
    }

    public void setAnalyseIntitule(String analyseIntitule) {
        this.analyseIntitule = analyseIntitule;
    }


    public String getAnalyseDescriptionEchantillons() {
        return analyseDescriptionEchantillons;
    }

    public void setAnalyseDescriptionEchantillons(String analyseDescriptionEchantillons) {
        this.analyseDescriptionEchantillons = analyseDescriptionEchantillons;
    }


    public String getAnalyseDescriptionProjetScientifique() {
        return analyseDescriptionProjetScientifique;
    }

    public void setAnalyseDescriptionProjetScientifique(String analyseDescriptionProjetScientifique) {
        this.analyseDescriptionProjetScientifique = analyseDescriptionProjetScientifique;
    }


    public String getAnalyseCommentairesOperateur() {
        return analyseCommentairesOperateur;
    }

    public void setAnalyseCommentairesOperateur(String analyseCommentairesOperateur) {
        this.analyseCommentairesOperateur = analyseCommentairesOperateur;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getTelPortable() {
        return telPortable;
    }

    public void setTelPortable(String telPortable) {
        this.telPortable = telPortable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getManagerMail() {
        return managerMail;
    }

    public void setManagerMail(String managerMail) {
        this.managerMail = managerMail;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public int getProjetTypeId() {
        return projetTypeId;
    }
    public void setProjetTypeId(int projetTypeId) {
        this.projetTypeId= projetTypeId;
    }


    public final boolean isOK() {
        return ((etatId== STATE_ACCEPTED) || (etatId== STATE_COMPLETED));
    }

    public final boolean isRefused() {
        return (etatId == STATE_REFUSED);
    }

    public final boolean isCancelled() {
        return (etatId == STATE_CANCELLED);
    }

    public final boolean isWaitingValidation() {
        return (etatId == STATE_WAITING_FOR_VALIDATION);
    }

    public final boolean isCompleted() {
        return (etatId == STATE_COMPLETED);
    }


}
