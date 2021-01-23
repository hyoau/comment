package host.hyoau.comment.mapper;

import host.hyoau.comment.model.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import java.util.UUID;

@SpringBootTest
public class PostMapperTest {
    @Autowired
    private PostMapper postMapper;

    @Test
    public void testGetAll() {
        List<Post> posts = postMapper.getAll();
        System.out.println(posts.toString());
    }

    @Test
    public void testGetOne() {
        Post post = postMapper.getOne("a4a908da-f76c-47b5-863f-20f8e700b544");
        System.out.println(post.toString());
        post = postMapper.getOne("83f47e16-c007-46cb-b20d-807b75d4a990");
        System.out.println(post.toString());
    }

    @Test
    public void testDeleteOne() {
        String id = UUID.randomUUID().toString();

        Post post = new Post();
        post.setId(id);

        postMapper.insertOne(post);
        System.out.println("Insert success!");
        Post postGet = postMapper.getOne(id);
        System.out.println(postGet.toString());

        postMapper.delete(id);
        Post postDel = postMapper.getOne(id);
        if (postDel == null) {
            System.out.println("Delete success!");
        }
    }
}
