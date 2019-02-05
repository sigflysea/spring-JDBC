package com.infosys.client;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.infosys.domain.Employee;
import com.infosys.service.EmployeeService;
public class ClientLogic {
    public static void main(String arg[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");
        Employee emp1 = new Employee(1000, "Bob", "Account");
        Employee emp2 = new Employee(1001, "Susan", "Testing");
        employeeService.insertEmployee(emp1);
        employeeService.insertEmployee(emp2);
        System.out.println("Records are successfully added..");       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empId to be deleted ");
        int empId = sc.nextInt();
        int result = employeeService.removeEmployee(empId);
        if (result > 0) {
            System.out.println(" Record Deleted ");
        } else {
            System.out.println(" No record found for the given empId ");
        }              
}
