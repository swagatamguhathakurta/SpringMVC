package home.service;

import home.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmploeeServiceImpl implements EmployeeService{
    @Override
    public List<Employee> findAll() {
        Employee e1=new Employee();
        e1.setFirstName("Swagatam");
        e1.setLastName("Guhathakurta");
        e1.setEmail("sguhatha@hawk.iit.edu");

        Employee e2=new Employee();
        e2.setFirstName("Arnab");
        e2.setLastName("Mukhopadhyay");
        e2.setEmail("amukhopa@hawk.iit.edu");

        return Arrays.asList(e1, e2);
    }

    @Override
    public Employee findOne(String id) {
        Employee e1=new Employee();
        e1.setFirstName("Swagatam");
        e1.setLastName("Guhathakurta");
        e1.setEmail("sguhatha@hawk.iit.edu");
        return e1;
    }

    @Override
    public Employee create(Employee emp) {
        System.out.println("emp = [" + emp + "]");
        return emp;
    }

    @Override
    public Employee update(String id, Employee emp) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
