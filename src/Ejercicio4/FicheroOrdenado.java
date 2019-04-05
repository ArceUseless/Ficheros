package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FicheroOrdenado {
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner( System.in );   
    ArrayList<String> arrayF = new ArrayList<String>();
    String nombreFichero;
    
    System.out.println("¿Cómo se llama el fichero?");
    nombreFichero = scanner.nextLine();
 
    try {
      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\d17nicar\\eclipse-workspace\\Programacion2\\Ficheros\\src\\Ejercicio4\\"+nombreFichero+".txt"));   
      
      String linea = "";
      
      while(linea != null) {
        linea = br.readLine();
        if(linea != null) {
          arrayF.add(linea);
        }      
      }
      br.close();
      Collections.sort(arrayF);
      
      BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\d17nicar\\eclipse-workspace\\Programacion2\\Ficheros\\src\\Ejercicio4\\"+nombreFichero+"_sort.txt"));
      
      for(int i = 0; i < arrayF.size(); i++) {
        bw.write(""+arrayF.get(i));
        bw.newLine();
      }
      bw.close();
      System.out.println("Fichero creado/actualizado.");
    }catch(FileNotFoundException fnfe) {
      System.out.println("No se ha encontrado el archivo.");
    }catch(IOException io) {
      System.out.println("Error en la lectura del fichero.");
    }
    
    
  }

}
