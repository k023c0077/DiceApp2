public class Game {
    Player p1;
    Player p2;
    Dice d1; 
    Dice d2; 

    Game() {
        p1 = new Player();
        p2 = new Player();
        d1 = new Dice();
        d2 = new Dice();
    }

    void start() {
        System.out.println("プレーヤー1がサイコロを振ります...");
        p1.turn(d1);
        System.out.println("プレーヤー1の目: " + p1.score);

        System.out.println("プレーヤー2がサイコロを振ります...");
        p2.turn(d2);
        System.out.println("プレーヤー2の目: " + p2.score);

        judge();
    }

    void judge() {
        if (p1.score > p2.score) {
            System.out.println("プレーヤー1の勝ち!");
        } else if (p1.score < p2.score) {
            System.out.println("プレーヤー2の勝ち!");
        } else {
            System.out.println("あいこ！");
        }
    }
}
