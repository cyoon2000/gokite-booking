package kite.controllers;

import kite.beans.Property;
import kite.beans.User;
import kite.services.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/user", produces = "application/json", consumes = "application/json")
@SuppressWarnings("unused")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    User getUser(@PathVariable Long id) {
        return userDAO.getById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllProperties() {
        return userDAO.getAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public @ResponseBody
    long createUser(@RequestBody User user) {
        return userDAO.create(user);
    }
}
