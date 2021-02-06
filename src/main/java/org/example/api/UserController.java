package org.example.api;

import org.example.dao.UserDao;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping
    public List<User> findAll() {
        return userDao.findAll();
    }

    @GetMapping(path = "/{id}")
    public User findAll(@PathVariable Long id) {
        return userDao.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody User toAdd) {
        userDao.add(toAdd);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        userDao.delete(id);
    }

}
