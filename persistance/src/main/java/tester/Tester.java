package tester;

import home.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");

        EntityManager em = emf.createEntityManager();

        //INSERT
//        Employee employee = new Employee();
//        employee.setEmail("amukhopa@gmail.com");
//        employee.setFirstName("Arnab");
//        employee.setLastName("Mukhopadhyay");
//        employee.setSalary(10000);
//
//        em.getTransaction().begin();
//        em.persist(employee);
//        em.getTransaction().commit();

        //FIND ONE
//        Employee employee = em.find(Employee.class, "adf5a080-3123-4ae5-a192-0c45904d8049");
//        System.out.println(employee);

        //UPDATE
//        Employee employee = em.find(Employee.class, "adf5a080-3123-4ae5-a192-0c45904d8049");
//        employee.setSalary(100000);
//        em.merge(employee);
//
//        em.getTransaction().begin();
//        em.persist(employee);
//        em.getTransaction().commit();

        //DELETE
//        Employee employee = em.find(Employee.class, "09fd0df9-02d9-47f6-afcd-aec6b0f91fb2");
//
//        em.getTransaction().begin();
//        em.remove(employee);
//        em.getTransaction().commit();

        //FIND ALL
//        em.createNativeQuery("SELECT * from Employee ORDER BY email");
//        TypedQuery<Employee> query = em.createQuery("SELECT emp from Employee emp ORDER BY emp.email ASC", Employee.class);
//        List<Employee> resultList = query.getResultList();
//
//        for(Employee emp : resultList) {
//            System.out.println(emp);
//
//        }

        //WHERE CLAUSE
//        TypedQuery<Employee> query = em.createQuery("SELECT emp from Employee emp where emp.email=:pEmail", Employee.class);
//        query.setParameter("pEmail", "sguhatha@hawk.iit.edu");
//
//        List<Employee> resultList = query.getResultList();
//
//        for(Employee emp : resultList) {
//            System.out.println(emp);
//
//        }

        //USING NAMED QUERY
//        TypedQuery<Employee> query = em.createNamedQuery("Employee.findByEmail", Employee.class);
//        query.setParameter("pEmail", "sguhatha@hawk.iit.edu");
//
//        List<Employee> resultList = query.getResultList();
//
//        for(Employee emp : resultList) {
//            System.out.println(emp);
//
//        }

        em.close();
        emf.close();

    }
}
