public class geeks11 {
    for(int i=0;i<arr.size();i++){
        while(arr.get(i)!=-1 && arr.get(i)!=i){
            int ele=arr.get(arr.get(i));
            arr.set(arr.get(i),arr.get(i));
            arr.set(i,ele);
        }
    }
    return arr;
}
