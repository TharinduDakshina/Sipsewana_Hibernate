package dao.custom.impl;

import dao.custom.ProgramDAO;
import entity.Programs;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import javax.persistence.Id;

public class ProgramDAOImpl implements ProgramDAO {
    @Override
    public boolean save(Programs entity) throws Exception {
        /*System.out.println(entity.getId());
        System.out.println(entity.getProgram());
        System.out.println(entity.getDuration());*/

        Session session = FactoryConfiguration.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Programs entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Id id) throws Exception {
        return false;
    }
}
