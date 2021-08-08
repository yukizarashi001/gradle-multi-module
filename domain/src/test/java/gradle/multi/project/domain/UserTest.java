package gradle.multi.project.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserTest {

    @Autowired
    private User user;

    @Test
    public void contextLoads() {
        assertThat(user.getName()).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}