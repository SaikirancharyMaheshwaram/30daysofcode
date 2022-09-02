class Solution {
       public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chacterarr = s.toCharArray();
            Arrays.sort(chacterarr);
            String converted = String.valueOf(chacterarr);
            if (!map.containsKey(converted)) map.put(converted, new ArrayList<>());
            map.get(converted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
