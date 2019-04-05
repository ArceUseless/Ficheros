package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerPrimos {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\d17nicar\\eclipse-workspace\\Programacion2\\Ficheros\\src\\Ejercicio1\\primos.dat"));   
      String linea = "";

      while(linea != null) {
        linea = br.readLine();
        if(linea != null) {
          System.out.println(linea);
        }      
      }
    } catch (FileNotFoundException fnfe) {
      System.out.println("Fichero no encontrado."); 
    } catch (IOException e) {
      System.out.println("Error en la lectura del fichero."); 
    }
  }
}
