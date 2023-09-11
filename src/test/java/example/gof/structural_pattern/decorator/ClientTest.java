package example.gof.structural_pattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    CommentService commentService = new DefaultCommentService();
    boolean trimFlag;
    boolean spamFlag;

    @Test
    void defaultTest() {
        trimFlag = false;
        spamFlag = false;
        if(trimFlag) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        if(spamFlag) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        Client client = new Client(commentService);
        client.writeComment("하이하이");
        client.writeComment("하아아이이...");
        client.writeComment("https://asassd.com");
    }

    @Test
    void trimtTest() {
        trimFlag = true;
        spamFlag = false;
        if(trimFlag) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        if(spamFlag) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        Client client = new Client(commentService);
        client.writeComment("하이하이");
        client.writeComment("하아아이이...");
        client.writeComment("https://asassd.com");
    }

    @Test
    void spamTest() {
        trimFlag = false;
        spamFlag = true;
        if(trimFlag) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        if(spamFlag) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        Client client = new Client(commentService);
        client.writeComment("하이하이");
        client.writeComment("하아아이이...");
        client.writeComment("https://asassd.com");
    }

    @Test
    void spamTrimTest() {
        trimFlag = true;
        spamFlag = true;
        if(trimFlag) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        if(spamFlag) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        Client client = new Client(commentService);
        client.writeComment("하이하이");
        client.writeComment("하아아이이...");
        client.writeComment("https://asassd.com");
    }

}