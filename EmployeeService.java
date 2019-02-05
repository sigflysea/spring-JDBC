package com.infosys.service;
import java.util.List;
import com.infosys.domain.Employee;
public interface EmployeeService {
       public void insertEmployee(Employee emp);
       public int removeEmployee(int empId);      
 }
