package com.cankurttekin.cruddemo.dao;

import com.cankurttekin.cruddemo.entity.Instructor;
import com.cankurttekin.cruddemo.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
    InstructorDetail findInstructorDetailById(int theId);
    void deleteInstructorDetailById(int theId);
}
