package dataAccess.course;

import dataAccess.ICourseDba;
import entites.Course;

public class JdbsCourseDba implements ICourseDba {
    @Override
    public void add(Course course) {
        System.out.println("Kurs jdbs eklendi:"+course);
    }

    @Override
    public void update(Course course) {

    }
}
