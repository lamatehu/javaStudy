package com.hou.edu.info.dao;

import com.hou.edu.info.domain.Student;

import java.lang.reflect.Array;

public class StudentDao {
    private static Student[] stus =  new Student[5];
    public boolean addStudent(Student stu) {

        int index = -1;
        for (int i=0;i<= stus.length;i++){
            if (stus[i] == null){
                index = i;
                break;
            }

        }
        if (index == -1) {
            return false;
        }else {
            stus[index] = stu;
            return true;
        }

    }

    public Student[] findAllStudent() {
        return stus;
    }
}
