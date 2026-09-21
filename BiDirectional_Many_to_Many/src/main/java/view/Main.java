package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Course;
import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import repository.StudentRepository;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Course c1 = new Course("Java", 150000);
		Course c2 = new Course("Python", 10000);
		Course c3 = new Course("SQL", 160000);

		List<Course> courses1 = new ArrayList<Course>();
		courses1.add(c1);
		courses1.add(c3);

		List<Course> courses2 = new ArrayList<Course>();
		courses2.add(c2);
		courses2.add(c3);

		List<Course> courses3 = new ArrayList<Course>();
		courses3.add(c2);

		Student s1 = new Student("Aditi", 24);
		Student s2 = new Student("Neha", 22);
		Student s3 = new Student("Tarun", 21);

		List<Student> students1 = new ArrayList<Student>();

		students1.add(s2);

		List<Student> students2 = new ArrayList<Student>();
		students2.add(s1);
		students2.add(s2);

		List<Student> students3 = new ArrayList<Student>();
		students3.add(s1);
		students3.add(s2);
		
		
		c1.setStudent(students3);
		c2.setStudent(students2);
		c3.setStudent(students3);
		
		s1.setCourses(courses1);
		s2.setCourses(courses2);
		s3.setCourses(courses3);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		et.commit();
	}
}
