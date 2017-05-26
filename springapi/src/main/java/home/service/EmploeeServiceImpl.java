package home.service;

import home.Exception.BadRequestException;
import home.Exception.NotFoundException;
import home.entity.Employee;
import home.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Arrays;
import java.util.List;

@Service

public class EmploeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository repository;

    @Override
    @Transactional(readOnly=true)
    public List<Employee> findAll() {

        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Employee findOne(String id) {
        Employee employee = repository.findOne(id);
        if (employee == null) {
            throw new NotFoundException("Employee with id=" + id + " not found");
        }
        return employee;
    }

    @Override
    @Transactional
    public Employee create(Employee emp) {
        Employee existing = repository.findByEmail(emp.getEmail());
        if (existing != null) {
            throw new BadRequestException("Employee with email=" + emp.getEmail() + " already exist");
        }
        return repository.create(emp);

    }

    @Override
    @Transactional
    public Employee update(String id, Employee emp) {
        Employee existing = repository.findOne(id);
        if (existing == null) {
            throw new NotFoundException("Employee with id=" + id + " not found");
        }
        return repository.update(emp);
    }

    @Override
    @Transactional
    public void delete(String id) {

        Employee existing = repository.findOne(id);
        if (existing == null) {
            throw new NotFoundException("Employee with id=" + id + " not found");
        }
        repository.delete(existing);

    }
}
