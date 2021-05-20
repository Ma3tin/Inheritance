import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shapes> shapes = LoadTXT.returnShapes("Shapes");
        long content = 0;
        for (int i = 0; i < shapes.size(); i++) content += shapes.get(i).calculateContent();
        System.out.println(content / shapes.size());
    }

}
