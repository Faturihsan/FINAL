import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Segitiga extends Bangunruang{
        // void Segitiga(int alas,int tinggi,int hasil){
    //     this.alas = alas;
    //     this.tinggi = tinggi;
    // }
    
    public void luas(){ 
    
    do{
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai alas = ");
        s1 = input.nextInt();
        System.out.print("Masukkan nilai tinggi = ");
        s2 = input.nextInt();
        hasil =  s1*s2/2;
        FileHandling.createfile("luas_segitiga");
        FileHandling.writefile("luas_segitiga", hasil);
        System.out.print("Masih mau mencari luas segitiga? (Y/N) = ");
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
        System.out.print("Masukkan nilai sisi ketiga = ");
        s3 = input.nextInt();
        hasil = s1 + s2 + s3;
        FileHandling.createfile("keliling_segitiga");
        FileHandling.writefile("keliling_segitiga", hasil);
        System.out.print("Masih mau mencari keliling segitiga? (Y/N) = ");
        ans = input.next().charAt(0);
        
        } while (ans == 'Y');
    }


}



