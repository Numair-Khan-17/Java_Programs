interface Game {
    void play(String mode);
    void play(String mode, int players);
}

interface VoiceChat {
    void chat(String player);
    void chat(String player, int duration);
}

class Freefire implements Game, VoiceChat {

    public void play(String mode) {
        System.out.println("Mode: " + mode);
    }

    public void play(String mode, int players) {
        System.out.println("Mode: " + mode + "\tPlayers: " + players);
    }

    public void chat(String player) {
        System.out.println("Chatting with: " + player);
    }

    public void chat(String player, int duration) {
        System.out.println("Chatting with: " + player + "\tDuration: " + duration);
    }

    public void play(String player, String mode, int rank) {
        System.out.println("Player: "+ player + "\tMode: " + mode + "\tRank: " + rank);
    }
}

public class freefire {
    public static void main(String[] args) {

        Freefire game = new Freefire();

        game.play("Battle Royale");  //Battle Royale, Clash Squad, Lone Wolf, Craftland
        game.play("Clash Squad", 4);
        game.play("Lone Wolf", "John Doe", 1);

        game.chat("Jane Doe");
        game.chat("Alice Doe", 10);
    }
}
