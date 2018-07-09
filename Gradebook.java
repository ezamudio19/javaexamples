import java.util.Scanner;
public class GradeBook{
  public static void main(String[] args){
  int grade;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your grade");
  int grade=sc.nextInt();
/* A is a 90-100
   B is a 80-89
   C is a 70-79
   D is a 60-69
   F is less than 60
*/
    //adjust conditionals and print statements to fit the grading scale
    if (grade >= 90 && grade < 100) {
      System.out.println("Your grade is an A");
    }
    if (grade >= 80 && grade < 90) {
      System.out.println("Your grade is a B");
    }
    if (grade >= 70 && grade < 80) {
      System.out.println("Your grade is a C");
    }
    if (grade >= 60 && grade < 70) {
      System.out.println("Your grade is a D");
    }
    if (grade < 60) {
      System.out.println("Your grade is a F");
    }
    // keep adding if statements to acoount for all the grade options

  }
}
