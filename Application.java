import java.io.*;

public class Application extends DuplicateRemover {

	public static void main(String[] args) throws IOException {
	
		File inputFile = new File("problem1.txt");
		File outputFile = new File("unique_words.txt");
		
		remove(inputFile);
		write(outputFile);
	
		
		

	}

}
