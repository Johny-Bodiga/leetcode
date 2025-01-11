class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        else{
            HashMap<Character,Character> hm=new HashMap<>();
            HashMap<Character,Character> hm2=new HashMap<>();
            String st="",st1="";
            int i=0;
            for(i=0;i<s.length();i++){
                hm.put(t.charAt(i),s.charAt(i));
                hm2.put(s.charAt(i),t.charAt(i));
            }
            for(i=0;i<s.length();i++){
                st+=hm.get(t.charAt(i));
                st1+=hm2.get(s.charAt(i));
            }
            if(st.equals(s) && st1.equals(t))
            return true;
            else
            return false;
        }
        //return false; 
    }
}