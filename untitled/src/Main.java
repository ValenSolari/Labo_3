import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

public class Main {
    public static void main(String[] args) {
        File file = new File("generated.json");

        Person[]personas = new Person[5];
        ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try{
            personas=mapper.readValue(file,Person[].class);
        }catch (IOException ex){
            System.out.println("no se pudo leer");
            ex.printStackTrace();
        }


        ArrayList<Person> arrayListPerson = new ArrayList<>();

        for (Person x : personas){
            arrayListPerson.add(x);
        }


        System.out.println("Arreglo \n\n");
        for (Person x : arrayListPerson){
            System.out.println(x.toString());
        }

        File write = new File("Prueba.json");
        try{

            mapper.writerWithDefaultPrettyPrinter().writeValue(write,personas);
        }catch (IOException ex){
            System.out.println("no se pudo escribir...");
        }



    }
}