// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, u as vowels for this Kata (but not y).

// The input string will only consist of lower case letters and/or spaces.
  
public class Vowels {

  public static int getCount(String str) {
     int count = 0; 
		 for(int i = 0; i < str.length(); i++) {
			 
			 if(str.charAt(i) == 'a') {
				 count++;
			 }
			 if(str.charAt(i) == 'e') {
				 count++;
			 }
			 if(str.charAt(i) == 'i') {
				 count++;
			 }
			 if(str.charAt(i) == 'o') {
				 count++;
			 }
			 if(str.charAt(i) == 'u') {
				 count++;
			 }
		 }
		
		    return count;
		  }

}
