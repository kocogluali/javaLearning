package dataAccess.course;

import dataAccess.ICourseDba;
import entites.Course;

public class HibernateCourseDba implements ICourseDba {
    @Override
    public void add(Course course) {
        System.out.println("Kurs hibertane eklendi:"+course.getcName());
    }

    @Override
    public void update(Course course) {

    }
}
