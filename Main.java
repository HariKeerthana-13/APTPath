import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Smartex Institute Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Course: ");
                        String course = scanner.nextLine();
                        manager.addStudent(new Student(id, name, age, course));
                        break;
                    case 2:
                        manager.viewAllStudents();
                        break;
                    case 3:
                        System.out.print("Enter ID to search: ");
                        int searchId = scanner.nextInt();
                        manager.searchStudentById(searchId);
                        break;
                    case 4:
                        System.out.print("Enter ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter New Age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Course: ");
                        String newCourse = scanner.nextLine();
                        manager.updateStudent(updateId, newName, newAge, newCourse);
                        break;
                    case 5:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = scanner.nextInt();
                        manager.deleteStudent(deleteId);
                        break;
                    case 6:
                        System.out.println("Thank you for using Smartex Institute System!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter correct data.");
                scanner.nextLine(); // clear buffer
            }
        }
    }
}
