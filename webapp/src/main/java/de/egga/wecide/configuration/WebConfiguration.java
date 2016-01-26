package de.egga.wecide.configuration;

import de.egga.wecide.eggs.repository.EggEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author egga
 */
@ComponentScan(basePackages = "de.egga.wecide")
@EnableAutoConfiguration
// TODO find a better way to scan ALL entities
@EntityScan(basePackageClasses=EggEntity.class)
@PropertySource("classpath:application.properties")
public class WebConfiguration {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainConfiguration.class, args);
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.live")
    public DataSource postgresDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.local")
    @Profile("local")
    // TODO move this to test configuration
    public DataSource h2DataSource() {
        return DataSourceBuilder.create().build();
    }
}