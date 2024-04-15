import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */


    /*  
     *  1. Get numbers and add them into an array ("numbers").
     *  2. Sort array to group the same numbers together.
     *  3. Loop through the sorted array following these steps:
     *    3.1. Increment freq if the next element in the loop is the same.
     *    3.2. Update the mode (if needed) if the next number is different, or the current loop is the final loop.  
     *
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter number of numbers: ");
    int count = in.nextInt();
    int[] numbers = new int[count];

    for (int i = 0; i < count; i++) {
      numbers[i] = in.nextInt(); 
    }

    Arrays.sort(numbers);

    int mode = 0;
    int modeNum = 0;
    int freq = 1;
    
    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] == numbers[i+1]) {
        freq++;
      }
      if (i == numbers.length - 2 || numbers[i] != numbers[i+1]) {
        if (freq > mode) {
          mode = freq;
          modeNum = numbers[i];
        }
        freq = 1;
      }
    }
    System.out.println(modeNum);
  }
}
