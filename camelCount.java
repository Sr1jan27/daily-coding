public class camelCount {
    class Sol
{
    int countCamelCase (String s)
    {
        // your code here   
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                cnt++;
            }
        }
        return cnt;
    }
}
}
