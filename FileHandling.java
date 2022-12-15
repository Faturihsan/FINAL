import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void createfile(String x) {
        // TODO Auto-generated method stub
        try {
            File myObj = new File(x + ".txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public static void writefile(String x , float hasil){
    try {
        BufferedWriter buffer = new BufferedWriter( new FileWriter(x+ ".txt", true));
        buffer.write("Hasil Operasi adalah = " + Float.toString(hasil));
        buffer.newLine();
        buffer.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }
}
