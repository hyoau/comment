package host.hyoau.comment.mapper;

import java.util.List;
import org.apache.ibatis.annotations.*;

import host.hyoau.comment.model.*;

public interface CommentMapper {
    @Select("SELECT * FROM t_comment")
	@Results({
        @Result(property = "id",  column = "id"),
        @Result(property = "authorId",  column = "author_id"),
        @Result(property = "postId",  column = "post_id"),
        @Result(property = "floor",  column = "floor"),
        @Result(property = "content",  column = "content"),
        @Result(property = "html",  column = "html"),
        @Result(property = "createAt",  column = "create_at"),
        @Result(property = "parentId",  column = "parent_id")
    })
    List<Comment> getAll();

    @Select("SELECT * FROM t_comment WHERE id = #{id}")
	@Results({
        @Result(property = "id",  column = "id"),
        @Result(property = "authorId",  column = "author_id"),
        @Result(property = "postId",  column = "post_id"),
        @Result(property = "floor",  column = "floor"),
        @Result(property = "content",  column = "content"),
        @Result(property = "html",  column = "html"),
        @Result(property = "createAt",  column = "create_at"),
        @Result(property = "parentId",  column = "parent_id")
    })
    Comment getOne(String id);
    
    @Insert("INSERT INTO t_comment(id, author_id,post_id,floor, content, html, create_at, parent_id) VALUES(#{id}, #{authorId}, #{postId}, #{floor}, #{content}, #{html}, #{createAt}, #{parentId})")
    void insertOne(Comment comment);

    @Delete("DELETE FROM t_comment WHERE id =#{id}")
	void delete(String id);
}
