import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileExample2 {

	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt");
		// Print Writer
		// PrintWriter out = new PrintWriter(file);
		// out.println("Richard");
		// out.println(33);
		// out.close();
		// read file data
		Scanner input = new Scanner(file);
		String name = input.nextLine();
		int age = input.nextInt();
		System.out.println("Name: " + name + " age: " + age);
	}

}
