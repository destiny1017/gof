package example.gof.behavioral_pattern.memento;

public class MementoClient {

    public static void main(String[] args) {
        // 게임 시작
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(10);

        // 게임 중단 및 상태 저장
        GameSave gameSave = game.saveGame();

        // 게임 종료
        game = null;

        // 게임 재개
        game = new Game();
        game.restoreGame(gameSave);
        System.out.println("game.getBlueTeamScore() = " + game.getBlueTeamScore());
        System.out.println("game.getRedTeamScore() = " + game.getRedTeamScore());
    }
}
