/*
 * Names: Joseph Black & Ronald Zielaznicki
 * Program: Program4
 * Date: October 10, 2013
 *
 */
 
//A Player class to encompass all of the properties of a player.
public class Player {
	int position_x, position_y;
	int score;
	char symbol;
	
	//Default constructor. Initializes all values to null.
	Player(){	
	}
	
	//Constructor. Initializes all but symbol to 0.
	//Initializes symbol to the given parameter.
	Player(char sym){
		position_x = 0;
		position_y = 0;
		
		score = 0;
		
		symbol = sym;
	}
	
	//Sets the position of the Player object.
	public void setXY(int x, int y){
		position_x = x;
		position_y = y;
	}
	
	//Sets the score of the Player object.
	public void setScore(int s){
		score = s;
	}
	
	//Returns position_x of the Player object.
	public int getX(){
		return position_x;
	}
	
	//Returns position_y of the Player object.
	public int getY(){
		return position_y;
	}
	
	//Returns symbol of the Player object.
	public char getSymbol(){
		return symbol;
	}
	
	//Returns score of the Player object.
	public int getScore(){
		return score;
	}
	

}
