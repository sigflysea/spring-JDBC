package com.infosys.repository;
import java.util.List;
import com.infosys.domain.Employee;
public interface EmployeeDAO {
    //Method to insert Employee record
    public void insert(Employee emp);
    //Method to remove a record from Employee table
    public int delete(int empId);
}
