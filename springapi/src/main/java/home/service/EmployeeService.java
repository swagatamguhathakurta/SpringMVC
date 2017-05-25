package home.service;

import home.entity.Employee;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findOne(String id);

    Employee create(Employee emp);

    Employee update(String id, Employee emp);

    void delete(String id);

}
