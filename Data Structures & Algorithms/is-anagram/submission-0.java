class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=s.length();
        int s2=t.length();
        HashMap<Character,Integer> map=new HashMap<>();
        if(s1!=s2){
            return false;
        }
        for(int i=0;i<s1;i++){
            Character sc=s.charAt(i);
            Character st=t.charAt(i);
            map.put(sc,map.getOrDefault(sc,0)+1);
            map.put(st,map.getOrDefault(st,0)-1);
        }
        for(int i:map.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
