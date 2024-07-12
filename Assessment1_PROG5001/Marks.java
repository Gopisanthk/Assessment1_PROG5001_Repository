
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
        
        //mean = sum of all marks/number of students
        float total = 0;
        
        for (int i=0; i<numberOfStudents;i++)
        {
            total = total + marks[i];
        }
        
        float mean = total/numberOfStudents;
        System.out.println("Mean of marks" +"="+ mean);
    }
 
}
