import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.File;
import java.io.FileNotFoundException;
public class ManageDirectories {

	public void createDirectories(String pathName, String directoryName) {
		String path = pathName + "\\" + directoryName;
		File directory = new File(path);
		directory.mkdir();
		String imagePath = path + "\\Images";
		File imageDirectory = new File(imagePath);
		imageDirectory.mkdir();
		String assignmentPath = path + "\\Texts";
		File assignmentDirectory = new File(assignmentPath);
		assignmentDirectory.mkdir();
		String videoPath = path + "\\Videos";
		File videoDirectory = new File(videoPath);
		videoDirectory.mkdir();
	}
	
	public void moveFile(String originalDirectory, String fileName, String directoryName) {
		try {
			Files.move(Paths.get("originalDirectory + \"\\\\\" + fileName"), Paths.get(selectFolder(directoryName, fileName)));
		}
		catch (Exception e) {return;}
	}
	
	private String selectFolder(String directoryName, String fileName) {
		try {
			//String n = Files.probeContentType(Paths.get("C:\\VirtualStudioFiles\\First Pygame.py"));
			String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
			if (extension.equals("png")) return directoryName + "\\Images\\" + fileName;
			if (extension.equals("mov") || extension.equals("MP4")) {
				return directoryName + "\\Videos\\" + fileName;
			}
			if (extension.equals("txt") || extension.equals("csv")) {
				return directoryName + "\\Texts\\" + fileName;
			}
			else return "";
		}
		catch (Exception e) { 
			return "";
			}
	}
}
