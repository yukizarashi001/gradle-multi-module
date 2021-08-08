package gradle.multi.project.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"gradle.multi.project"})
public class MutterApplication {
    public static void main(String[] args) {
        SpringApplication.run(MutterApplication.class, args);
    }
}
