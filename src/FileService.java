import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileService {
    public static String[] read(String path) throws Exception {
        Path x = Paths.get(path);
        System.out.println(x);
        return Files.readAllLines(x).toArray(new String[0]);
    }
}