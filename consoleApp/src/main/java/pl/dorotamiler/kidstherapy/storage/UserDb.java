package pl.dorotamiler.kidstherapy.storage;

import pl.dorotamiler.kidstherapy.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDb {
    private static List<User> users = new ArrayList<>();

    public static List<User> getAllUsers() {
        if (users.size() == 0) {
            fillRepositoryWithDefaults();
        }
        return userRepository;
    }

    private static void importDefaultUsers() {

        User user1 = new User();
        user1.setId(1L);
        user1.setName("Jan");
        user1.setLogin("janko");
        user1.setAge(21);
        user1.setGender(Gender.MAN);
        userRepository.add(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Adam");
        user2.setLogin("ano");
        user2.setAge(20);
        user2.setGender(Gender.MAN);
        userRepository.add(user2);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Anna");
        user3.setLogin("anmi");
        user3.setAge(20);
        user3.setGender(Gender.WOMAN);
        userRepository.add(user3);
    }

    public static boolean contains(User user) {
        List<User> repository = getRepository();
        for (User userFromList : repository) {
            if (userFromList.getId() == user.getId()) {
                return true;
            }
        }
        return false;
    }
}
