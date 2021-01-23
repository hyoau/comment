package host.hyoau.comment.mapper;

import host.hyoau.comment.model.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import java.sql.Timestamp;
import java.util.UUID;

@SpringBootTest
public class CommentMapperTest {
    @Autowired
    private CommentMapper commentMapper;
    
    @Test
    public void testGetAll() {
        List<Comment> posts = commentMapper.getAll();
        System.out.println(posts.toString());
    }

    @Test
    public void testGetOne() {
        Comment post = commentMapper.getOne("1c5b55b7-2541-446d-bd95-5b917b21812a");
        System.out.println(post.toString());
        post = commentMapper.getOne("bfbf4065-997d-4ee4-9425-74516413ca0b");
        System.out.println(post.toString());
    }

    @Test
    public void testInsertOne() {
        String id = UUID.randomUUID().toString();
        String authorId = UUID.randomUUID().toString();
        String postId = UUID.randomUUID().toString();
        String parentId = UUID.randomUUID().toString();

        Comment comment = new Comment(
            id,
            authorId,
            postId,
            0,
            "Hello, world",
            "Hello, world",
            new Timestamp(System.currentTimeMillis()),
            parentId
        );
        commentMapper.insertOne(comment);
        System.out.println("Insert success");
        Comment commentGet = commentMapper.getOne(id);
        System.out.println(commentGet.toString());
    }

    @Test
    public void testDeleteOne() {
        String id = UUID.randomUUID().toString();
        String authorId = UUID.randomUUID().toString();
        String postId = UUID.randomUUID().toString();
        String parentId = UUID.randomUUID().toString();

        Comment comment = new Comment(
            id,
            authorId,
            postId,
            0,
            "Hello, world",
            "Hello, world",
            new Timestamp(System.currentTimeMillis()),
            parentId
        );
        commentMapper.insertOne(comment);
        System.out.println("Insert success");
        Comment commentGet = commentMapper.getOne(id);
        System.out.println(commentGet.toString());

        commentMapper.delete(id);
        Comment commentDel = commentMapper.getOne(id);
        if (commentDel == null) {
            System.out.println("Delete success");
        }
    }
}
