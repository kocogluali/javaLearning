package dataAccess.instructor;

import dataAccess.IInstructorDba;
import entites.Instructor;

public class HibernateInstructorDba implements IInstructorDba {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernates'e eklendi:"+instructor);
    }

    @Override
    public void update(Instructor instructor) {

    }
}
