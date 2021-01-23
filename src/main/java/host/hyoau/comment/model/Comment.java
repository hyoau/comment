package host.hyoau.comment.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Comment {
    private String id;
    private String authorId;
    private String postId;
    private int floor;
    private String content;
    private String html;
    private Timestamp createAt;
    private String parentId;

    public Comment(String _id, String _authorId, String _postId, int _floor, String _content, String _html, Timestamp _createAt,
            String i) {
        this.setId(_id);
        this.setAuthorId(_authorId);
        this.setPostId(_postId);
        this.setFloor(_floor);
        this.setContent(_content);
        this.setHtml(_html);
        this.setCreateAt(_createAt);
        this.setParentId(i);
    }
}
