package com.hou.edu.info.service;

import com.hou.edu.info.dao.StudentDao;
import com.hou.edu.info.domain.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    public boolean addStudent(Student stu) {

        boolean flag = studentDao.addStudent(stu);
        return flag;
    }
    //判断id是否存在的方法 ，返回ture 是存在 false 是不存在
    public boolean isExist(String id) {
        Student[] stus = studentDao.findAllStudent();
        boolean exist = false;

        for (int i=0;i<stus.length;i++) {
            Student student = stus[i];
            System.out.println(id +" "+exist+"  "+i + "  ");
            if (student != null){
                System.out.println(student.getId() );

            }
            if (student != null && student.getId().equals(id)) {
                exist = true;

                break;
            }
        }
        return exist;
    }
}
