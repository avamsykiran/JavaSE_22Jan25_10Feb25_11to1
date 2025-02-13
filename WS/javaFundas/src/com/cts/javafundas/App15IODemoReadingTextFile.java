package com.cts.javafundas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App15IODemoReadingTextFile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("File Name: ");
		String fnm = scan.nextLine();
		
		Path filePath = Paths.get(fnm);
		
		try {
			List<String> lines = Files.readAllLines(filePath);
			lines.stream().forEach(System.out::println);
		} catch (IOException e) {		
			e.printStackTrace();
		}		
		
		scan.close();
	}

}
