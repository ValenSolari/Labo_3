import Models.Hangar;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.ietf.jgss.GSSContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Hangar[] hangar = new Hangar[6];
        ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        File file = new File("PortaAviones.json");
        /*
        try {
            hangar=mapper.readValue(file,Hangar[].class);

        }catch (IOException ex){
            System.out.println("no se puede leer");
            ex.printStackTrace();
        }*/
        List<Hangar> list = new ArrayList<>();

        try{
            FileReader fileReader = new FileReader("PortaAviones.json");
            Gson gson = new GsonBuilder().create();
            Hangar[] hangarArray =gson.fromJson(fileReader,Hangar[].class);
            list = Arrays.asList(hangarArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        for (Hangar x : list){
            System.out.println(x.toString());
        }

        File write = new File("PruebaGson.txt");
        try{
            mapper.writerWithDefaultPrettyPrinter().writeValue(write,list);
        }catch (IOException ex){
            System.out.println("error de escritura");
        }
    }
}