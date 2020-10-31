package org.persistence;

import org.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main( String[] args ) {
//        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Person.class);
        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Person e1 = new Person();
        e1.setName("Gaurav1");

        Person e2 = new Person();
        e1.setName("Gaurav2");

        session.save(e1);

        System.out.println("e1_id" + e1.getId());
        session.save(e2);
        t.commit();

        session.createQuery("from Person");

        factory.close();
        session.close();
    }
}