package org.example.class14;

public class StudentsTester {
    public static void main(String[] args) {
        Students st1 = new Students();
        st1.name = "Arwa";
        st1.id = 1862114;
        Students.numStudents ++ ;

        System.out.println(st1.name);
        System.out.println(st1.id);
        System.out.println();

        Students st2 = new Students();
        st2.name = "Ken";
        st2.id = 7643;
        Students.numStudents ++ ;

        System.out.println(st2.name);
        System.out.println(st2.id);
        System.out.println(Students.numStudents);
        /* Static variable is independent of an object, so we write the name of the class
        instead of the object
        System.out.println(st2.numStudents) so we write the student (name of the class) */



        Students st3 = new Students();
        st2.name = "Barbie";
        st2.id = 762345;
        Students.numStudents ++ ;
    }
}