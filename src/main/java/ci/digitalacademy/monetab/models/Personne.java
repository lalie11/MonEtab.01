package ci.digitalacademy.monetab.models;

import lombok.Data;

import java.time.LocalDate;

/**
 * La classe {@code Personne} représente une personne avec des attributs personnels tels que l'identifiant,
 * la date de naissance, la ville, le prénom, le nom et le numéro de téléphone.
 * Elle fournit des méthodes pour accéder et modifier ces attributs, ainsi qu'une méthode pour obtenir l'âge
 * d'une personne à partir de sa date de naissance.
 */
@Data
public class Personne {
    protected int id;
    protected LocalDate dateNaissance;
    protected String ville;
    protected String prenom;
    protected String nom;
    protected String telephone;



}
