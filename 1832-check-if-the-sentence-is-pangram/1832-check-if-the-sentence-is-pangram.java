import static java.util.Arrays.binarySearch;
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[sentence.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = sentence.charAt(i);
        }
        Arrays.sort(arr);
        boolean flag = true;
        int ind = -1;
        for(int i='a';i<='z';i++){
            ind = binarySearch(arr,i);
            if(ind<0) {
                flag=false;
                break;
            }
        }
        return flag;
    }
}