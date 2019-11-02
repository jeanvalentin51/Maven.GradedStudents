package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getStudents() {
        Double[] student1Scores = {100.0, 150.0, 95.0};
        Double[] student2Scores = {225.0, 25.0};

        Student student1 = new Student("student", "one", student1Scores);
        Student student2 = new Student("student", "two", student2Scores);

        Student[] allStudents = {student1, student2};
        Classroom testClassroom = new Classroom(allStudents);

        Student [] classroomStudents = testClassroom.getStudents();
        int expected = 3;
        int actual = classroomStudents[0].getNumberOfExamsTaken();

        Assert.assertEquals(expected,actual);

        expected = 2;
        actual = classroomStudents[1].getNumberOfExamsTaken();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testGetAverageExamScore() {
        Double[] student1Scores = {100.0, 150.0};
        Double[] student2Scores = {225.0, 25.0};

        Student student1 = new Student("student", "one", student1Scores);
        Student student2 = new Student("student", "two", student2Scores);

        Student[] allStudents = {student1, student2};
        Classroom testClassroom = new Classroom(allStudents);

        double expected = 250.0;
        double actual = testClassroom.getAverageExamScore();

        Assert.assertEquals(expected,actual,0.0);

    }


    @Test
    public void addStudent() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };

        Student [] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);

        Student student = new Student("Leon", "Hunter", examScores);
        classroom.addStudent(student);

        Student [] postEnrollment = classroom.getStudents();
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void removeStudent() {
        Double[] student1Scores = {100.0, 150.0, 95.0};
        Double[] student2Scores = {225.0, 25.0};
        Double [] student3Scores = {100.0, 150.0};

        Student student1 = new Student("student", "one", student1Scores);
        Student student2 = new Student("student", "two", student2Scores);
        Student student3 = new Student("student", "three", student2Scores);

        Student[] allStudents = {student1, student2,student3};
        Classroom testClassroom = new Classroom(allStudents);

        testClassroom.removeStudent("student","two");

        Student [] postEnrollment = testClassroom.getStudents();
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }
}

