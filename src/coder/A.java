 package coder;

import java.util.Scanner;

class A
{
 
    
    static String strBitwiseAND(String[] arr)
    {
        String res = "";
        int smallest_size = Integer.MAX_VALUE;
        int largest_size = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
             
            StringBuilder temp = new StringBuilder();
            temp.append(arr[i]);
            arr[i] = temp.reverse().toString();
     
            smallest_size = Math.min(smallest_size, arr[i].length());
            largest_size = Math.max(largest_size, arr[i].length());
        }
     
        for (int i = 0; i < smallest_size; i++)
        {
            boolean all_ones = true;
     
            for (int j = 0; j < arr.length; j++)
            {
     
                if (arr[j].charAt(i) == '1')
                {
     
                    all_ones = false;
                    break;
                }
            }
            res += (all_ones ? '0' : '1');
        }
    
        for (int i = 0; i < largest_size - smallest_size; i++)
            res += '0';
     
        StringBuilder temp = new StringBuilder();
        temp.append(res);
        res = temp.reverse().toString();
        return res;
    }
    public static void main(String []args)
    {
      
        String arr[] = { "100", "000" };
        
      System.out.println(strBitwiseAND(arr));
        
    }
}