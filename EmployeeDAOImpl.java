package com.infosys.repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.infosys.domain.Employee;
/* value attribute is used to give explicit bean name/id, this name overrides the default bean?
(which is same as class name lowering first letter) provided by Spring */
@Repository(value = "employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public void insert(Employee emp) {
        String query = "INSERT INTO Employee(EmpId, EmpName, department) Values (?,?,?)";
        jdbcTemplate.update(query,new Object[] { emp.getEmpId(), emp.getEmpName(),emp.getDepartment() });
    }   
    public int delete(int empid) {
        return jdbcTemplate.update("delete from Employee where empid = ? ",empid);
    }
}
 
