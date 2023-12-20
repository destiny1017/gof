package example.gof.behavioral_pattern.templatemethod;

public class TemplateMethodClient {

    public static void main(String[] args) {
        // template method pattern
        FileProcessor fileProcessor = new Multiply("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);

        // template callback pattern
        FileProcessor2 fileProcessor2 = new FileProcessor2("number.txt");
        int result2 = fileProcessor2.process((sum, number) -> sum += number);
        System.out.println(result2);
    }
}
