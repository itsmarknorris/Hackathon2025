import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.File;
import java.io.FileNotFoundException;
public class directories {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String direct = "TestFolder";
		String n = "C:\\Users\\norri";
		String path = n + "\\" + direct;
		File directory = new File(path);
		directory.mkdir();
		//Files.move(Paths.get("C:\\Users\\norri\\TestFolder\\THING.txt"), Paths.get("C:\\Users\\norri\\THING.txt"));
		System.out.println(Files.probeContentType(Paths.get("C:\\VirtualStudioFiles\\First Pygame.py")));
	}

}
