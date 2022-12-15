import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Lingkaran extends Bangunruang {
    

    interface myInterface{
        float getPiValue();
    }

    // private float phi;  

    // public Lingkaran(){
    //     this.phi = 3.14f;
    // }

    // public float getfloatPrivate(){
    //     return this.phi;
    // };
    @Override
    void luas() {
        do{
            Scanner input = new Scanner(System.in);
    
            System.out.print("Masukkan nilai radius = ");
            s1 = input.nextInt();
            myInterface Ref;
            Ref = () -> 3.14f;
            hasil =  Ref.getPiValue()*s1*s1;
            FileHandling.createfile("luas_lingkaran");
            FileHandling.writefile("luas_lingkaran" , hasil);
            System.out.print("Masih mau mencari luas lingkaran? (Y/N) = ");
            ans = input.next().charAt(0);
            
            }
            while (ans == 'Y');
        }
        // TODO Auto-generated method stub
        
    

    @Override
    void keliling() {
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan nilai radius = ");
            s1 = input.nextInt();
            myInterface Ref;
            Ref = () -> 3.14f;
            hasil = Ref.getPiValue()*2*s1;
            FileHandling.createfile("keliling_lingkaran");
            FileHandling.writefile("keliling_lingkaran" , hasil);
            System.out.print("Masih mau mencari keliling lingkaran? (Y/N) = ");
            ans = input.next().charAt(0);
            
            } while (ans == 'Y');
        }
    }
    
        // TODO Auto-generated method stub
        
    

   

    

