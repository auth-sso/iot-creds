package pl.lodz.p.pbsir.credlogger;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    public List<User> getAllUser() {
        return new ArrayList<>(users);
    }
}
