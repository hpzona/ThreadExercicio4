package threadsexercicio4;

public class Classifica implements Runnable {

   private Ordenar ordena; // objeto compartilhado
   private int linha;
   int[][] matriz;

   Classifica(int linha, int[][] matriz, Ordenar ordena) {
      this.matriz = matriz;
      this.ordena = ordena;
      this.linha = linha;
      
   }

   @Override
   public void run() {
      ordena.ordenar(linha, matriz);
   }
}
