public class reportsppam {
    public static void main(String[] args){
        String[] message = {"hello","world","leetcode"};
        String[] bannedWords = {"world","hello"};
        boolean b = reportSpam(message, bannedWords);
        System.out.println(b);
    }
    // public static boolean reportSpam(String[] message, String[] bannedWords) {
    //     int cns = 0;
    //     for(int i=0;i<bannedWords.length;i++){
    //         for(int j=0;j<message.length;j++){
    //             if(bannedWords[i]==message[j]){
    //                 cns++;
    //                 System.out.println(cns);
    //                 System.out.println(bannedWords[i]+"  ..  "+ message[j]);
    //             } 
    //         }
    //     }

    //     if(cns>=2) return true;

    //     return false;
        
    // }

    public static boolean reportSpam(String[] message, String[] bannedWords) {
        int cns = 0;
        // for(int i=0;i<bannedWords.length;i++){
        //     for(int j=0;j<message.length;j++){
        //         if(bannedWords[i]==message[j]){
        //             cns++;
        //             System.out.println(cns);
        //             System.out.println(bannedWords[i]+"  ..  "+ message[j]);
        //         } 
        //     }
        // }

        // if(cns>=2) return true;

        // return false;


        HashSet<String> bs = new HashSet<>();

        for(String w : bannedWords){
            bs.add(w);
        }

        for(String m: message ){
            if(bs.contains(m)) cns++;
            if(cns>=2) return true;
        }

        return false;
        
    }
}
