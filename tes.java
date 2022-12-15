import java.util.*;
// ja

//  for(int i=1; i<10 ; i++){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Masukkan nilai alas :");
//         int alas = input.nextInt();
//         System.out.println("Masukkan nilai tinggi :");
//         int tinggi = input.nextInt();
//         int luas = alas*tinggi / 2;

public class tes {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai alas : ");
        
        int alas = input.nextInt();
        System.out.println("Masukkan nilai tinggi : ");
        int tinggi = input.nextInt();
                
        int hasil = alas*tinggi/2;
        System.out.println("sama=" + hasil);

        
    }
}

