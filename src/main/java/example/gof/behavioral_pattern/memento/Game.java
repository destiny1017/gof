package example.gof.behavioral_pattern.memento;

import lombok.Data;

@Data
public class Game {
    private int blueTeamScore;
    private int redTeamScore;

    public GameSave saveGame() {
        return new GameSave(this.blueTeamScore, this.redTeamScore);
    }

    public void restoreGame(GameSave gameSave) {
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }
}
