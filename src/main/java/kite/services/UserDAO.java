package kite.services;

import kite.beans.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends BaseDAO<User> {

    public UserDAO() {
        super(User.class);
    }
}
