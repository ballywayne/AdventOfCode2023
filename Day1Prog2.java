import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Day1Prog2
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
        int i = 0;
        
        content = inputFile.nextLine();

        char[] cont = content.toCharArray();
        
        for(char c : cont)
        {
            if(Character.isDigit(c))
            {
              list.add(c);
            }

            String sus = content.substring(i);
            if(sus.startsWith("one"))
            {
                list.add('1');
            }
            else if(sus.startsWith("two"))
            {
                list.add('2');
            }
            else if(sus.startsWith("three"))
            {
                list.add('3');
            }
            else if(sus.startsWith("four"))
            {
                list.add('4');
            }
            else if(sus.startsWith("five"))
            {
                list.add('5');
            }
            else if(sus.startsWith("six"))
            {
                list.add('6');
            }
            else if(sus.startsWith("seven"))
            {
                list.add('7');
            }
            else if(sus.startsWith("eight"))
            {
                list.add('8');
            }
            else if(sus.startsWith("nine"))
            {
                list.add('9');
            }
            
            i++;
        }
        
        String num = "" + list.get(0) + list.get(list.size()-1);
        
        list.clear();
        
        total = total + Integer.parseInt(num);

      }
      inputFile.close();

      System.out.println(total);
    }
}