//Name: Joseph E. Black, Jr.
//Submission: Program 5
//Type of computer processor: 2.26GHz Intel Core2Duo 
//Amount of RAM: 8GB 1067 MHz DDR3
public class Main {

	public static void main(String[] args) {
		
		LinkedIntQueue linkedIntQueue = new LinkedIntQueue();
		CircularIntQueue circularIntQueue = new CircularIntQueue();
		
		for(int i=1; i<=100; i++) {
			linkedIntQueue.insert(i);
			circularIntQueue.insert(i);
		}
		System.out.println("List Type\t\tN\t\tElapsed Time\tAverage Time");
		System.out.println("_________\t\t_\t\t____________\t____________");
		for(long j = 100; j<=1000000000; j = j*j)
		{
			long startTime = System.currentTimeMillis();
			for(long i=1; i<=j; i++) {
				int x = linkedIntQueue.remove();
				linkedIntQueue.insert(x);
			}
			long endTime = System.currentTimeMillis();
			long linkedTime = endTime-startTime;
			System.out.println("LinkedIntQueue\t\t"+j+"\t\t"+(linkedTime)+"\t\t"+(double)linkedTime/j);
			
			startTime = System.currentTimeMillis();
			for(long i=1; i<=j; i++) {
				int x = circularIntQueue.remove();
				circularIntQueue.insert(x);
			}
			endTime = System.currentTimeMillis();
			long circularTime = endTime-startTime;
			System.out.println("CircularIntQueue\t"+j+"\t\t"+(circularTime)+"\t\t"+(double)circularTime/j);
			long winner = linkedTime-circularTime;
			if(winner==0)
				System.out.println("List Types are equally traversible at N = "+j+".");
			else if(winner<0)
				System.out.println("LinkedIntQueue is quicker to traverse at N = "+j+".");
			else if(winner>0)
				System.out.println("CircularIntQueue is quicker to traverse at N = "+j+".");
			System.out.println();
		}
		System.out.println("Test Complete");
	}

}
