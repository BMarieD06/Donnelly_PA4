import java.io.File;
import java.io.IOException;

public class Application extends DuplicateCounter {

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("problem2.txt");
		File outputFile = new File("unique_word_count.txt");
		
		count(inputFile);
		write(outputFile);

	}

}
