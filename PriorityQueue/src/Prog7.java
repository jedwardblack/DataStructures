public class Prog7
{
  public static void main(String[] args)
  {
    // Read dictionary of ranked words.
    // Words having higher values are more significant for our application.
    WordDictionary dictionary = new WordDictionary();
    WordPriorityQueue queue = new WordPriorityQueue();
    
    if(!DictionaryReader.read("dictionary.txt", dictionary))
      System.out.println("Failed to read dictionary.txt file.");
    
    // Read a text message and get an array of words.
    String[] messgWords = WordReader.read("message.txt");
    if(messgWords != null)
    {
      for(int w = 0; w < messgWords.length; w++)
      { 
      	// Check if each word in the message is found in the dictionary.
      	// If yes, then lookup that word's rank and insert into MAX HEAP.
      	if(dictionary.isWord(messgWords[w])) {
      		queue.insert(messgWords[w], dictionary.getRank(messgWords[w]));
      	}
      }
      //Prints top 5 RankedWords in the file.
      for(int i = 0; i<4; i++) {
    	  RankedWord top = queue.remove();
    	  System.out.println("Word: "+top.getWord()+"\tRank: "+top.getRank());
      }
    }
    else
      System.out.println("Failed to read message.txt file.");
  }
}
