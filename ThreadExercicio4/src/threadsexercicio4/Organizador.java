package threadsexercicio4;

import java.util.Arrays;

class Organizador {

   private int[][] matriz;

   public Organizador() {
      matriz = new int[3][3];
   }

   public synchronized void organizar(int linha, int[] vetor) {

      Arrays.sort(vetor);

      for (int i = 0; i < 3; i++) {
         matriz[linha][i] = vetor[i];
      }
   }

   public int[][] getMatrizOrganizada() {
      return matriz;
   }
}
