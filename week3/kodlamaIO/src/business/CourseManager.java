package business;

import core.logging.IBaseLoggerDao;
import dataAccess.ICourseDba;
import entites.Course;

import java.util.List;

public class CourseManager {
    private List<ICourseDba> iCourseDbas;
    private  List<IBaseLoggerDao> iBaseLoggerDaos;

    public CourseManager(List<ICourseDba> iCourseDbas, List<IBaseLoggerDao> iBaseLoggerDaos) {
        this.iCourseDbas = iCourseDbas;
        this.iBaseLoggerDaos = iBaseLoggerDaos;
    }

    public void add(Course course) throws  Exception{
        if(course.getcName().isEmpty()){
            throw new Exception("Dostum kurs adı boş olamaz");
        }

        if(course.getPrice()<0){
            throw  new Exception("Kurs fiyatı 0 dan küçük olamaz");
        }
        for (ICourseDba icours: iCourseDbas
             ) {
            icours.add(course);
        }
        for (IBaseLoggerDao ibase:iBaseLoggerDaos
             ) {
            ibase.log(course.getcName());
        }
    }
}
