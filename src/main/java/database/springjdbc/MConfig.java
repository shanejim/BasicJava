package database.springjdbc;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

//@ComponentScan(basePackages="com.shanejim")
@Configuration
public class MConfig {
    private final String URL="jdbc:mysql://192.168.25.130:3306/personal?serverTimezone=GMT%2B8";
    private final String NAME="shanejim";
    private final String PASSWORD="Shanejim123,,,";


    @Bean
    public DataSource datasouce() {
        BasicDataSource bSource=new BasicDataSource();
        bSource.setDriverClassName("com.mysql.jdbc.Driver");
        bSource.setUrl(URL);
        bSource.setUsername(NAME);
        bSource.setPassword(PASSWORD);
        bSource.setInitialSize(5);
        bSource.setMaxActive(10);
        return bSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource datasouce) {
        return new JdbcTemplate(datasouce);
    }
}
