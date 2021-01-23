package host.hyoau.comment.mapper;

import java.util.List;
import org.apache.ibatis.annotations.*;

import host.hyoau.comment.model.*;

public interface UserMapper {
    @Select("SELECT * FROM t_user")
	@Results({
	    @Result(property = "id",  column = "id")
    })
    List<User> getAll();
}
