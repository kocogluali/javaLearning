package dataAccess.instructor;

import dataAccess.IInstructorDba;
import entites.Instructor;

public class JdbsInstructorDba implements IInstructorDba {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbs ye eklendi:"+instructor);
    }

    @Override
    public void update(Instructor instructor) {

    }
}
