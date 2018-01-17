package some;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TeamReader {
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println(file.isDirectory());
        System.out.println(Arrays.toString(file.listFiles()));
    }

    public Team read(String path) throws IOException {
        File file = new File(path);
//        "src/test/resources/file.txt";

        return new Team(file.getName());
    }
}
