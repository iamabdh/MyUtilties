import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.MutableComboBoxModel;

public class FileMut {
	final static String DIR_FILE_NAME = "data/data.txt";
	final static String DIR_FILE_NAME_CSV = "data/student.csv";
	final static String DIR_FILE_STUDENT_CSV = "data/student1.csv";
	final static String DIR_FILE_TEXT_INPUT = "data/input.txt";
	final static String DIR_FILE_TEXT_RESULT = "data/result.txt";
	public static void readWriteFromFile() {
		File dataFile  = new File(FileMut.DIR_FILE_NAME);
		if (dataFile.exists()) {
			System.out.println("File Found");
			Scanner fileScanner;
			try {
				fileScanner = new Scanner(dataFile);
				int i = 0;
				while(fileScanner.hasNextLine()) {
					System.out.println(++i + " >> "+fileScanner.nextLine());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Append to file");
			
			try {
				FileWriter newFileWriter = new FileWriter(FileMut.DIR_FILE_NAME, true);
				newFileWriter.write("appending to it #1\n");
				newFileWriter.write("appending to it #2\n");
				newFileWriter.write("appending to it #3\n");
				newFileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} else {
			System.out.println("File not Found");
			try {
				System.out.println("creating new File: " + FileMut.DIR_FILE_NAME);
				FileWriter newFileWriter = new FileWriter(FileMut.DIR_FILE_NAME);
				System.out.print("Wrinting first lines to: " + FileMut.DIR_FILE_NAME);
				newFileWriter.write("this is first line\n");
				newFileWriter.write("this is second line\n");
				newFileWriter.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public static void PrintStudentDataFromCSV() {
		File dataFile  = new File(FileMut.DIR_FILE_NAME_CSV);
		HashMap<String, ArrayList<String>> studentDataHashMap = new HashMap<>();
		if (dataFile.exists()) {
			Scanner fileScanner = null;
			try {
				fileScanner = new Scanner(dataFile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(fileScanner.hasNextLine()) {
				String xString = fileScanner.nextLine();
				String[] arrStrings = xString.split(",");
				ArrayList<String> newArrayList = new ArrayList<>();
				newArrayList.add(arrStrings[1]);
				newArrayList.add(arrStrings[2]);
				newArrayList.add(arrStrings[3]);
				studentDataHashMap.put(arrStrings[0], newArrayList);
			}
			fileScanner.close();
		} else {
			System.out.println("File not exists: " + FileMut.DIR_FILE_NAME_CSV);
		}
		System.out.println(studentDataHashMap);
	} 
	
	public static void StoreStudentDataIntoCSV() {
		File dataFile  = new File(FileMut.DIR_FILE_STUDENT_CSV);
		Scanner inputScanner = new Scanner(System.in);
		int i = 1;
		if (dataFile.exists()) {
			Scanner fileScanner = null;
			try {
				fileScanner = new Scanner(dataFile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(true) {
				System.out.print("Name of student: ");
				String nameString =  inputScanner.nextLine();
				System.out.print("Email of student: ");
				String emailString  =  inputScanner.nextLine();
				try {
					FileWriter newFileWriter = new FileWriter(FileMut.DIR_FILE_STUDENT_CSV, true);
					String xString = String.format("%d, %s, %s\n", i++, nameString, emailString);
					System.out.println();
					newFileWriter.write(xString);
					newFileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void readFromFileCap() {
		File dataFile  = new File(FileMut.DIR_FILE_TEXT_INPUT);
		String lowerCaseInString = new String();
		String upperCaseInString = new String();
		if (dataFile.exists()) {
			Scanner fileScanner = null;
			try {
				fileScanner = new Scanner(dataFile);
				while (fileScanner.hasNextLine()) {
					lowerCaseInString += fileScanner.nextLine() + "\n";
				}
				
				FileWriter newFileWriter = new FileWriter(FileMut.DIR_FILE_TEXT_RESULT, true);
				for (int i = 0; i < lowerCaseInString.length(); i++) {
					upperCaseInString += Character.toUpperCase(lowerCaseInString.charAt(i));
				}
				System.out.println(upperCaseInString);
				newFileWriter.write(upperCaseInString);
				newFileWriter.close();
				System.out.println("Converted Successfully");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("File not exist");
		}
	}
}
