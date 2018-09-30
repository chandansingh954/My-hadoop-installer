
import java.io.*;

public class FormatNameNode {

    public void formatNameNode() {
        try {
            System.out.println("1");
            Process r = Runtime.getRuntime().exec("chmod 777 /home/hadoop/Desktop/HadoopUser/FormatNameNode.sh");
            System.out.println("2");
            ProcessBuilder pb = new ProcessBuilder("/home/hadoop/Desktop/HadoopUser/FormatNameNode.sh");
            System.out.println("3");
            Process p = pb.start();
            System.out.println("4");
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            System.out.println("5");
            String line = null;
            System.out.println("6");
            while ((line = reader.readLine()) != null) {
                System.out.println("7");
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("8");
            e.printStackTrace();
        }
    }
}
