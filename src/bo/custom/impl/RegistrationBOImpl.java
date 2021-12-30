package bo.custom.impl;

import bo.custom.RegistrationBO;
import dto.ProgramDTO;
import dto.RegistrationDTO;
import dto.StudentDTO;

import java.util.List;

public class RegistrationBOImpl implements RegistrationBO {
    @Override
    public boolean add(RegistrationDTO registrationDTO) throws Exception {
        return false;
    }

    @Override
    public List<ProgramDTO> findAll() throws Exception {
        return null;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(RegistrationDTO registrationDTO) throws Exception {
        return false;
    }

    @Override
    public List<ProgramDTO> getAll() throws Exception {
        return null;
    }
}
