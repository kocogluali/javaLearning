package dataAccess;

import entites.Instructor;

public interface IInstructorDba {
    void add(Instructor instructor);
    void update(Instructor instructor);
}
