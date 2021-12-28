package util;


import entity.Programs;
import entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FactoryConfiguration {

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry standardServiceRegistry =
                new StandardServiceRegistryBuilder().loadProperties("hibernate.properties").build();

        Metadata metadata = new MetadataSources(standardServiceRegistry)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Programs.class)/*.addAnnotatedClass(Registration.class)*/
                .getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getInstance(){
        return sessionFactory;
    }
}

/*public class FactoryConfiguration {
   private static SessionFactory sessionFactory= createSession();

    private static SessionFactory createSession() {
        StandardServiceRegistry stg =
                new StandardServiceRegistryBuilder().loadProperties("application.properties").build();
        Metadata metadata=new MetadataSources(stg)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Programs.class)
                .getMetadataBuilder().build();

        return metadata.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getInstance(){
        return sessionFactory;
    }
}*/
/*
* public class FactoryConfiguration {
    private static SessionFactory sessionFactory= createSession();

    private static SessionFactory createSession() {
        StandardServiceRegistry stg = new StandardServiceRegistryBuilder().loadProperties("hibernate.properties").build();
        Metadata metadata=new MetadataSources(stg)
                .addAnnotatedClass(Student.class).addAnnotatedClass(Parent.class).addAnnotatedClass(Program.class)
                .getMetadataBuilder().build();

        return metadata.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getInstance(){
        return sessionFactory;
    }
}*/