// DESCRIPTION:
// Complete the solution so that it reverses the string passed into it.

// 'world'  =>  'dlrow'
// 'word'   =>  'drow'
public class Kata {

  public static String solution(String str) {
    // Your code here...   
    String word = "";
   for(int i=str.length()-1;i>=0; i--){
     word += str.charAt(i);
		}
  	return word;
  }

}
