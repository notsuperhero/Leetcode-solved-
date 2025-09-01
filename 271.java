public class Solution {
    public String encode(List<String>strs){
        if(strs.size()==0){
            return Character.toString((char)258);
        }
        String seperate = Character.toString((char)257);
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s).append(seperate);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
public List<String>decode(String s){
    if(s.equals(Character))
}

