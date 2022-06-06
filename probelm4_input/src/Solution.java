import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
    public void solution() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int input = 1;
        int i = 1;

        System.out.println("[안내] 0을 입력하시면 입력이 종료 됩니다.");

        while (input != 0) {
            System.out.printf("숫자 %d : ", i++);

            try {
                input = Integer.parseInt(s.next());
            } catch (NumberFormatException ex) {
                System.out.println("[입력오류] : 숫자로 입력해주세요.");
                i--;
                continue;
            }

            if (input != 0)
                arrayList.add(input);
        }

        System.out.print("결과 : ");
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution();
    }
}

