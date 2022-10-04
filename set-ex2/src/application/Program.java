package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		
		Set<Course> courseA = new HashSet<>();
		
		for(int i=0; i<a; i++) {
			int studentCode = sc.nextInt();
			courseA.add(new Course(studentCode));
		}
		
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		
		Set<Course> courseB = new HashSet<>();
		
		for(int i=0; i<b; i++) {
			int studentCode = sc.nextInt();
			courseB.add(new Course(studentCode));
		}
		
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		
		Set<Course> courseC = new HashSet<>();
		
		for(int i=0; i<c; i++) {
			int studentCode = sc.nextInt();
			courseC.add(new Course(studentCode));
		}

		Set<Course> totalStudents = new HashSet<>(courseA);
		totalStudents.addAll(courseB);
		totalStudents.addAll(courseC);
		
		System.out.print("Total students: " + totalStudents.size());

		sc.close();
	}
}
