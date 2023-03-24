package cong;
import java.util.Scanner;

public class findValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("input student name");
        String name = scanner.nextLine();
        for (int i =0;i<students.length;i++){
            if(students[i].equalsIgnoreCase(name)) {
                System.out.println("student index is "+i);
                return;
            }
        }System.out.println("cannot find studen");
    }
}
