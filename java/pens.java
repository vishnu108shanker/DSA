class pens {
    static int helper(String s, int i, long num, int sign){
        if(s.charAt(i) < '0' || s.charAt(i) > '9'){
               return s
            }
    }
    public int myAtoi(String input) {
        // Your code goes here

        String str =  input.trim() ;
        if (str.isEmpty()) return 0;
        int i = 0 ;
        int sign =1 ;

        if(str.charAt(0)== '-' || str.charAt(0)== '+'){
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++ ;
        }
        return helper(str, i, 0, sign);
//        StringBuilder sb = new StringBuilder() ;


//        int j = i ;
//        for(int k = i ; k<s.length() ; k++){
//
//            if(s.charAt(k) < '0' || s.charAt(k) > '9'){
//                break ;
//            }
//            j++;
//        }
//
//        if (j==i){
//            return 0 ;
//        }
//
//        long result = Long.parseLong(s.substring(i, j)) ;
//
//        if(s.charAt(0)=='-'){
//            result =  -result ;
//        }
//        if (result > 2147483647) return 2147483647;
//        if (result < -2147483648) return -2147483648;
//
//        return (int)result ;




    }
}