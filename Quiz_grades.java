import java.util.Scanner; 
import java.util.ArrayList;

public class Quiz_grades {
    public static void main(String[] args){
        //(Java's 'Hello World': Print Statement & Example, 2019)
        //print the programming specifications for the project
        System.out.print("Please enter up to 10 grades from 0 to 100. Do not enter % signes.\n");
        System.out.print("If you are done entering grades you can enter 999 to exit. \n");

        //variables 
        //(Practical Application for Java: Using the Scanner Class, 2017)
        Scanner userInput = new Scanner(System.in);
        float totalGrades = 0;
        int numberOfGrades = 0;
        float averageGrade = 0;
        //(Java ArrayList Add Method: Code & Examples, 2018)
        ArrayList <Float> allGradesArray = new ArrayList <Float>(1);
        

        try {
            //(For Loops in Java: Syntax & Example, 2016)
            //loop for user input, up to 10 entries
            for (float i = 0; i < 10; i++) {
                System.out.print("Enter new grade: ");
                float enteredGrade = userInput.nextFloat();
                if (enteredGrade == 999) {
                    System.out.print("You have sucssefuly exited user imput mode.\n");
                    i = i + 10; // added 10 to i to stop loop
                //else if to catch if the user tries to enter a number outside of excepted range
                } else if (enteredGrade > 100 || enteredGrade < 0) {
                    System.out.print("Please enter a valid grade between 0 and 100.\n");
                    i --;  //subtracted 1 from i so this invalid entry will not be counted
                } else {
                    numberOfGrades ++; //add 1 to counter
                    System.out.print("The grade " + enteredGrade + " you entered has been saved. You can enter "
                    + (10 - numberOfGrades) + " more grades.\n");
                    allGradesArray.add(enteredGrade); //add data to array list
                    totalGrades = totalGrades + enteredGrade;
                    averageGrade = totalGrades / numberOfGrades;
                    continue;
                }  
            }
        //(Handling Advanced Exceptions in Java, 2021)
        //catch if the user tries to enter an invalid character
        } catch (Exception e) {
            System.out.println("Entry invalid, please enter a number between 0 and 100.");

        }
    userInput.close();

    //loop through array and add letter grade
    for(float i : allGradesArray)
        if (i >= 90) {
            System.out.print(i + "A, ");
        } else if (i < 90 & i >= 80) {
            System.out.print(i + "B, ");
        } else if (i < 80 & i >= 70) {
            System.out.print(i + "C, ");
        } else if (i < 70 & i >= 60) {
            System.out.print(i + "D, ");
        } else {
            System.out.print(i + "F, ");
        }

    //print total and average, rounded to 2 decimals. (Shina, 2012)
    System.out.print("\nTotal grades: " + (Math.round(totalGrades*100.0) / 100.0) + "\n");
    System.out.print("Total number of grades: " + numberOfGrades + "\n");
    System.out.print("Average grade: " + (Math.round(averageGrade*100.0) / 100.0) + "%\n");
    }
}
