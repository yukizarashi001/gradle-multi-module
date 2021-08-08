package gradle.multi.project.app.controllers;

import gradle.multi.project.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutterController {
    @Autowired
    private User user;

    @GetMapping(value = "/index")
    public String index() {
        return user.getName();
    }
}
