package example.gof.behavioral_pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GameSave {
    private final int blueTeamScore;
    private final int redTeamScore;
}
