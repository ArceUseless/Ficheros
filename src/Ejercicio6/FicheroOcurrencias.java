package Ejercicio6;

import java.util.Scanner;

public class FicheroOcurrencias {
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner( System.in );
    
    String nombreFichero;
    int contador = 0;
    String palabra;
    String palabraFichero;
    
    System.out.println("¿Cómo se llama el fichero?");
    nombreFichero = scanner.nextLine();
    System.out.println("¿Qué palabra quieres buscar?");
    palabra = scanner.nextLine();
    
    Scanner fileReader = new Scanner("C:\\Users\\d17nicar\\eclipse-workspace\\Programacion2\\Ficheros\\src\\Ejercicio6\\"+nombreFichero+".txt");
 
    while(fileReader.hasNext()){
      palabraFichero = fileReader.next();
      System.out.println(palabraFichero);
      if(palabraFichero.equals(palabra)) {
        contador++;
      }
    }      
    System.out.println("Se han encontrado "+contador+"ocurrencias de '"+palabra+"'.");
    
    
  }

}
