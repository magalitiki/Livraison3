package com.objis.cameroun.neostore.service;

import com.objis.cameroun.neostore.domaine.Fournisseur;

import java.util.List;

public interface ITraitementsFournisseur {
	
	// Methode permettant d'enregistrer un article
	public void enregistrerFournisseurService (Fournisseur fournisseur);
	
	// methode affichant tous les fournisseurs
	public List<Fournisseur> listFournisseurService();
	
	//Methode de recherche d'un fournisseur
	public List<Fournisseur> RechercheFournisseurService(String nomColonne, String valeurRecherchee);
	
	
}
