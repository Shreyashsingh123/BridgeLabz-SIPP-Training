import java.io.*;

public class ReadBinarydata {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("data.txt");
            InputStreamReader isr = new InputStreamReader(f, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            isr.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
