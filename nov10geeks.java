   public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        ArrayList<Integer>ans=new ArrayList<>();
        HashSet<Integer>st=new HashSet<>();
        
        int i=0;
        int j=0;
        
        
        while(i<a.length){
            st.add(a[i]);
            i++;
        }
        
        while(j<b.length){
            st.add(b[j]);
            j++;
        }
        
        for(Integer e:st){
            ans.add(e);
        }
        
        Collections.sort(ans);
        
        return ans;
    }
