import java.io.*;
import java.util.*;

public class DuplicateRemover {
	
	static HashSet<String> uniqueWords = new HashSet<String>();
	static ArrayList<String> outputWords = new ArrayList<String>();

	public static void remove(File dataFile) throws FileNotFoundException {
		
		Scanner input = new Scanner(dataFile);
		
		while(input.hasNext()) {
			String[] words = input.next().split(" ");
			String edited = "";
			
			for(int i = 0; i<words.length; i++)
			{
				if(uniqueWords.add(words[i]))
				{
					edited += words[i] + " ";
				}
						
			}
			
			
			if(!edited.equals("")) {
				outputWords.add(edited);
			}
		}
		
		input.close();
			
	}
	
	public static void write(File outputFile) throws IOException {
	
		try(BufferedWriter output = new BufferedWriter(new FileWriter(outputFile))){
		
			output.write(String.join("\n", outputWords));
			output.close();
		}
	}
	
}
