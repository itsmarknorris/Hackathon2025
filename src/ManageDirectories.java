//package com.example;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
public class ManageDirectories {

	public void createDirectories(String pathName, String directoryName) {
		String path = pathName + "\\" + directoryName;
		File directory = new File(path);
		directory.mkdir();
		String imagePath = path + "\\Pictures";
		File imageDirectory = new File(imagePath);
		imageDirectory.mkdir();
		String hwPath = path + "\\Homework";
		File hwDirectory = new File(hwPath);
		hwDirectory.mkdir();
		String notesPath = path + "\\Notes";
		File notesDirectory = new File(notesPath);
		notesDirectory.mkdir();
	}
	
	public void moveFile(String originalDirectory, String fileName, String directoryName, String destination) {
		try {
			Files.move(Paths.get(originalDirectory + "\\" + fileName), Paths.get(directoryName + "\\" + destination + "\\" + fileName));
		}
		catch (Exception e) {return;}
	}
}
