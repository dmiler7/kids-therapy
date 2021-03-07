package pl.dorotamiler.kidstherapy.controller.dao;

import pl.dorotamiler.kidstherapy.model.User;
import pl.dorotamiler.kidstherapy.storage.UserDb;

import java.util.List;
import java.util.Optional;

public class UserRepository implements UserDao{

    @Override
    public void save(User user) {
        UserDb.getAllUsers().add(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public User findByPesel(String pesel) {
        return null;
    }

    @Override
    public Optional<User> findByLogin(String login) {
        return Optional.empty();
    }

    @Override
    public List<User> finaAll() {
        return null;
    }
}
