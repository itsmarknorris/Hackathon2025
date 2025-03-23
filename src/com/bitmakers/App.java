package com.bitmakers;

import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.GraphicsConfiguration;

public class App {
	public static final Font MAIN_FONT = new Font("Arial", Font.PLAIN, 30);
	public static final Dimension SCREEN_DIMENSION = Toolkit.getDefaultToolkit().getScreenSize();
	public static final GraphicsConfiguration gConfig = GraphicsEnvironment.getLocalGraphicsEnvironment()
	.getDefaultScreenDevice().getDefaultConfiguration();
	public static final double GRAPHICS_SCALE_X = gConfig.getDefaultTransform().getScaleX();
	public static final double GRAPHICS_SCALE_Y = gConfig.getDefaultTransform().getScaleY();
	/*
    public void start(Stage stage) throws IOException {
        ManageDirectories directories = new ManageDirectories();
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("CreateFolder", "ExistingFolder");
        choiceBox.setValue("CreateFolder");

        TextField textField1 = new TextField();
        textField1.setPrefWidth(300);
        textField1.setPromptText("Enter folder name only if creating");

        TextField textField2 = new TextField();
        textField2.setPrefWidth(300);
        textField2.setPromptText("Enter folder address only if creating");

        TextField textField3 = new TextField();
        textField3.setPrefWidth(300);
        textField3.setPromptText("Enter File name if folder exists");

        TextField textField4 = new TextField();
        textField4.setPrefWidth(300);
        textField4.setPromptText("Enter File address if folder exists");

        TextField textField5 = new TextField();
        textField5.setPrefWidth(300);
        textField5.setPromptText("Enter address where to add file");

        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.getItems().addAll("Homework", "Notes", "Pictures");

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            String selectedOption = choiceBox.getValue();
            String text1 = textField1.getText();
            String text2 = textField2.getText();
            if (selectedOption.equals("CreateFolder")) {
                directories.createDirectories(text2, text1);
            }
            else if (selectedOption.equals("ExistingFolder")){
                String text3 = textField3.getText();
                String text4 = textField4.getText();
                String text5 = textField5.getText();
                String text6 = choiceBox2.getValue();
                directories.moveFile(text4, text3, text5, text6);
            }
        });
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(12);
        grid.setHgap(12);

        grid.add(new Label("Select Option:"), 0, 0);
        grid.add(choiceBox, 1, 0);
        grid.add(new Label("Folder Name:"), 0, 1);
        grid.add(textField1, 1, 1);
        grid.add(new Label("Destination:"), 0, 2);
        grid.add(textField2, 1, 2);
        grid.add(new Label("File Name:"), 0, 3);
        grid.add(textField3,1,3);
        grid.add(new Label("File location:"),0,4);
        grid.add(textField4, 1, 4);
        grid.add(new Label("Folder:"),0,5);
        grid.add(textField5,1,5);
        grid.add(new Label("Select type:"),0,6);
        grid.add(choiceBox2,1,6);
        grid.add(submitButton, 1, 7);
    }
*/
    public static void main(String[] args) {
        System.out.println("Program has started...");
        System.out.println(GRAPHICS_SCALE_X + " " + GRAPHICS_SCALE_Y);
        startUIInstance();
    }
    
    public static void startUIInstance() {
    	JFrame mainWindow = new JFrame("Class Assignment Organizer");
    	//Get the content pane and remove the default layout
    	mainWindow.getContentPane().setLayout(null);
    	mainWindow.setSize(1200, 1000);
    	mainWindow.setResizable(false);
    	mainWindow.setVisible(true);
    	mainWindow.setDefaultCloseOperation(3);
    	
    	//Set the start location of the window to the center of the screen
    	mainWindow.setLocation((int)(SCREEN_DIMENSION.width / 2) - (mainWindow.getSize().width / 2),
    	(int)(SCREEN_DIMENSION.height / 2) - (mainWindow.getSize().height / 2));
    	
    	//Add everything to panel
    	JPanel mainPanel = new JPanel();
    	
    	//Create UI components
    	JButton submitButton = new JButton("Test Button");
    	submitButton.setLocation(50, 50);
    	submitButton.setSize(350, 150);
    	submitButton.setFont(MAIN_FONT);
    	
    	mainPanel.add(submitButton);
    	mainWindow.add(mainPanel);
    	mainWindow.getContentPane().add(mainPanel);
    	mainWindow.getContentPane().add(submitButton);
    }

}