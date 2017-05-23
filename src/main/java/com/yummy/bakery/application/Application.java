package com.yummy.bakery.application; /**
 * Created by alalwani on 14/04/17.
 */

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.yummy.bakery.*"})
@EnableJpaRepositories("com.yummy.bakery.*")
//@EnableAutoConfiguration
@EntityScan("com.yummy.bakery.*")
public class Application {

    @Value("${spring.datasource.driverClassName}")
    private String databaseDriverClassName;

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${spring.datasource.username}")
    private String databaseUsername;

    @Value("${spring.datasource.password}")
    private String databasePassword;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName(databaseDriverClassName);
        dataSource.setUrl(datasourceUrl);
        dataSource.setUsername(databaseUsername);
        dataSource.setPassword(databasePassword);

        return dataSource;
    }
}
