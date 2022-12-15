import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;


public class Final {
    void Ops(){
        System.out.println("*------ PILIH OPERASI-------- *");
        System.out.println("*       [1] Luas Bangun       *");
        System.out.println("*       [2] Keliling Bangun   *");
        System.out.println("*       [3] Informasi         *");
        System.out.println("-------------------------------");
        System.out.print("Masukkan Pilihan = ");
    }

    public static void main(String[] args) {
        int choice;
        do{
    
            System.out.println("----- APLIKASI DIJALANKAN -----");
            System.out.println("*                             *");
            System.out.println("*     PILIH BANGUN DATAR      *");
            System.out.println("*       [1] Segitiga          *");
            System.out.println("*       [2] Persegi           *");
            System.out.println("*       [3] Persegi Panjang   *");
            System.out.println("*       [4] Lingkaran         *");
            System.out.println("*       [5] Tutup Aplikasi    *");
            System.out.println("-------------------------------");

            System.out.print("Masukkan Pilihan = ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
                switch(choice){
                    case 1:
                    Final ops1 = new Final();
                    ops1.Ops();
                    
                    int x = 0;
                    x = input.nextInt();
                    if(x == 1){
                        Segitiga segitiga1 = new Segitiga();  
                        segitiga1.luas();     
                    }else if(x == 2){
                        Segitiga segitiga1 = new Segitiga();
                        segitiga1.keliling();
                    }else{
                        Info myInfo = Info.SEGITIGA;
                        System.out.println("Jumlah Sisi : " +myInfo.sisi);
                        System.out.println("Total Derajat : " +myInfo.derajat);
                        System.out.println("3D MODEL : " +myInfo.model3d);
                    }
                    break;

                    case 2:
                    Final ops2 = new Final();
                    ops2.Ops();

                    x = input.nextInt();
                    if(x == 1){
                        Persegi persegi1 = new Persegi();  
                        persegi1.luas();     
                    }else if(x == 2){
                        Persegi persegi1 = new Persegi();
                        persegi1.keliling();
                    }else{
                        Info myInfo = Info.PERSEGI;
                        System.out.println("Jumlah Sisi : " +myInfo.sisi);
                        System.out.println("Total Derajat : " +myInfo.derajat);
                        System.out.println("3D MODEL : " +myInfo.model3d);
                    }
                    break;

                    case 3:
                    Final ops3 = new Final();
                    ops3.Ops();

                    x = input.nextInt();
                    if(x == 1){
                        PersegiPanjang persegip1 = new PersegiPanjang();  
                        persegip1.luas();     
                    }else if(x == 2){
                        PersegiPanjang persegip1 = new PersegiPanjang();
                        persegip1.keliling();
                    }else{
                        Info myInfo = Info.PERSEGI_PANJANG;
                        System.out.println("Jumlah Sisi : " +myInfo.sisi);
                        System.out.println("Total Derajat : " +myInfo.derajat);
                        System.out.println("3D MODEL : " +myInfo.model3d);
                        
                    }
                    break;

                    case 4:
                    Final ops4 = new Final();
                    ops4.Ops();

                    x = input.nextInt();
                    if(x == 1){
                        Lingkaran lingkaran1 = new Lingkaran();  
                        lingkaran1.luas();     
                    }else if(x == 2){
                        Lingkaran lingkaran1 = new Lingkaran();
                        lingkaran1.keliling();
                    }else{
                        Info myInfo = Info.PERSEGI_PANJANG;
                        System.out.println("Jumlah Sisi : " +myInfo.sisi);
                        System.out.println("Total Derajat : " +myInfo.derajat);
                        System.out.println("3D MODEL : " +myInfo.model3d);
                        
                    }
                    break;

                    case 5:
                    System.out.println("------ APLIKASI BERHENTI-------");
                    break;
            }
        }while(choice!=5);

        
    }
}



