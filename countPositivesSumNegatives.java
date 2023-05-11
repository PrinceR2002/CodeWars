public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
     		int positives = 0;
		int negatives = 0;
		
		for(int i = 0; i<input.length; i++) {
			if(input[i]>0) {
				positives++;
			}
			else if(input[i]<0) {
				negatives += input[i];
		}
        //return an array with count of positives and sum of negatives
		}
		int[] output = {positives, negatives};
		 return output;
    }
}
