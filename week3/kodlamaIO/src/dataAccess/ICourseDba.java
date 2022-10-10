package dataAccess;

import entites.Course;

public interface ICourseDba {
    void add(Course course);
    void update(Course course);
}
