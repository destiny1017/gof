package example.gof.structural_pattern.decorator;

public class TrimmingCommentDecorator extends CommentDecorator {
    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public String addComment(String str) {
        return super.addComment(trimming(str));
    }

    public String trimming(String str) {
        return str.replace("...", "");
    }
}
