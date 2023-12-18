package example.gof.behavioral_pattern.state;

public class StateClient {

    /**
     * 상태 패턴
     * 클라이언트에 상태에 따른 처리 로직을 덕지덕지 붙이지 않고 상태 클래스로 캡슐화하여 코드가 매우 단순해졌다.
     */
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");
        Student keesun = new Student("keesun");
        keesun.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", student);

        onlineCourse.addStudent(keesun);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
