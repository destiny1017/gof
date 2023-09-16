package example.gof.structural_pattern.decorator;

import org.springframework.context.annotation.Scope;

public class Client {

    private final CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        System.out.println(commentService.addComment(comment));
    }
}
