import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadTXT {
    public static ArrayList<Shapes> returnShapes(String file) {
        ArrayList<Shapes> shapes = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            for (int i = 0; line != null; i++) {
                String[] shape = line.split(" ");
                if (shape[0].equals("C")) shapes.add(new Circle(Double.parseDouble(shape[1])));
                if (shape[0].equals("S")) shapes.add(new Square(Double.parseDouble(shape[1])));
                if (shape[0].equals("R")) shapes.add(new Rectangle(Double.parseDouble(shape[1]), Double.parseDouble(shape[2])));
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shapes;
    }
}
