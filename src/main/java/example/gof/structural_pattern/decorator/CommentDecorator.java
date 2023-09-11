package example.gof.structural_pattern.decorator;

public class CommentDecorator implements CommentService {

    private final CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public String addComment(String str) {
        return commentService.addComment(str);
    }
}
