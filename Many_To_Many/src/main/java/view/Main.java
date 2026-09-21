package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Course;
import entity.Student;
import repository.StudentRepository;

public class Main {

	public static void main(String[] args) {
		StudentRepository repository = new StudentRepository();

		System.out.println("*********Welcome to Student Management System*********");
		System.out.println("1.Add Student");
		System.out.println("2.Find Student");
		System.out.println("3.Update Student");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Select an option:");
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			Course c1 = new Course("Java", 150000);
			Course c2 = new Course("Python", 10000);
			Course c3 = new Course("SQL", 160000);

			List<Course> courses1 = new ArrayList<Course>();
			courses1.add(c1);
			courses1.add(c3);

			List<Course> courses2 = new ArrayList<Course>();
			courses2.add(c2);

			List<Course> courses3 = new ArrayList<Course>();
			courses3.add(c2);

			Student s1 = new Student("Aditi", 24, courses1);
			Student s2 = new Student("Neha", 22, courses2);
			Student s3 = new Student("Tarun", 21, courses3);

			List<Student> students = new ArrayList<Student>();
			students.add(s1);
			students.add(s2);
			students.add(s3);

			List<Course> courses = new ArrayList<Course>();
			courses.add(c1);
			courses.add(c2);
			courses.add(c3);

			repository.saveStudent(students, courses);

			break;

		case 2:
			System.out.println("Enter Student ID to find:");
			int id = scanner.nextInt();
			repository.findStudent(id);
			break;

		case 3:
			System.out.println("Enter Student ID to update:");
			int studentId = scanner.nextInt();
			Course newCourse = new Course("C++", 12000);
			repository.updateStudent(studentId, newCourse);
			break;

		default:
			break;
		}
	}

}
