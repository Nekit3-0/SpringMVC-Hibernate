package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private static int USER_ID;
    private List<User> users;

    {
        users = new ArrayList<User>();
        users.add(new User(++USER_ID,"NameOne", "SurnameOne", 11));
        users.add(new User(++USER_ID,"NameTwo", "SurnameTwo", 22));
        users.add(new User(++USER_ID,"NameThree", "SurnameThree", 33));
        users.add(new User(++USER_ID,"NameFour", "SurnameFour", 44));
    }

    public List<User> index() {
        return users;
    }

    public void save(User user) {
        user.setId(++USER_ID);
        users.add(user);
    }
}
