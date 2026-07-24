class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){

            char[] str = strs[i].toCharArray();

            Arrays.sort(str);

            map.computeIfAbsent(String.valueOf(str), k -> new ArrayList<>()).add(strs[i]);

        }

        return map.values().stream().toList();
    }
}
