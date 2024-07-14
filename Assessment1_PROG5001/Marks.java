
/**
 * Assessment1 PROG5001
 *
 * @author (Gopisanth Kobithasan_24388421)
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
        
        //Reads Assessment name
        System.out.print("Enter Assessment name: ");
        String Assessment= sc.nextLine();              

        
        System.out.println("Give marks of 30 students: ");
        
        for(int i=0; i<numberOfStudents; i++)
        {
            //check for valid marks within range of 0 - 30
            float temp = sc.nextFloat();
            
            if (temp < 0 || temp > 30)
            {
                System.out.println("Invalid marks, please enter the mark again");
                i--;
            }
            else
            {
               marks[i] = temp; 
            }
            
        }  
        
      
        System.out.println("Marks of the students"+"-"+Assessment);
        for(int j=0; j<numberOfStudents; j++)
        {
            System.out.println(marks[j]);
        }

   
        //Sorting logic to find lowest and highest
        for (int i = 0; i < numberOfStudents; i++)   
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
        
        //Prints the lowest and highest marks  
        System.out.println("The lowest marks"+"="+marks[0]);  
        System.out.println("The highest marks"+"="+marks[29]); 


        //Mean calculation
        //mean = sum of all marks/number of students
        float total = 0;
        
        for (int i=0; i<numberOfStudents;i++)
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
        double i, precision = 0.00001;
        for(i = 1; i*i <=summedDiff_a; ++i);
        for(--i; i*i < summedDiff_a; i += precision);
        System.out.println("Standard deviation"+"="+i);
        
     
    
    }
 
}
