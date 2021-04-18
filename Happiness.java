
import java.util.*;

public class Happiness
{
    //Let happiness be measured based on work satisfaction (1-10), others' happiness, income satisfaction, and quality of life)
    
    public static void main(String[] args)
    {
        List<Integer> acq_hap = new ArrayList<Integer>();
        int work;
        int income;
        int life; 
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of your acquaintances: ");
        int number_of_acquaintances = in.nextInt();
        for(int i = 0; i < number_of_acquaintances; i++)
            {System.out.println("Please input your #" + (i+1) + " acquaintance's happiness level (1-10): ");
                acq_hap.add(in.nextInt());}
        
        System.out.println("On a scale from 1-10, how satisfied are you with work?");
        work = in.nextInt();
        
        System.out.println("On a scale from 1-10, how satisfied are you with your income?");
        income = in.nextInt();
        
        System.out.println("On a scale from 1-10, how satisfied are you with your life quality?");
        life = in.nextInt();
        
        int total = 0;
        int avg = 0;
         for(int i = 0; i < acq_hap.size(); i++)
            {
             total += acq_hap.get(i);
             avg = total / acq_hap.size();
            }
        
             
        
        int happy = ((work + avg + income + life)/4);
         
        System.out.println("Your happiness score is " + happy);
    }
}
