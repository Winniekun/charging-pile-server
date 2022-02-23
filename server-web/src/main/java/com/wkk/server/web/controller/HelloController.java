package com.wkk.server.web.controller;

import com.wkk.server.service.domain.StudentsDO;
import com.wkk.server.service.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author weikunkun
 * @since 2022/2/23
 */
@RestController
public class HelloController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/")
    public String hello() {
        List<StudentsDO> students = studentsService.getAllStudents();
        return students.get(0).toString();
    }

    @GetMapping("/1")
    public String hello1() {
        return studentsService.getStudentById().toString();
    }
}
