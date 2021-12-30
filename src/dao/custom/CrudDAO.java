package dao.custom;

import dao.SuperDao;
import entity.SuperEntity;

import javax.persistence.Id;

public interface CrudDAO<Entity extends SuperEntity,id> extends SuperDao {
    public boolean save(Entity entity) throws Exception;

    public boolean update(Entity entity) throws Exception;

    public boolean delete(Id id) throws Exception;
}
