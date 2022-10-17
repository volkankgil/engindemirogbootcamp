import business.InstructorManager;

import java.util.*;
import java.util.List;
import java.util.logging.Logger;

import core.messagelogger;
import core.maillogger;
import core.databaselogger;
import business.CourseManager;
import entities.*;
import dataAccess.*;
import core.*;
import business.*;

public class katmanlýmimariödevmain {
    public static void main(String[] args) {

        course course1=new course(1,"Volkan",30);

        Logger[] loggers= new Logger[]{new databaselogger(), new maillogger(), new messagelogger()};

        List<course>courseList=new ArrayList<>();

        CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers,courseList);

    }
}
