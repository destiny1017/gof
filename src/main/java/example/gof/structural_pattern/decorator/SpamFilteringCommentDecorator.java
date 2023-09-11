package example.gof.structural_pattern.decorator;

public class SpamFilteringCommentDecorator extends CommentDecorator {
    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public String addComment(String str) {
        return isSpamComment(str) ? "" : super.addComment(str);
    }

    public boolean isSpamComment(String str) {
        return str.contains("http");
    }
}
