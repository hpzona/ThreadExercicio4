package threadsexercicio4;

import java.util.Random;

public class Principal {

   public static void main(String[] args) {

      Random num = new Random();
      int[][] matriz = new int[3][3];

      for (int linha = 0; linha < 3; linha++) {
         for (int coluna = 0; coluna < 3; coluna++) {
            matriz[linha][coluna] = num.nextInt(50);
         }
      }

      System.out.println("Matriz original:");
      for (int linha = 0; linha < 3; linha++) {
         for (int coluna = 0; coluna < 3; coluna++) {
            System.out.printf("\t %d \t", matriz[linha][coluna]);
         }
         System.out.println();
      }
      
      // Objeto compartilhado entre threads
      Organizador organiza = new Organizador();

      // Instancia objetos Runnable      
      Classifica c1 = new Classifica(0, matriz, organiza);
      Classifica c2 = new Classifica(1, matriz, organiza);
      Classifica c3 = new Classifica(2, matriz, organiza);

      // Cria threads para executar os objetos Runnable
      Thread te1 = new Thread(c1);
      Thread te2 = new Thread(c2);
      Thread te3 = new Thread(c3);

      // Inicia threads
      te1.start();
      te2.start();
      te3.start();

      // Espera as threads encerrarem a sua execucao
      try {
         te1.join();
      } catch (InterruptedException e) {
      }

      try {
         te2.join();
      } catch (InterruptedException e) {
      }

      try {
         te3.join();
      } catch (InterruptedException e) {
      }

      matriz = organiza.getMatrizOrganizada();

      System.out.println("Matriz organizada:");
      for (int linha = 0; linha < 3; linha++) {
         for (int coluna = 0; coluna < 3; coluna++) {
            System.out.printf("\t %d \t", matriz[linha][coluna]);
         }
         System.out.println();
      }
   }
}
