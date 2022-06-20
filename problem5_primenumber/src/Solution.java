import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
    public void solution() {
        Scanner s = new Scanner(System.in);
        TreeSet<Integer> treeset = new TreeSet<>();
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

            if (isPrimeNumber(input)) {
                if (treeset.contains(input)) {
                    System.out.println("[입력오류] : 이미 입력된 숫자 입니다.");
                    i--;
                }
                else if (input != 0)
                    treeset.add(input);
            }
        }
        System.out.print("결과 : ");
        System.out.println(treeset);
    }

    public Boolean isPrimeNumber(int input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution();
    }
}

