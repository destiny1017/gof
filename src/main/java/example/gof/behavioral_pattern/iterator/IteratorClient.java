package example.gof.behavioral_pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorClient {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("첫번째 게시물");
        board.addPost("두번째 게시물");
        board.addPost("세번째 게시물");

        // TODO 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }
        System.out.println();

        // TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            Post next = recentPostIterator.next();
            System.out.println(next.getTitle());
            System.out.println("next.getCreatedDateTime() = " + next.getCreatedDateTime());

        }

    }
}
