
/**
 * Assessment1 PROG5001
 *
 * @author (Gopisanth Kobithasan)
 * @version (20240712)
 */

import java.util.Scanner;  

public class Marks
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents = 30;
        float[] marks = new float[numberOfStudents];
        
        System.out.println("Give marks of 30 students: ");
        
        for(int i=0; i<numberOfStudents; i++)
        {
            //check for valid marks within range of 0 - 30
            float temp = sc.nextFloat();
            
            if (temp < 0 || temp > 30)
            {
                System.out.println("Invalid marks, please enter the mark again");
            }
            marks[i] = temp;
        }  
        
        System.out.println("Marks of the students");
        for(int j=0; j<numberOfStudents; j++)
        {
            System.out.println(marks[j]);
        }

/*        
        //minimum calculation
        float min = marks[0];
        for (int i=0; i<numberOfStudents; i++) 
        { 
            if(min > marks[i]);
            {
                min = marks[i];
            }
        }    
        System.out.println("The minimum marks of the Assessment"+"="+ min);
*/    


        //sorting logic to find lowest and highest
        for (int i = 0; i < marks.length; i++)   
        {  
            for (int j = i + 1; j < marks.length; j++)   
            {  
                float tmp = 0;  
                if (marks[i] > marks[j])   
                {  
                    tmp = marks[i];  
                    marks[i] = marks[j];  
                    marks[j] = tmp;  
                }  
            }
        } 
        //prints the sorted element of the array  
        System.out.println("The lowest marks"+"="+marks[0]);  
        System.out.println("The highest marks"+"="+marks[29]); 


    
        //mean = sum of all marks/number of students
        float total = 0;
        
        for (int i=0; i<marks.length;i++)
        {
            total = total + marks[i];
        }
        
        float mean = total/numberOfStudents;
        System.out.println("Mean" +"="+ mean);
        
        //Standard deviation calculation
        float summedDiff = 0;
        for (int i=0; i<numberOfStudents; i++)
        {
            summedDiff = summedDiff + (marks[i] - mean)*(marks[i] - mean);
        }
        float summedDiff_a = summedDiff / numberOfStudents;
        
        
        //squareroot method found from below tutorial site
        //https://www.tutorialspoint.com/Java-program-to-find-the-square-root-of-a-given-number
        double i, precision = 0.000001;
        for(i = 1; i*i <=summedDiff_a; ++i);
        for(--i; i*i < summedDiff_a; i += precision);
        System.out.println("Standard deviation"+"="+i);
        
     
    
    }
 
}
