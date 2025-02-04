import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for(int i = 0; i < arr.length; i++)
    {
      if (arr[i].length() == targetLength)
      {
        count++;
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      int target = arr[i];
      for (int j = 0; j < arr.length; j++)
      {
        int elem = arr[j];
        if (target == elem && i != j)
        {
          return true; 
        }
      }
     
    return false;
  }

  public static String findMode(String[] arr)
  {
    int count = 0;
    int mode = arr[0];
    int max_count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      String target = arr[i];
      count = 0;
      for (int j = 0; j < arr.length; j++)
      {
        int num = arr[j];
        if (target == num)
        {
          count ++; 
        }
      }

      if (count > max_count)
      {
        max_count = count;
        mode = arr[i];
      }
    }
    return mode; 
  }
}
