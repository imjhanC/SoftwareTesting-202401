package my.edu.utar;

public class RandomFindLargest {

	RandomGeneratorClass rgc = new RandomGeneratorClass();

	public int findLargestNumberInRandomArray(int arrLength, int numLimit) {

		// first create an integer array of the desired size
		// then populate array with random integers

		int[] numArray = new int[arrLength];//5
		System.out.println();
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = rgc.getRandomInteger(numLimit);//4 = random 0-3
			System.out.println("numArray[" + i + "] = " + numArray[i]);
		}

		// then go through this array to find the largest number

		int bigNum = numArray[0];
		for (int i = 0; i < numArray.length; i++)
			if (bigNum < numArray[i])
				bigNum = numArray[i];
		return bigNum;
	}

	public static void main(String args[]) {

		RandomFindLargest rfl = new RandomFindLargest();

		// create an array of length 8, and fill it with random
		// integers between 0 and 19
		int result = rfl.findLargestNumberInRandomArray(8, 20);
		System.out.println("The largest number is : " + result);

	}

}
