package dao;

import entity.SuperEntity;

import javax.persistence.Id;
import javax.swing.text.html.parser.Entity;

public interface SuperDao <Entity extends SuperEntity,id> {
    public boolean save(Entity entity) throws Exception;

    public boolean update(Entity entity) throws Exception;

    public boolean delete(Id id) throws Exception;
}
