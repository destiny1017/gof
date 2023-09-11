package example.gof.structural_pattern.decorator;

public class DefaultCommentService implements CommentService {

    @Override
    public String addComment(String str) {
        return str;
    }
}
