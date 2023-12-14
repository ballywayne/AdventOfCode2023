import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Day1Prog1
{
    public static void main (String[] args) throws IOException
    {
      int total = 0;
      File myFile = new File("day1prog1input.txt");
      Scanner inputFile = new Scanner(myFile);
      ArrayList<Character> list = new ArrayList<Character>();
      String content = "none";
      
      while(inputFile.hasNext() == true)
      {
        content = inputFile.nextLine();

        char[] cont = content.toCharArray();
        
        for(char c : cont)
        {
            if(Character.isDigit(c))
            {
              list.add(c);
            }
        }
        
        String num = "" + list.get(0) + list.get(list.size()-1);
        
        list.clear();
        
        total = total + Integer.parseInt(num);

      }
      inputFile.close();

      System.out.println(total);
    }
}
