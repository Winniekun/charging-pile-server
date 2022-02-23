package com.wkk.server.service.service.impl;

import com.wkk.server.service.dao.StudentsMapper;
import com.wkk.server.service.domain.StudentsDO;
import com.wkk.server.service.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author weikunkun
 * @since 2022/2/23
 */
@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public StudentsDO getStudentById() {
//        Students students = new Students();
//        students.setAge(1);
        return studentsMapper.selectByPrimaryKey(20);
    }

    @Override
    public List<StudentsDO> getAllStudents() {
        return studentsMapper.selectStudentSelective(new StudentsDO());
    }
}
