package ex4;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học sinh: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();
        //Khởi tạo qua constructor không tham số;
//        Student student = new Student();
//        student.setName(name);
//        student.setAge(age);
//        student.setClassName(className);
        //Constructor có tham số;
        Student student = new Student(name,age,className);
        System.out.println(student);
    }
}
