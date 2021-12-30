package bo.custom.impl;

import bo.custom.ProgramsBO;
import dao.DaoFactory;
import dao.DAOType;
import dao.custom.impl.ProgramDAOImpl;
import dto.ProgramDTO;
import entity.Programs;

import java.util.List;

public class ProgramsBOImpl implements ProgramsBO {

    ProgramDAOImpl programDAO= DaoFactory.getInstance().getDAO(DAOType.PROGRAMS);

    @Override
    public boolean add(ProgramDTO programDTO) throws Exception {
        System.out.println(programDTO);
        return programDAO.save(new Programs(
                programDTO.getId(),
                programDTO.getProgram(),
                programDTO.getDuration(),
                programDTO.getFee()
        ));
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
    public boolean update(ProgramDTO programDTO) throws Exception {
        return false;
    }
}
