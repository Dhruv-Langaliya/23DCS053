import java.io.*;

public class part_6_31th {

    public static void main(String[] args) 
    {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            System.out.println("Enter some text (type 'exit' to finish):");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) 
            {
                writer.write(line);
                writer.newLine();  // Add a new line after each input
            }

            System.out.println("Data written to output.txt using character stream!");

        } catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream("output.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("output_copy.txt")) 
             {

            int byteData;
            while ((byteData = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteData);  
            }

            System.out.println("Data copied to output_copy.txt using byte stream!");

        } catch (IOException e) {
            System.out.println("An error occurred during byte stream operations: " + e.getMessage());
        }
    }
}
