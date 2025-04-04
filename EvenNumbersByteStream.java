import java.io.*;

public class EvenNumbersByteStream {
    public static void main(String[] args) {
        byte[] numbers = {10, 12, 22, 30, 40, 50, 60, 70, 80}; // All within byte range
        String fileName = "even_numbers.dat";

        // Write even numbers using byte stream
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (byte num : numbers) {
                if (num % 2 == 0) {
                    fos.write(num);  // Writing single byte values
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read even numbers using byte stream
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int value;
            System.out.println("Even numbers read from file:");
            while ((value = fis.read()) != -1) {
                System.out.print(value + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
