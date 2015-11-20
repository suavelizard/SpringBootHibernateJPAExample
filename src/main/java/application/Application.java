package application;

/**
 * Created by Zane on 11/19/2015.
 */
import configuration.RepositoryConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@PropertySources(value = {@PropertySource("classpath:application.properties")})
////@Configuration("configuration")
//@Configuration
//@Configuration
//@ComponentScan
//@EnableJpaRepositories
//@Import(RepositoryRestMvcConfiguration.class)
//@EnableAutoConfiguration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = ".")
@Configuration
@ComponentScan({"model","repository","controller","configuration"})

//@ComponentScan("controller")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
   // @Bean/


}