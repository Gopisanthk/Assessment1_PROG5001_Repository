
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
            marks[i] = sc.nextFloat();
        }  
        
        System.out.println("Marks of the students");
        for(int j=0; j<numberOfStudents; j++)
        {
            System.out.println(marks[j]);
        }
        
    }
 
}
