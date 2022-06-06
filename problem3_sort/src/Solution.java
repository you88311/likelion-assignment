import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public void solution() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int i = 1;
        int input = 0;

        while (i <= 10) {
            System.out.printf("숫자 %d : ", i++);

            try {
                input = Integer.parseInt(s.next());
            } catch (NumberFormatException ex) {
                System.out.println("[입력오류] : 숫자로 입력해주세요.");
                i--;
                continue;
            }

            arrayList.add(input);
        }

        arrayList.sort(Comparator.naturalOrder());
        System.out.print("결과 : ");
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution();
    }
}
