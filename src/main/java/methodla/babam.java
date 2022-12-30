package methodla;

public class babam {
  static int basmaklartoplami(int sayi){if (sayi==0){
    return 0;}else return sayi%10+ basmaklartoplami(sayi/10);}

  public static void main(String[] args) {
    System.out.println("basamak toplami "+basmaklartoplami(45612));
  }
}
