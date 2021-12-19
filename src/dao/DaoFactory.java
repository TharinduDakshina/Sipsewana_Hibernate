package dao;

public class DaoFactory {
    private static DaoFactory daoFactory;

    public static DaoFactory getInstance(){
        return (null==daoFactory)? daoFactory=new DaoFactory():daoFactory;
    }

    public  <T extends SuperDao> T getDao(DoaTye doaTye){
        switch (doaTye){
            case  PROGRAMS: return (T) new ProgramesDaoImpl();
            case  STUDENT: return (T) new ProgramesDaoImpl();
            case  REGISTRATION: return (T) new ProgramesDaoImpl();
            default:return null;
        }
    }
}
