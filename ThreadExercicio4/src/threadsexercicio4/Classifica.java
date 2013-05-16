package threadsexercicio4;

public class Classifica implements Runnable {

   private Organizador org; // objeto compartilhado
   private int linha;
   int[][] matriz = new int[3][3];

   Classifica(int linha, int[][] matriz, Organizador org) {
      this.matriz = matriz;
      this.org = org;
      this.linha = linha;
   }

   @Override
   public void run() {
      int[] vetor = new int[3];

      for (int coluna = 0; coluna < 3; coluna++) {
         vetor[coluna] = matriz[linha][coluna];
      }
      
      org.organizar(vetor);
   
   }
}
