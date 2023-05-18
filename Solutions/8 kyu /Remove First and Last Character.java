// It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. 
// You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
public class RemoveChars {
    public static String remove(String str) {
      StringBuilder x = new StringBuilder(str);
      
      x.deleteCharAt(str.length()-1);
		  x.deleteCharAt(0);
		 String y = x.toString();
		  //System.out.println(x);
		  return y;
	      
    }
}
