class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = s.length() - 1;i >= 0;i--) {
            if(s.charAt(i) == 'I'  ) {
                sum += 1;
            }
            else if(s.charAt(i) == 'V') {
                if(i >= 1 && s.charAt(i - 1) == 'I') {
                    sum += 4;
                    i -= 1;
                }
                else {
                    sum += 5;
                }
            }
            else if(s.charAt(i) == 'X') {
                if(i >= 1 && s.charAt(i - 1) == 'I') {
                    sum += 9;
                    i -= 1;
                }
                else {
                    sum += 10;
                }
            }
            else if(s.charAt(i) == 'L') {
                if(i >= 1 && s.charAt(i - 1) == 'X') {
                    sum += 40;
                    i -= 1;
                }
                else {
                    sum += 50;
                }
            }
            else if(s.charAt(i) == 'C') {
                if(i >= 1 && s.charAt(i - 1) == 'X') {
                    sum += 90;
                    i -= 1;
                }
                else {
                    sum += 100;
                }
            }
            else if(s.charAt(i) == 'D') {
                if(i >= 1 && s.charAt(i - 1) == 'C') {
                    sum += 400;
                    i -= 1;
                }
                else {
                    sum += 500;
                }
            }
            else if(s.charAt(i) == 'M') {
                if(i >= 1 && s.charAt(i - 1) == 'C') {
                    sum += 900;
                    i -= 1;
                }
                else {
                    sum += 1000;
                }
            }
        }
        return sum;
    }
}