package business;

import core.logging.IBaseLoggerDao;
import dataAccess.ICourseDba;
import dataAccess.IInstructorDba;
import entites.Instructor;

import java.util.List;

public class InstructorManager {
    private List<IInstructorDba> iInstructorDba;
    private List<IBaseLoggerDao> iBaseLoggerDaos;

    public InstructorManager(List<IInstructorDba> iInstructorDba, List<IBaseLoggerDao> iBaseLoggerDaos) {
        this.iInstructorDba = iInstructorDba;
        this.iBaseLoggerDaos = iBaseLoggerDaos;
    }

    public  void add(Instructor instructor){
        for (IInstructorDba ins: iInstructorDba
        ) {
           ins.add(instructor);
        }
        for (IBaseLoggerDao ibase:iBaseLoggerDaos
        ) {
            ibase.log(instructor.getFirstName());
        }
    }
}
