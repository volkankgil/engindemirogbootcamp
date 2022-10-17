package business;

import core.logger;
import dataAccess.instructoDao;
import entities.instructor;

public class InstructorManager {

    instructoDao instructoDao;
    logger [] loggers;

    public InstructorManager(dataAccess.instructoDao instructoDao, logger[] loggers) {
        this.instructoDao = instructoDao;
        this.loggers = loggers;
    }

    public void add(instructor instructor){
        instructoDao.add(instructor);
        for(logger logger:loggers){
            logger.log(instructor.getFirstname()+instructor.getLastname());
        }
    }


}
