import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /*
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */


    /*
     *  Alts
     * 
     *  Method 1.
     * 
     * 1. Create a char array of length "base"
     * 2. Convert it to a string
     * 3. Since element in the char array is a null character, we can replace them using their octal values with the help of regex 
     *    ('\0' matches all characters where their octal values are 0n, 0 <= n <= 7)
     * 
     * String test = new String(new char[base]).replace("\0", "*");
     * 
     * Ref: 
     * 1. https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
     * 2. https://www.sciencebuddies.org/science-fair-projects/references/ascii-table
     * 
     * 
     * Method 2. 
     * 
     * 1. String.repeat()
     * 
     * String out = "*".repeat(base);
     * 
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter integer for base of triangle: ");
    int base = in.nextInt();
    
    for (int i = base; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

