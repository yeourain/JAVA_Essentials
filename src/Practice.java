public class Practice {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            // 공백이 하나씩 줄어들게 된다.
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            // 별 모양은 홀수로 늘어난다.
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            // 줄을 바꾼다.
            System.out.println();
        }
    }
}
