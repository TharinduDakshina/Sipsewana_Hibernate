package bo.custom.impl;

import bo.custom.StudentBO;
import dto.StudentDTO;

import java.util.List;

public class StudentBOImpl implements StudentBO {
    @Override
    public boolean add(StudentDTO studentDTO) throws Exception {
        return false;
    }

    @Override
    public List<StudentDTO> findAll() throws Exception {
        return null;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public boolean update(StudentDTO studentDTO) throws Exception {
        return false;
    }
}
