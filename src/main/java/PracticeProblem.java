import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

    public static void main(String args[]) {
        
    }

    public static String readFile(String filename) {
        StringBuilder sb = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {}
        
        return sb.toString();
    }

    public static String backwardsReadFile(String filename) {
        String content = readFile(filename);
        StringBuilder sb = new StringBuilder(content);
        return sb.reverse().toString();
    }
}

