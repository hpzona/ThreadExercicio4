package threadsexercicio4;

public class Classifica implements Runnable {

   private Organizador org; // objeto compartilhado
   private int linha;
   int[][] matriz = new int[3][3];;
   int[] vetor;

   Classifica(int linha, int[][] matriz, Organizador org) {
      vetor = new int[3];
      this.matriz = matriz;
      this.vetor = vetor;
      this.org = org;
      this.linha = linha;
      
   }

   @Override
   public void run() {

      for (int i = 0; i < 3; i++) {
         vetor[i] = matriz[linha][i];
      }

      org.organizar(linha, vetor);
   }
}
