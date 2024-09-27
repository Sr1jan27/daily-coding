public class uppsercaseConversion {
    // Given a string str, convert the first letter of each word in the string to uppercase. 
    class Solution
{
    
    public String transform(String S)
    {
       StringBuilder s = new StringBuilder();
        s.append(Character.toUpperCase(S.charAt(0)));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i-1)==' ') {
                s.append(Character.toUpperCase(S.charAt(i)));
            }
            else {
                s.append(S.charAt(i));
            }
        }
        return s.toString();
    }
}
}
