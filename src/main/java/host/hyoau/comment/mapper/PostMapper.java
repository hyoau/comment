package host.hyoau.comment.mapper;

import java.util.List;
import org.apache.ibatis.annotations.*;

import host.hyoau.comment.model.*;

public interface PostMapper {
    @Select("SELECT * FROM t_post")
	@Results({
	    @Result(property = "id",  column = "id")
    })
    List<Post> getAll();

    @Select("SELECT * FROM t_post WHERE id = #{id}")
	@Results({
        @Result(property = "id",  column = "id")
    })
    Post getOne(String id);
    
    @Insert("INSERT INTO t_post(id) VALUES(#{id})")
    void insertOne(Post post);

    @Delete("DELETE FROM t_post WHERE id =#{id}")
	void delete(String id);
}
