package com.example.kacem_aymen_tp2.controller.model;

public class Patient {
    int age;
    float valeur;
    boolean bt;
    String reponse;
    public Patient(int age,float valeur,boolean bt){
        this.age=age;
        this.valeur=valeur;
        this.bt=bt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBt() {
        return bt;
    }


    public void setBt(boolean bt) {
        this.bt = bt;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public void  calculer() {
            if (bt) {
                if (age >= 13) {
                    if (valeur < 5.0)
                        reponse=("Niveau de glycémie est trop bas");
                    else if (valeur >= 5.0 && valeur <= 7.2)
                        reponse=("Niveau de glycémie est normale");
                    else
                        reponse=("Niveau de glycémie est trop élevé");
                } else if (age >= 6 && age <= 12) {
                    if (valeur < 5.0)
                        reponse=("Niveau de glycémie est trop bas");
                    else if (valeur >= 5.0 && valeur <= 10.0)
                        reponse=("Niveau de glycémie est normale");
                    else
                        reponse=("Niveau de glycémie est trop élevé");
                } else if (age < 6) {
                    if (valeur < 5.5)
                        reponse=("Niveau de glycémie est trop bas");
                    else if (valeur >= 5.5 && valeur <= 10.0)
                        reponse=("Niveau de glycémie est normale");
                    else
                        reponse=("Niveau de glycémie est trop élevé");
                }
            } else {
                if (valeur > 10.5)
                    reponse=("Niveau de glycémie est trop élevé");
                else
                    reponse=("Niveau de glycémie est normale");
            }

        }
        public String getReponse(){
        return reponse;
        }

}
