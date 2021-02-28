package pl.dorotamiler.kidstherapy.dao;

import pl.dorotamiler.kidstherapy.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    void save(User user);

    Optional<User> findById(Long id);

    User findByPesel(String pesel);

    Optional<User> findByLogin(String login);

    List<User> finaAll();
}
