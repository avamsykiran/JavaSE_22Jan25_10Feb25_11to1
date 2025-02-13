package com.cts.javafundas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App14IODemoWritingTextFile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("File Name: ");
		String fnm = scan.nextLine();
		
		List<String> lines = new ArrayList<>();
		
		String line =null;
		
		System.out.println("Type the content of the file '***' to stop: ");
		
		while(!"***".equals(line)) {
			line = scan.nextLine();
			if(!"***".equals(line)) {
				lines.add(line);
			}
		}
		
		Path filePath = Paths.get(fnm);
		try {
			Files.write(filePath, lines);
			System.out.println("File saved!");
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		
		scan.close();
	}

}
