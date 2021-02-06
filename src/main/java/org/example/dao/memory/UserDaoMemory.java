package org.example.dao.memory;

import org.example.dao.UserDao;
import org.example.model.Pet;
import org.example.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Service
public class UserDaoMemory implements UserDao {

    private final List<User> users = new ArrayList<>(Arrays.asList(
            new User(1L, "Nick", "Morning", Set.of(
                    new Pet(null, null, "Doggy", LocalDate.now(), "Dog")
            )),
            new User(2L, "Ann", "Morning", Set.of(
                    new Pet(null, null, "Catty", LocalDate.now(), "Cat")
            ))
    ));

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        if (id != null) {
            return users.stream()
                    .filter(user -> id.equals(user.getId()))
                    .findAny()
                    .orElse(null);
        }
        return null;
    }

    @Override
    public void add(User toAdd) {
        if (toAdd != null) {
            User existing = findById(toAdd.getId());
            if (existing == null) {
                users.add(toAdd);
            }
        }
    }

    @Override
    public void delete(Long idToDelete) {
        if (idToDelete != null) {
            User existing = findById(idToDelete);
            if (existing != null) {
                users.remove(existing);
            }
        }
    }
}
