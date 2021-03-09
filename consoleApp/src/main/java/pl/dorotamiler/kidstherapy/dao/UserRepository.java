package pl.dorotamiler.kidstherapy.dao;

import pl.dorotamiler.kidstherapy.domain.User;
import pl.dorotamiler.kidstherapy.storage.PatientDb;

import java.util.List;
import java.util.Optional;

public class UserRepository implements UserDao{

    @Override
    public void save(User user) {
        PatientDb.getAllUsers().add(user);
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
