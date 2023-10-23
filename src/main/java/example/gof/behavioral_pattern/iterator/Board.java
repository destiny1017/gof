package example.gof.behavioral_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        try {
            Thread.sleep(100);
            this.posts.add(new Post(content));
        } catch (InterruptedException e) {

        }
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }

}
