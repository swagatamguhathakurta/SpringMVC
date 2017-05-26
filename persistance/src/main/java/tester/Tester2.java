package tester;

import home.entity.Address;
import home.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester2 {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa-example");

        EntityManager em = emf.createEntityManager();

        //INSERT
//        User user= new User();
//        user.setEmail("sguhatha@hawk.iit.edu");
//        user.setFirstName("Swagatam");
//        user.setLastName("Guhathakurta");
//
//        Address address= new Address();
//        address.setCity("Chicago");
//        address.setState("IL");
//        address.setZip("60616");
//
//
//
//        em.getTransaction().begin();
//        em.persist(address);
//
//        user.setAddress(address);
//
//        em.persist(user);
//        em.getTransaction().commit();

        //FIND
        User user = em.find(User.class, "6f5882f5-617f-4c19-9942-e01bcb865857");
        System.out.println(user);


        em.close();
        emf.close();
    }
}
