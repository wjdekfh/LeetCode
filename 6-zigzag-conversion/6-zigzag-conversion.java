class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuffer sb = new StringBuffer();
        int nextIdx = 2 * (numRows-1);

        int divide = nextIdx;
        for(int i=0; i<numRows; i++) {
            boolean zigzag = false;

            for(int j=i; j<s.length();) {
                sb.append(s.charAt(j));
                if(zigzag) {
                    int minus = nextIdx-divide;
                    j += minus == 0 ? divide : minus;
                    zigzag = false;
                }else {
                    j += divide;
                    zigzag = true;
                }
            }
            divide -= 2;

            if(divide <= 0) divide = nextIdx;
        }

        return sb.toString();
    }
}