class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> hash= new HashMap<>();
       List<List<String>> ans= new ArrayList<>();

       for(int i=0;i<strs.length;i++){
        int [] freq= new int[26];
        String curr= strs[i];
        for(int j=0;j<curr.length();j++){
            freq[curr.charAt(j)-'a']++;
        }
        StringBuilder sb = new StringBuilder();

        for(int k=0;k<26;k++){
            sb.append('#').append(freq[k]);
        }
        String key = sb.toString();

        if(hash.containsKey(key)){
           hash.get(key).add(curr);
        }
        else{
            List<String> samp= new ArrayList<>();
            samp.add(curr);
            hash.put(key,samp);
        }
        
       }
        for(List<String> val:hash.values()){
            ans.add(val);
        }
        return ans;

    }
}
