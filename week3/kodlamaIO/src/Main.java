import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLoggerDao;
import core.logging.FileLoggerDao;
import core.logging.IBaseLoggerDao;
import core.logging.MailLoggerDao;
import dataAccess.ICategoryDba;
import dataAccess.ICourseDba;
import dataAccess.IInstructorDba;
import dataAccess.category.HibernateCategoryDba;
import dataAccess.category.JdbsCategoryDba;
import dataAccess.course.HibernateCourseDba;
import dataAccess.instructor.JdbsInstructorDba;
import entites.Category;
import entites.Course;
import entites.Instructor;

import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws  Exception {
        Category category = new Category(1,"Yazılım");

        IBaseLoggerDao[] loggers ={new FileLoggerDao(),new DatabaseLoggerDao()};
        ICategoryDba[] categoryDbas= {new JdbsCategoryDba(),new HibernateCategoryDba()};
        CategoryManager categoryManager = new CategoryManager(List.of(categoryDbas),List.of(loggers));
        categoryManager.add(category);

        Course course = new Course(1,"Java Advented",1235);
        ICourseDba[] iCourseDbas ={new HibernateCourseDba()};
        CourseManager courseManager = new CourseManager(List.of(iCourseDbas),List.of(loggers));
        courseManager.add(course);

        Instructor instructor = new Instructor(1,"Ali Kemal", "Koçoğlu","kocogluali@yandex.com.tr");
        IInstructorDba[] iInstructorDbas= {new JdbsInstructorDba()};
        InstructorManager instructorManager = new InstructorManager(List.of(iInstructorDbas),List.of(loggers));
        instructorManager.add(instructor);
    }
}