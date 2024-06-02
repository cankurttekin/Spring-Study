package com.cankurttekin.cruddemo.dao;

import com.cankurttekin.cruddemo.entity.Instructor;

public interface AppDAO {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
}
