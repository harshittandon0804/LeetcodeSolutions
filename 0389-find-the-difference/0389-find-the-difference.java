class Solution {
    public char findTheDifference(String s, String t) {
        boolean arr[] = new boolean[t.length()];
        Arrays.fill(arr,false);
        char c = ' ';
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            for(int j=0;j<t.length();j++){
                if(t.charAt(j)==c && arr[j]==false){
                    arr[j] = true;
                    break;
                }
            }
        }
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false)   ind = i;
        }
        c = t.charAt(ind);
        return c;
    }
}