import java.lang.System;
import java.util.ArrayList;

class Solution {
    public int plusOne(int[] digits) {
      int result = 0;
      boolean check_lock = false;
      ArrayList<Integer> template = new ArrayList<Integer>();

      // check_lock
      for (int index = 0; index < digits.length; index++) {
        if (digits[index] != 0) {
          check_lock = true;
        }

        if (check_lock) {
          template.add(digits[index]);
        }
      }

      int template_length = template.size();

      for (int index = 0; index < template.size(); index++) {
        // System.out.println(template.get(reversed(index, template_length)));
        // result += template.get(reversed(index, template_length))

        result += template.get(reversed(index, template_length))*pown(index, 10);
      }

      return result;
    }

    private int reversed(int i, int l) { return (l - 1) - i; }

    private int pot(int a, int p) {
      int result = 1;

      for (int index = 0; index < a; index++) {
        result *= p;
      }

      return result;
    }

    private int pown(int a, int p) { return pot(a, p); }
}

public class plusOne {
  public static void main(String[] args) {
    int[] digits = {1, 0, 0, 1, 0};
    Solution obj = new Solution();

    System.out.println(obj.plusOne(digits));
  }
}
