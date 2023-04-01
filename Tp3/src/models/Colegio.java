package models;

import java.util.ArrayList;

public class Colegio {

    private ArrayList <Persona> miembrosColegio;


    public Colegio() {//inicializa
        this.miembrosColegio = new ArrayList<>();
    }

    public agregarPersonas(Persona personita){///Carga
        miembrosColegio.add(personita);
    }


    public Integer contarEstudiantes (){
        Integer cant=0;
        for (Persona person1 : miembrosColegio)///corrobora que no este vacio
        {
            if (person1 instanceof Estudiante)
            {
                cant++;
            }
        }

    }

    public Integer contarStaff(){
        Integer cant=0;
        for (Persona person1 : miembrosColegio){
            if (person1 instanceof MiembroStaff){
                cant++;
            }
        }
    }





}
