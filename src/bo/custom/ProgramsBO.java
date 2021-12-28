package bo.custom;

import dto.ProgramDTO;

import java.util.List;

public interface ProgramsBO {
    public boolean add(ProgramDTO programDTO) throws Exception;

    public List<ProgramDTO> findAll() throws Exception;

    public boolean delete(String s) throws Exception;

    public boolean update(ProgramDTO programDTO) throws Exception;
}
