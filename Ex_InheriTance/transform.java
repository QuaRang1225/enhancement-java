//package member;

class Gambler {

    int chip;
    static int ChipMoney = 10000;
    int win;

    public Gambler(int chip) {

        this.chip = chip;

    }

    public void Gamble(Gambler gm, int win) {
        int winner = gm.GambleLose(win);
        this.win = win;
        chip += 100 * winner;
    }

    public int GambleLose(int lose) {
        if (chip < lose) {
            int value = chip;
            chip = 0;
            return value;
        }
        chip -= 100 * lose;
        return lose;

    }

}

class Broker extends Gambler {

    static int cnt = 0;
    int cnt1 = 0;

    Broker(int chip) {
        super(chip);
    }

    public int Tip() {

        cnt1 += win;
        return cnt1 * 10000;
    }

    public int Tip1() {
        cnt += win;
        return cnt * 10000;
    }

    public void ShowGame() {

        System.out.println("칩의 개수" + chip + "개");
        System.out.println("환전금액:" + (ChipMoney * chip) + "원");
        System.out.println("총금액 : " + ((ChipMoney * chip) - Tip()) + "원");
        System.out.println("브로커의 팁은 " + Tip1() + "원 입니다.");

    }
}

public class transform {
    public static void main(String[] args) {

        Broker user1 = new Broker(800); // user1은 무조건 게임에서 이김 이길때마다 100의 칩을 얻게됨
        Broker user2 = new Broker(1500); // user2는 무조건 게임에서 짐 질때마다 100의 칩을 잃게됨
        Broker bk = new Broker(0);

        System.out.println("게임 전 머니의 보유 개수");
        System.out.println("유저 1");
        user1.ShowGame();
        System.out.println("유저 2");
        user2.ShowGame();

        user1.Gamble(user2, 3);
        user2.Gamble(user1, 4);

        System.out.println(" ");

        System.out.println("게임 후 머니의 보유 개수");
        System.out.println("유저 1");
        user1.ShowGame();
        System.out.println("유저 2");
        user2.ShowGame();

    }
}