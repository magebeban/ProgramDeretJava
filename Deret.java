import java.util.Scanner;

class Deret {

    public static void main(String args[]) {
        
        
        Scanner inputbanyak = new Scanner(System.in);
        Scanner inputbeda = new Scanner(System.in);
        Scanner keluar = new Scanner(System.in);
        boolean start = true;
        
        System.out.println("Belajar Deret Aritmatika, Geometri dan mehitung Faktorial\n\n\n");
            
          
            int banyak,i;
            int beda;
            //String ulang;
            for (i=1; i<=banyak; i++);

            System.out.print("Masukkan banyak angka yang mau dicetak [2..10]    : ");
            banyak = inputbanyak.nextInt();

            //Validasi inputan banyak angka min 2 maks 10
                if (banyak.length() >= 25) {
                    System.out.println("min 2 maks 10");
                } else {
                    System.out.print("Masukkan NIM Anda [Harus 10 Karakter] : ");
                    String nim = input_nim.nextLine();
                    System.out.println("");
                    
            System.out.print("Masukkan beda masing-masing angka [2..9]          : ");
            beda = inputbeda.nextInt();
            
            System.out.println("Deret Aritmatika          : ");
            System.out.print( i * beda + " ");

            System.out.println("Deret Geometri            : ");   
            
             //jadi ngaco ketika pake y/t
                /*System.out.print("Apakah anda ingin mengulang [y/t] : ");
                ulang = keluar.nextLine();
    
                  if (ulang.equalsIgnoreCase("t")) {
                      start = false;    
                }
                
            import java.util.Scanner;

            class MainProgram {
               public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int faktorial = 1;
        System.out.println("Masukkan bilangan bulat : ");
        int n = in.nextInt();
        if (n <= 0){
            System.out.println("Angka yang dimasukkan bukan bilangan bulat atau adalah angka 0");
        } else {
            for (int i = 1; i <= n; i++){
                faktorial *= i;
            }
            System.out.println("Hasil faktorial dari " + String.valueOf(n) + " adalah " + String.valueOf(faktorial));
        }

        in.close();
    }
}*/   
    }
}
