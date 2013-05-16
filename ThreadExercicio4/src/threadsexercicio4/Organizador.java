package threadsexercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Organizador {
   
   private int[][] matriz;
   List<Integer> matrizLista;  
   
   public Organizador() {
      matriz = new int[3][3];
      matrizLista = new ArrayList<Integer>();
   }
   
   public synchronized void organizar(int[] vetor) {

      Arrays.sort(vetor);
      
      for (int i = 0; i < 3; i++) {
        matrizLista.add(vetor[i]);
      }
   }
   
   public int[][] getMatrizOrganizada() {
      
      int i = 0;
      
      Collections.sort(matrizLista);
      
      for (int linha = 0; linha < 3; linha++) {
         for (int coluna = 0; coluna < 3; coluna++) {
            matriz[linha][coluna] = matrizLista.get(i++);
         }
      }
      
      return matriz;
   }
}
