package Package;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Colegio{
    private List<Alumno> lista;

    ///region Constructor

    public Colegio() {
        this.lista = new ArrayList<>();
    }

    public Colegio(List<Alumno> lista) {
        this.lista = lista;
    }

    ///endregion

    ///region Metodos
    public void CargarAlumno (Alumno x) throws CustomExcepcion {
            try{
                if (x.getNacionalidad() == "" || x.getNacionalidad() == null){
                    throw new CustomExcepcion("Nacionalidad invalida");
                }
                lista.add(x);
            }catch (Exception e){
                System.out.println("El alumno no posee nacionalidad...");
            }finally {

            }
    }

    public String MostrarAlumnos (){
        String aux = "";
        for (Alumno x : lista){
            aux += x.toString()+"\n";
        }
        return aux;
    }

    public String verNacionalidad (String nacionalidad)throws CustomExcepcion {
        String aux = "";
        try{
            if (nacionalidad == null || nacionalidad == "") {
                throw new CustomExcepcion("Nacionalidad vacia");
            } else{
                int i = 0;
                for (Alumno x : lista) {
                    if (true == x.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                        aux += x.toString() + "\n";
                        i++;
                    }
                }
                System.out.println("Hay "+i+" alumnos "+nacionalidad);}
        }catch (Exception ex){
            System.out.println("No a seleccionado ninguna Nacionalidad para mostrar");
            }
        return aux;
    }


    public int contarNacionalidad (String nacionalidad) throws CustomExcepcion{
        int aux=0;
        if (nacionalidad == null || nacionalidad == "") {
            throw new CustomExcepcion("Nacionalidad vacia");
        }else{
            

        }
        return aux;
    }




    ///endregion
}
