package hackerrank;

public class Solution {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print(a + ((int) Math.pow(2, i)) * b + " ");
        }


    }
}
