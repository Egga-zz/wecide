package de.egga.wecide.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author egga
 */
@ComponentScan(basePackages = "de.egga.wecide")
@EnableAutoConfiguration
public class MainConfiguration {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainConfiguration.class, args);
    }

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}