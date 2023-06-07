import java.io.*;
import java.nio.Buffer;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        ///Map
        ///Set
        ///Genericos
        ///Enum
        ///Excepciones
        ///Manejo de archivos
        ///Serializacion

        /*
        Map<Character,Integer> map = new TreeMap<>();

        map.put('D',3);
        map.put('E',1);
        map.put('A',4);
        map.put('B',2);
        map.put('C',5);

        System.out.println(map);

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey()+"     Value: "+entry.getValue());
        }*/
    try{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("Archivo.txt")));
        bufferedWriter.write("Este es un archivo de prubea");
        bufferedWriter.close();
    }catch (IOException ex){
        System.out.println("Error de archivo");
    }

    try {
        if (new File("Archivo.txt").exists()){
            BufferedReader fentrada = new BufferedReader(new BufferedReader(new FileReader("Archivo.txt")));
            String linea = null;
            while ((linea = fentrada.readLine())!= null){
                System.out.println(linea);
            }
            fentrada.close();
        }
    }catch (IOException ex){
        System.out.println("Error de archivo");
    }



    }
}