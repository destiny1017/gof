package example.gof.behavioral_pattern.state;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
