package io.zipcoder;

import org.junit.Test;

public class StudentTest {

    @Test
    public void getExamScores() {
        String fName = "Valentin";
        String lName = "G";
        Double [] examScores = {100.0,95.0,85.0,96.0};

        Student  testStudent = new Student(fName,lName,examScores);

        String output = testStudent.getExamScores();

        System.out.println(output);

    }

    @Test
    public void addExamScore() {
        String fName = "Valentin";
        String lName = "G";
        Double [] examScores = {};
        Student testStudent = new Student(fName,lName,examScores);

        testStudent.addExamScore(100.0);
        String output = testStudent.getExamScores();

        System.out.println(output);

    }
}