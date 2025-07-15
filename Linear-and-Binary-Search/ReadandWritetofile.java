import java.io.*;

public class ReadandWritetofile {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("output.txt");
            String line;
            System.out.println("Enter text (type 'exit' to quit):");
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + "\n");
            }
            fw.close();
            br.close();
            isr.close();
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

