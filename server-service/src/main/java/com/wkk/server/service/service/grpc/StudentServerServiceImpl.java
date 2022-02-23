package com.wkk.server.service.service.grpc;

import com.google.protobuf.Empty;
import com.wkk.server.service.domain.StudentsDO;
import com.wkk.server.service.domain.grpc.student.Student;
import com.wkk.server.service.domain.grpc.student.StudentId;
import com.wkk.server.service.domain.grpc.student.Students;
import com.wkk.server.service.domain.grpc.student.StudentsAPIGrpc;
import com.wkk.server.service.domain.grpc.student.StudentsRequest;
import com.wkk.server.service.service.StudentsService;
import com.wkk.server.service.util.ObjectUtils;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO 类描述
 *
 * @author weikunkun
 * @since 2022/2/23
 */
@Service
@Slf4j
public class StudentServerServiceImpl extends StudentsAPIGrpc.StudentsAPIImplBase {

    @Autowired
    private StudentsService studentsService;

    @Override
    public void getAllStudentsInfo(Empty request, StreamObserver<Students> responseObserver) {
        List<StudentsDO> allStudents = studentsService.getAllStudents();
        Students students = ObjectUtils.convertStudentsDOListToStudents(allStudents);

        responseObserver.onNext(students);
        responseObserver.onCompleted();
    }

    @Override
    public void getStudentsInfoByCondition(StudentsRequest request, StreamObserver<Students> responseObserver) {
        //TODO
    }

    @Override
    public void getStudentInfoById(StudentId request, StreamObserver<Student> responseObserver) {
        StudentsDO studentsDO = studentsService.getStudentById();
        Student student = ObjectUtils.convertStudentsDOToStudents(studentsDO);

        responseObserver.onNext(student);
        responseObserver.onCompleted();
    }
}
