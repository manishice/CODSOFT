package codSoft;
import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		int total_sub=5;
		int mark1, mark2, mark3, mark4, mark5;
		int total_mark, percentage;
		String grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("the number of subject: "+total_sub);
		
		System.out.println("===== enter the marks(out of 100) =====");
		System.out.print("mark1: ");
		mark1 = sc.nextInt();
		if(mark1>100)
		{
		  	System.out.println("please enter the mark out of 100");
		  	mark1 = sc.nextInt();
		}
		
		System.out.print("mark2: ");
		mark2 = sc.nextInt();
		if(mark2>100)
		{
		  	System.out.println("please enter the mark out of 100");
		  	mark2 = sc.nextInt();
		}
		System.out.print("mark3: ");
		mark3 = sc.nextInt();
		if(mark3>100)
		{
		  	System.out.println("please enter the mark out of 100");
		  	mark3 = sc.nextInt();
		}
		System.out.print("mark4: ");
		mark4 = sc.nextInt();
		if(mark4>100)
		{
		  	System.out.println("please enter the mark out of 100");
		  	mark4 = sc.nextInt();
		}
		System.out.print("mark5: ");
		mark5 = sc.nextInt();
		if(mark5>100)
		{
		  	System.out.println("please enter the mark out of 100");
		  	mark5 = sc.nextInt();
		}
		
		total_mark = mark1 + mark2 + mark3 + mark4 + mark5;
		percentage = total_mark/total_sub;
		
		if(percentage>=90) {
			grade= "O";
		}
		else if(percentage > 80 && percentage < 90 ) {
			grade= "A+";
		}
		else if(percentage > 70 && percentage <= 80 ) {
			grade= "A";
		}
		else if(percentage > 60 && percentage <= 70 ) {
			grade= "B+";
		}
		else if(percentage > 50 && percentage <= 60 ) {
			grade= "B";
		}
		else if(percentage > 40 && percentage <= 50 ) {
			grade= "C";
		}
		else if(percentage > 30 && percentage <= 40 ) {
			grade= "D";
		}
		else {
			grade= "F";
		}
		if(mark1<30 || mark2<30 || mark3<30 || mark4<30 || mark5<30) {
			grade= "F";
		}
		
		System.out.println("Total mark: "+ total_mark +"\nPercentage: "+ percentage +"\nGrade: "+grade);
		sc.close();
			
	}

}
