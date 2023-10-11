package example.gof.structural_pattern.facade;

import lombok.Data;

@Data
public class EmailMessage {
    private String subject;
    private String text;
    private String to;
    private String from;
}
