package com.wkk.server.service.service;

import com.wkk.server.service.domain.Students;

import java.util.List;

/**
 * @author weikunkun
 * @since 2022/2/23
 */
public interface StudentsService {
    Students getStudentById();

    List<Students> allStudents();
}
