import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Persegi {
    int s1;
    int s2;
    char ans;
    float hasil;


        public void luas(){ 
        
            do{
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan nilai sisi pertama = ");
                s1 = input.nextInt();
                System.out.print("Masukkan nilai sisi kedua = ");
                s2 = input.nextInt();
                hasil =  s1*s2;
                if(s1==s2){
                    FileHandling.createfile("luas_persegi");
                    FileHandling.writefile("luas_persegi", hasil);
                }
                else{
                    FileHandling.createfile("luas_persegipanjang");
                    FileHandling.writefile("luas_persegipanjang", hasil);
                }
                
                System.out.print("Masih mau mencari luas? (Y/N) = ");
                ans = input.next().charAt(0);
                
                }
                while (ans == 'Y');
            
            }     


        void keliling(){
            do{
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan nilai sisi pertama = ");
                s1 = input.nextInt();
                System.out.print("Masukkan nilai sisi kedua = ");
                s2 = input.nextInt();
                hasil = 2*(s1 + s2);
                if(s1==s2){
                    FileHandling.createfile("keliling_persegi");
                    FileHandling.writefile("keliling_persegi", hasil);
                }
                else{
                    FileHandling.createfile("keliling_persegipanjang");
                    FileHandling.writefile("keliling_persegipanjang", hasil);
                }
                System.out.print("Masih mau mencari keliling ? (Y/N) = ");
                ans = input.next().charAt(0);
                
                } while (ans == 'Y');
            }
        
}
