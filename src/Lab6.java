import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Lab6 {

	public static void main(String[] args) throws IOException
	{
		/*
		 * 6.2 Exercise 1: Q4, Q5, Q6
		 * The algorithms sorts the arrays in descending order.
		 * 
		 * Sort A is the Bubble Sort algorithm.
		 * Sort B is the Radix algorithm.
		 * Sort C is the Quick Sort algorithm.
		 * 
		 * 6.2 Exercise 2: Q7, Q8, Q9, Q10
		 * 
		 * Rank from fastest to slowest:
		 * Sort B
		 * Sort C
		 * Sort A
		 * 
		 * No, Sort A will always be slow when the input size gets larger. Sort B and Sort C are ranking independent. If the input size gets bigger, Sort C will become faster even if
		 * it was slow in the start. If the input size gets bigger, Sort B will become slower even if it was
		 * fast in the start.
		 * 
		 */

		//PrintWriter out = new PrintWriter(new FileWriter("C:/Users/Parth/Desktop/Lab6Answers1.txt"));
		int testRun = 1;
		double totalRunTime = 0;
		double avg;

		for (int i = 0; i < testRun; i++)
		{
			long beforeTime = System.nanoTime();
			ThreeSorts.SortA(randomArray(1000));
			long afterTime = System.nanoTime();
			long elapsedTime = afterTime - beforeTime;
			//out.println(elapsedTime);
//			if (afterTime < beforeTime)
//			{
//				System.out.println("ERROR!!!!");
//				break;
//			}
			//System.out.println(beforeTime + " " + afterTime);
			totalRunTime += elapsedTime;
		}
		System.out.println(totalRunTime);
		avg = (totalRunTime / testRun);
		System.out.println("This is the average of " + testRun + " test runs: " + avg + " nanoseconds.");
		//out.close();

		//showArray(randomArray(3));
		//showArray(ThreeSorts.SortA(randomArray(5)));
	}

	// 6.2 Exercise 1: Q1
	private static ArrayList<Integer> randomArray(int n)
	{
		Random rand = new Random();
		ArrayList<Integer> randNumList = new ArrayList<Integer>();
		rand.setSeed(System.currentTimeMillis());

		for (int i = 0; i < n; i++)
		{
			Integer r = Math.abs(rand.nextInt() % 256);
			randNumList.add(r);
		}
		return randNumList;
	}

	// 6.2 Exercise 1: Q2, Q3
	private static void showArray(ArrayList<Integer> randArrayList)
	{
		int n = randArrayList.size();
		ArrayList<Integer> showArrayList = new ArrayList<Integer>(n);

		for (int i = 0; i < n; i++)
		{
			int arrayIndexNum = randArrayList.get(i);
			showArrayList.add(arrayIndexNum);
		}
		System.out.println(showArrayList);
	}

}
