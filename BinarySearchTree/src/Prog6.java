import java.util.ArrayList;


public class Prog6 {

	public static void main(String[] args) {
		
		int[] ducks = DuckReader.read("ducks.txt");
		ArrayList tosses = TossReader.read("balloons.txt");
		RubberDuckBST tree = new RubberDuckBST();
		int i = 0;
		while(i<ducks.length){
			tree.insert(ducks[i]);
			i++;
		}
		i = 0;
		int points = 0;
		while(i<tosses.size()){
			Toss toss = (Toss)tosses.get(i);
			int hit = 0;
			while(toss != null && hit>=0){
				hit = tree.checkToss(toss.getCoord(), toss.getRadius());
				if(hit>=0){
					System.out.println("Balloon tossed at position "+toss.getCoord()+
							" with splash radius "+toss.getRadius()+" splashed duck at position "
							+hit+".");
					points++;
					hit = -1;
				}
				else{
					System.out.println("Balloon tossed at position "+toss.getCoord()+
							" with splash radius "+toss.getRadius()+" missed.");
				}	
			}
		i++;
		}
		System.out.println("Total points: "+points);
	}
}
