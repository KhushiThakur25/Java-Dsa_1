public class Dice_Board {
    static void dice_board(int cur_val, int end_value, String result) {
        if (cur_val == end_value) {
            System.out.print(result + ",");
            return;
        }
        if (cur_val > end_value) {
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            dice_board(cur_val + dice, end_value, result + dice);
        }
    }

    public static void main(String[] args) {
        dice_board(0, 10, "");
    }
}
