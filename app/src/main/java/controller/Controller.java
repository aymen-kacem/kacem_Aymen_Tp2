package controller;

import com.example.kacem_aymen_tp2.controller.model.Patient;

public final class Controller {
    private static Patient patient;
    public static Controller instance=null;
    private Controller() {super();
    }

    public static final Controller getinstance() {
        if (Controller.instance == null) {
            Controller.instance = new Controller();

        }
        return Controller.instance;
    }


    public void createPatient(int age, float valeur ,boolean isFasting){
        patient=new Patient(age,valeur,isFasting);


    }
    public String getResult(){
        return patient.getReponse();
    }


}
