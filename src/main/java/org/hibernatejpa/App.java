package org.hibernatejpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernatejpa.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Student student = new Student();
        student.setAge(20);
        student.setName("Real wla saurabh");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println( "Hello World!" );
    }
}
