// In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

// Examples
// highAndLow("1 2 3 4 5")  // return "5 1"
// highAndLow("1 2 -3 4 5") // return "5 -3"
// highAndLow("1 9 3 4 -5") // return "9 -5"

import java.util.Arrays;

public class Kata {
  public static String highAndLow(String numbers) {
    // Code here or
   		String[] newNumbers = numbers.split(" ");

		int[] arr = new int [newNumbers.length];
		int max = 0;
		int low = 0;
		
		for(int i = 0; i<newNumbers.length; i++) {
			arr[i] = Integer.valueOf(newNumbers[i]);
		}
		
		Arrays.sort(arr);
		low = arr[0];
		max = arr[arr.length-1];
		
		return max+" "+low;
  }
}
