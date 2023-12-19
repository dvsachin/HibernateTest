package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Project Started!" );
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println(sessionFactory +"- obj");
        System.out.println(sessionFactory.isClosed());

        // Student Obj
        Student student  = new Student();
        student.setName("Green Lantern");
        student.setCity("New York");

        // Address Obj
        Address address = new Address();
        address.setStreet("111 Oberoi");
        address.setCity("India");
        address.setAddedDate(new Date());
        address.setTemp(96);
        // Reading image
        FileInputStream fis = new FileInputStream("src/main/java/img.png");
        byte[] data = new byte[fis.available()];
        address.setImage(data);

        Session session = sessionFactory.openSession();
        System.out.println(session);
        session.beginTransaction();
        session.save(student);
        session.save(address);
        session.getTransaction().commit();

//        ===========================================================================

    }
}
