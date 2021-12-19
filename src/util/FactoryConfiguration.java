package util;

import entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FactoryConfiguration {
   private static SessionFactory sessionFactory= createSession();

    private static SessionFactory createSession() {
        StandardServiceRegistry stg = new StandardServiceRegistryBuilder().loadProperties("application.properties").build();
        Metadata metadata=new MetadataSources(stg)
                .addAnnotatedClass(Student.class)
                .getMetadataBuilder().build();

        return metadata.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getInstance(){
        return sessionFactory;
    }
}
