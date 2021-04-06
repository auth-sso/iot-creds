package pl.lodz.p.pbsir.credlogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://auth-sso.github.io/", maxAge = 3600)
@RequestMapping("/api")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/add",  method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String addUser(@RequestBody User user) {
        userRepository.addUser(user);
        return "";
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAll() {
        return userRepository.getAllUser();
    }


}
