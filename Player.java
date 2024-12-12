public class Player {
    int score;
    void turn(Dice d) {
        d.roll();
        score = d.me;
    }
}
