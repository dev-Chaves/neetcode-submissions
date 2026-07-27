class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            char[] frequence = new char[26];

            for (char c : s.toCharArray()) {
                frequence[c - 'a']++;
            }

            map.computeIfAbsent(Arrays.toString(frequence), k -> new ArrayList<>()).add(s);

        }

        return map.values().stream().toList();
    }
}
