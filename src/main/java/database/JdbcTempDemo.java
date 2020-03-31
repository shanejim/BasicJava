package database;

import database.bean.Employee;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class JdbcTempDemo {
    public static void main(String[] args) {
//创建数据源连接池
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.25.130:3306/personal?serverTimezone=GMT%2B8");
        dataSource.setUsername("shanejim");
        dataSource.setPassword("Shanejim123,,,");
        //创建jdbc模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        String sql = "SELECT * FROM t_employee where is_deleted =0";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        List<Employee> list = jdbcTemplate.query(sql, rowMapper);


        System.out.println(list.get(0).toString());

    }
}
