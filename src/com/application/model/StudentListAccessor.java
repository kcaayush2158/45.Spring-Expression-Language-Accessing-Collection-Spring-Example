package com.application.model;

import java.util.List;

public class StudentListAccessor {
    private Student getThirdStudentInList;
    private List<Student> failedStudent;
    private List<String> studentNames;

    public Student getGetThirdStudentInList() {
        return getThirdStudentInList;
    }

    public void setGetThirdStudentInList(Student getThirdStudentInList) {
        this.getThirdStudentInList = getThirdStudentInList;
    }

    public List<Student> getFailedStudent() {
        return failedStudent;
    }

    public void setFailedStudent(List<Student> failedStudent) {
        this.failedStudent = failedStudent;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }
}
