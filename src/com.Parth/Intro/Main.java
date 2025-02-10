import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

//        Student parth = new Student();

        Student parth = new Student(5, "akki", 88f);
        Student rahul = new Student(9, "dave", 90f);

//        parth.greeting("Inosuke");


//        parth.rno = 1;
//        parth.name = "Parth Gupta";
//        parth.marks = 3.2F;

        System.out.println(parth.rno);
        System.out.println(parth.name);
        System.out.println(parth.marks);

        System.out.println();

        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
    }

}
    class Student {
        int rno;
        String name;
        float marks;

        void greeting(String n) {
            System.out.println("the name is " + n);
        }

        Student() {
            this.rno = 1;
            this.name = "Parth Gupta";
            this.marks = 88.9f;
        }

        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }
