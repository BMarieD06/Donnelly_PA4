import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class DuplicateCounter {
	
	static Map<String,Integer> wordCounter = new HashMap<String,Integer>();
	

	public static void count(File dataFile) throws FileNotFoundException
	{
		Scanner input = new Scanner(dataFile);
		
		while(input.hasNext()) {
			String nextWord = input.next();
			Integer count = wordCounter.get(nextWord);
			
			if(count != null) {
				wordCounter.put(nextWord, count+1);
				
			}
			else {
				wordCounter.put(nextWord, 1);
			}
		}
		
		input.close();
		
	}
	
	public static void write(File outputFile ) throws IOException {
		
		try (BufferedWriter output = new BufferedWriter(new FileWriter(outputFile))){

		
			Iterator<Entry<String, Integer>> it = wordCounter.entrySet().iterator();
		
			while(it.hasNext()) {
			
				Map.Entry<String, Integer> pairs = it.next();
				output.write(pairs.getKey() + " ");
				output.write(pairs.getValue() + "\n");
			
			}
		
			output.close();
		}
	}
}
