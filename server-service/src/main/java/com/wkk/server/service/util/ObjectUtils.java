package com.wkk.server.service.util;

import com.google.protobuf.StringValue;
import com.wkk.server.service.domain.StudentsDO;
import com.wkk.server.service.domain.grpc.student.Student;
import com.wkk.server.service.domain.grpc.student.Students;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * TODO 类描述
 *
 * @author weikunkun
 * @since 2022/2/23
 */
public class ObjectUtils {

    public static Students convertStudentsDOListToStudents(List<StudentsDO> allStudents) {
        Students.Builder build = Students.newBuilder();
        if (CollectionUtils.isEmpty(allStudents)) {
            return build.build();
        }
        allStudents.forEach(studentsDO -> {
            Student.Builder builder = Student.newBuilder();
            builder.setId(studentsDO.getId());
            builder.setNo(studentsDO.getNo());
            builder.setAge(studentsDO.getAge());
            builder.setName(studentsDO.getName());
            builder.setScore(studentsDO.getScore());
            build.addStudent(builder);
        });
        return build.build();
    }

    public static Student convertStudentsDOToStudents(StudentsDO studentsDO) {
        Student.Builder builder = Student.newBuilder();
        if (Objects.isNull(studentsDO)) {
            return builder.build();
        }

        builder.setId(studentsDO.getId());
        builder.setNo(studentsDO.getNo());
        builder.setAge(studentsDO.getAge());
        builder.setName(studentsDO.getName());
        builder.setScore(studentsDO.getScore());
        return builder.build();
    }
}
