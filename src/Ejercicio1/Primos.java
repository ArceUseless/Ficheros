package Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Primos {
  public static void main(String[] args) {
    
    boolean esPrimo;
    
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\d17nicar\\eclipse-workspace\\Programacion2\\Ficheros\\src\\Ejercicio1\\primos.dat"));
      for(int i = 2;i <=500;i++){
        esPrimo = true;
        for(int j = 2;j < i;j++){
           if(i % j == 0){
              esPrimo = false;
           }
        }
        if(esPrimo){
          bw.write(""+i);
          bw.newLine();
        }
      }
      bw.close();
      System.out.println("Escritura de fichero completada."); 
      
    } catch (FileNotFoundException fnfe) {
      System.out.println("Fichero no encontrado."); 
    } catch (IOException e) {
      System.out.println("Error en la escritura del fichero."); 
    }
  }

}
