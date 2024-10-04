public class divBy4 {
    
    class Sol
    {
        int divisibleBy4 (String N)
        {
            // Your Code Here
            String ltd = N.length()>2?N.substring(N.length()-2):N;
            int n = Integer.parseInt(ltd);
            return n%4==0?1:0;
        }
    }
}
