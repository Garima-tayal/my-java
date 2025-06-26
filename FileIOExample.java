
import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        
        String fileName = "myfile.txt";
        
        // Writing to a file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello Garima!\n");
            writer.write("This is a File I/O Example.\n");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        // Reading from the file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            
            String line;
            System.out.println("\nReading from the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

