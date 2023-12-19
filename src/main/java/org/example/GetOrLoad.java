package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetOrLoad {
    public static void main(String[] args) {
        //        ----------------------- GET & LOAD -------------------------------------------
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println(sessionFactory +"- obj");
        System.out.println(sessionFactory.isClosed());
        Session session = sessionFactory.openSession();

//          get Student - 3
        Student student = session.get(Student.class, 3); // not sure when DB has 3 value - get()
        System.out.println(student);

//          get Address - 2
        Address address = session.load(Address.class, 2); // when you sure about the value has in DB - load()
        System.out.println(address);
        session.close();
    }
}
