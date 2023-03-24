package service.impl;

import db.Database;
import model.Student;
import service.StudentServic;

import java.util.List;

public class StudentServicImpl implements StudentServic {
    Database database = new Database();
    @Override
    public String addStudent(Student student) {
        database.getStudents().add(student);
        return "Кошулду";
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }
}
