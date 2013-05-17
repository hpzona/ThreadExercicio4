package threadsexercicio4;

import java.util.Arrays;

class Ordenar {

   private int[][] matriz;

   public synchronized void ordenar(int linha, int[][] matriz) {
      int[]vetor = new int[3];
      this.matriz = matriz;
      
      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = matriz[linha][i];
      }
      
      Arrays.sort(vetor);

      for (int i = 0; i < vetor.length; i++) {
         matriz[linha][i] = vetor[i];
      }
   }

   public int[][] getMatrizOrdenada() {
      return this.matriz;
   }
}
