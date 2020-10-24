package bperhaps.lecture11;

import bperhaps.lecture7.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.studentNo, o2.studentNo);
    }
}
