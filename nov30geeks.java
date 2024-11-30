class Solution {
    public static boolean areAnagrams(String a, String b) {
        if(a.length()!=b.length()) return false;
       int[] arr=new int[26];
       for(char ch:a.toCharArray()) arr[ch-'a']++;
       for(char ch:b.toCharArray()) arr[ch-'a']--;
       for(int count:arr)  if(count!=0) return false;
       return true;
    }
}
