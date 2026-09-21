package repository;

import java.util.List;

import entity.Course;
import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aditi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void saveStudent(List<Student> students, List<Course> courses) {
		et.begin();
		for (Course course : courses) {
			em.persist(course);
		}
		for (Student student : students) {
			em.persist(student);
		}

		et.commit();
	}

	public void findStudent(int id) {
		Student student = em.find(Student.class, id);
		List<Course> courses = student.getCourses();
		System.out.println("Student Details: " + student);
		// System.out.println(student);
		System.out.println("Course Details: ");
		for (Course course : courses) {
			System.out.println(course);
		}

	}
	
//	create course 4 and update in s3
	public void updateStudent(int studentId, Course newCourse) {
		et.begin();
		Student student = em.find(Student.class, studentId);
		List<Course> courses = student.getCourses();
		courses.add(newCourse);
		em.persist(newCourse);
		em.merge(student);
		et.commit();
	}

}
