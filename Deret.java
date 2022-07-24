import java.util.Scanner;

class Deret {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        Scanner inputbanyak = new Scanner(System.in);
        Scanner inputbeda = new Scanner(System.in);
        
            System.out.println("Belajar Deret Aritmatika, Geometri dan mehitung Faktorial\n\n\n");
            
          
            int jumlah_deret,i;
            int beda;
            int banyak;

            System.out.print("Masukkan banyak angka yang mau dicetak [2..10]    : ");
            beda = inputbanyak.nextInt();

            System.out.print("Masukkan beda masing-masing angka [2..9]          : ");
            beda = inputbeda.nextInt();
            
            jumlah_deret = input.nextInt();
            
            for (i=1; i<=jumlah_deret; i++) {
            System.out.print(i * beda + " ");
              }
            
    }
}
