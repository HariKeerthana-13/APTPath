import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Student with this ID already exists!");
                return;
            }
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void updateStudent(int id, String newName, int newAge, String newCourse) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);
                student.setCourse(newCourse);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}
