package primerPaquete;

import java.util.Scanner;

public class EGitTest {

  public static void main(String[] args) {
    
    
    //Ejercicio 1
    
    int array[] = new int[10];
    Scanner entrada = new Scanner(System.in);
    int positivos=0;
    int negativos=0;
    int cero = 0;
    System.out.println("Introduce diez números para el array:");
    for (int i=0;i<10;i++) {
      array[i] = entrada.nextInt();
      if (array[i]>0) positivos++;
      else if (array[i]<0) negativos++;
      else cero++;
    }
    System.out.printf("\nHas introducido %d números positivos, %d números negativos y %d ceros",
        positivos,negativos,cero);
    entrada.close();
    
    
    
    //Ejercicio 2
    
    int array2[] = new int[10];
    Scanner entrada2 = new Scanner(System.in);
    double suma=0;
    System.out.println("Introduce diez números para el array:");
    for (int i=0;i<10;i++) {
      array[i] = entrada.nextInt();
      if (i%2!=0) suma = suma+array2[i];
    }
    System.out.println("La media de todos los números en posición par que has introducido es " +
    (suma/(array2.length/2)));
    entrada2.close();
    
    
    // Ejercicio 3
    
    int array3[]=new int [100];
    for (int elemento:array3) {
      elemento = (int)(Math.random()*100);
      System.out.print(elemento+ " ");
    }
    
    
    // Nuevo comentario para commit
    // Segundo comentario para push
    // Tercer comentario para rama1
    // Cuarto comentario parar main - merge
    // Cuarto comentario para rama1 - merge
    // Quinto comentario para rebase - eliminar
    // Sexto comentario. bla bla bla

  }

}