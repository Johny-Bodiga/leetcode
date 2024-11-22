class Solution {
    public int maxVowels(String s, int k) {
        int i = 0, l = 0, n = s.length(), count = 0, ans = 0;
        char c = ' ';
        System.out.println(n);
        if (n == 1)
            return 1;
        for (i = 0; i < n; i++) {
            c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
            if (i >= k) {
                c = s.charAt(l);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    count--;
                l++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}