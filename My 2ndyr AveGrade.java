package PrelimGrades;

import java.util.Scanner;


public class AveGrades {

   
    public static void main(String[] args) {
 
Scanner Remarks = new Scanner(System.in);
double score1,score2,score3,score4,score5,score6, ave;

System.out.print ("Enter prelim grades (Human Computer Interaction): ");
score1 = Remarks.nextDouble();
System.out.print ("Enter prelim grades (Object Oriented Programming): ");
score2 = Remarks.nextDouble();
System.out.print ("Enter prelim grades (Individual Sports): ");
score3 = Remarks.nextDouble();
System.out.print ("Enter prelim grades (Philippine History): ");
score4 = Remarks.nextDouble();
System.out.print ("Enter prelim grades (Data Structure): ");
score5 = Remarks.nextDouble();
System.out.print ("Enter prelim grades (Information Management): ");
score6 = Remarks.nextDouble();


double average = (score1 + score2 + score3 + score4 + score5 + score6)/6;
System.out.println ("The Total Average is " + average );
if (average <= 75) {
	System.out.print("FAILED") ;
}else {
	System.out.print("PASSED") ;
	  }
  }
}
