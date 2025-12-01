Formation Pratique Git et GitHub - Guide Pas à Pas
Auteur: Mohamed Yassine Derbel
Date: Décembre 2025

🎯 Objectif de cette Formation
Cette formation vous guide étape par étape dans l'utilisation de Git et GitHub avec un projet Spring Boot réel. Vous allez :

Faire des modifications de code
Les commiter avec Git
Créer des branches
Fusionner des branches
Gérer des conflits
Travailler avec GitHub
Prérequis : Git installé sur votre machine

📋 Table des Matières
Configuration Initiale
Exercice 1 : Premier Commit
Exercice 2 : Travailler sur une Branche Feature
Exercice 3 : Créer une Autre Feature en Parallèle
Exercice 4 : Merge des Branches
Exercice 5 : Gérer un Conflit
Exercice 6 : Hotfix sur Main
Exercice 7 : Annuler des Modifications
Exercice 8 : Utiliser Stash
Récapitulatif des Commandes
Configuration Initiale
Étape 1 : Vérifier Git
# Vérifier que Git est installé
git --version

# Si pas installé, télécharger depuis https://git-scm.com
Étape 2 : Configuration de Base
# Configurer votre nom
git config --global user.name "Mohamed Yassine Derbel"

# Configurer votre email
git config --global user.email "votre.email@example.com"

# Vérifier
git config --list
Étape 3 : Se Positionner dans le Projet
# Aller dans le dossier du projet
cd c:\Users\derbe\OneDrive\Bureau\gitgithub

# Vérifier l'état de Git
git status

# Voir les branches
git branch
✅ Vous êtes prêt à commencer !

Exercice 1 : Premier Commit
🎯 Objectif
Modifier le fichier file1.java et faire votre premier commit.

📝 Étapes
1. Ouvrir et modifier file1.java

Allez dans : src/main/java/com/example/gitgithub/file1.java

Modifiez le code comme suit :

package com.example.gitgithub;

public class file1 {
    private String message = "Hello, GitHub!";
    private String author = "Mohamed Yassine Derbel";

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
}
