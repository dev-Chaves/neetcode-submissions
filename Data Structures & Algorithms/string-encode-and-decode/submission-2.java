class Solution {

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }
        
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            
            while (str.charAt(j) != '#') {
                j++;
            }
            
            int length = Integer.parseInt(str.substring(i, j));
            
            int inicioPalavra = j + 1;
            int fimPalavra = inicioPalavra + length;
            
            res.add(str.substring(inicioPalavra, fimPalavra));
            
            i = fimPalavra;
        }
        
        return res;
    }

}
