package com.wkk.server.service.service;

import com.wkk.server.service.domain.StudentsDO;

import java.util.List;

/**
 * @author weikunkun
 * @since 2022/2/23
 */
public interface StudentsService {
    StudentsDO getStudentById();

    List<StudentsDO> getAllStudents();
}
