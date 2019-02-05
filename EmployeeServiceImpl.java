package com.infosys.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.domain.Employee;
import com.infosys.repository.EmployeeDAO;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDAO employeeDao ;
    public EmployeeDAO getEmployeeDao() {
        return employeeDao;
    }
    @Autowired
    public void setEmployeeDao(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }
    public void insertEmployee(Employee emp) {
        employeeDao.insert(emp);
    }
    public int removeEmployee(int empId) {
        return employeeDao.delete(empId);
    }   
}
