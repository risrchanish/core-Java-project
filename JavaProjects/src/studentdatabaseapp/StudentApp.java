package studentdatabaseapp;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
//		Student student = new Student();
		
//		student.studentInputStatus();
//		student.courseEnroll();
		
//		student.showInfo();
		
		System.out.println("Enter number of students to get enrolled:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		Student[] student = new Student[number];
		
		for(int i = 0; i < number; i++)
		{
			student[i] = new Student();
			student[i].showInfo();
		}
		

	}

}
