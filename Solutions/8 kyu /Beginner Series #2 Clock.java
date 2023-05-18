// DESCRIPTION:
// Clock shows h hours, m minutes and s seconds after midnight.

// Your task is to write a function which returns the time since midnight in milliseconds.

// Example:
// h = 0
// m = 1
// s = 1

// result = 61000

public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    //Happy Coding! ^_^
    int mh = h * 3600000;
    int mm = m * 60000;
    int ms = s * 1000;
    
    return mh + mm + ms;
  }
}
