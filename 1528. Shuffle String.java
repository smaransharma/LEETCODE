class Solution {
public String restoreString(String s, int[] indices) {        
    char[] cArr = s.toCharArray();
    for (int i = 0; i < cArr.length; i++) {
        while (i != indices[i]) {
            swapChar(cArr, i, indices[i]);
            swapInt(indices, i, indices[i]);
        }        
    }
    return String.valueOf(cArr);
}

public void swapInt(int[] indices, int x, int y) {
    int temp = indices[x];
    indices[x] = indices[y];
    indices[y] = temp;   
}

public void swapChar(char[] cArr, int x, int y) {
    char t = cArr[x];
    cArr[x] = cArr[y];
    cArr[y] = t;
}
}