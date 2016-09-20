/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeconverter;

/**
 *
 * @author dhruv
 */
public class GradeConverter 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Grade Converter:");
        int number = readInt("What is your grade: ");
        
        if(number >= 90)
        {
            System.out.println("Your grade: A");
        }
        if(number < 90 && number >= 80)
        {
            System.out.println("Your grade: B");
        }
        else if(number < 80 && number >= 70)
        {
            System.out.println("Your grade: C");
        }
        else if(number < 70 && number >= 60)
        {
            System.out.println("Your grade: D");
        }
        else
        {
                System.out.print("Your grade: F");
        }
        }
    }
    
}
