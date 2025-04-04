import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) {
        String fileName = "output.txt";
        
        // Read multiline text from the console and write to a file
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
             
            System.out.println("Enter text (type 'exit' on a new line to stop):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine(); // Add a newline for proper formatting
            }

            System.out.println("Text successfully written to " + fileName);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read and display the content of the file
        System.out.println("\nContent of the file:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
