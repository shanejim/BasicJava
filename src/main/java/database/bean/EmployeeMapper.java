package database.bean;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setPassword(rs.getString("password"));
        employee.setRoleId(rs.getInt("role_id"));
        employee.setAddTime(rs.getTimestamp("add_time").toLocalDateTime());
        //employee.setAddTime(LocalDateTime.parse(rs.getString("add_time"), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        return employee;
    }

}
