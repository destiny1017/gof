package example.gof.creatinal_pattern.proxy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GithubIssue implements Cloneable {

    private final GithubRepository githubRepository;
    private int id;
    private String title;

    public GithubIssue(GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // clone() 메서드는 기본적으로 Shallow Copy(얕은 복사)이므로, 필드값도 별개로 세팅하려면 직접 객체를 생성해서 리턴해줘야함
        // return super.clone();

        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser(this.githubRepository.getUser());
        githubRepository.setName(this.githubRepository.getName());

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setId(this.id);
        githubIssue.setTitle(this.title);
        return githubIssue;
    }
}
