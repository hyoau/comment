package host.hyoau.comment.mapper;

import host.hyoau.comment.model.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetAll() {
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
    }
}
