package gradle.multi.project.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data
@Accessors(chain=true)
@Component
public class User {
    private int id;
    private String name;
    private String address;

    public User() {
        this.id = 1;
        this.name = "yuki";
        this.address = "東京都";
    }
}
