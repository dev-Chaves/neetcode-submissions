class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        String string = s.toLowerCase(Locale.ROOT);

        while (l < r){

            while (!Character.isLetterOrDigit(string.charAt(l)) && l < r){
                l++;
            }

            while (!Character.isLetterOrDigit(string.charAt(r)) && l < r){
                r--;
            }

            if(string.charAt(l) != string.charAt(r)) return false ;

            l++;
            r--;

        }

        return true;

    }
}
