//Represents one word and its risk priority such as word: "sabotage" risk: 1.0.
public class RankedWord {
	
	//String for a given word
	private String word;
	
	//Type double value between 0.0 and 1.0, inclusive, 
	//with higher values denote greater significance.
	private double rank;
	
	//default constructor initializes word to empty string and rank of 0.0. 
	public RankedWord() {
		word = "";
		rank = 0.0;
	}
	
	//Sets word to S and sets rank to R
	public RankedWord(String S, double R) {
		word = S;
		rank = R;
	}
	
	//Returns word as a String
	String getWord() {
		return this.word;
	}
	
	//Returns rank assumed to be between 0.0 to 1.0, inclusive.
	double getRank() {
		return this.rank;
	}

}
