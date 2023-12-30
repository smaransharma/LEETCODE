public class palindrome {
    public boolean isPalindrome(int x) {
      if (x < 0 || x != 0 && x % 10 == 0) {
        return false;
      }
      int back = 0;
      int front = x;
      while (x != 0) {
        back = back * 10 + x % 10;
        x = x / 10;
      }
      return back == front;
    }
  }