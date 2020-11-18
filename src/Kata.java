public class Kata {
    public static void main(String[] args) {
        String input = "(-23f+4)^6";
        int a,b,n;
        a=separateA(input);
        b=separateB(input);
        n=separateN(input);
        System.out.println(a+", "+b+", "+n);
    }
    static int separateA(String input){
        int p=1;
        String X="";
        while (input.charAt(p)<(char)97){
            if (input.charAt(p)>48 && input.charAt(p)<58) {
                X=X.concat(""+input.charAt(p));
            }
            p+=1;
        }
        if (X.equals("")) return 0;
        if (input.charAt(2)==45) return -Integer.parseInt(X);
        else return Integer.parseInt(X);
    }
    static int separateB(String input){
        String X="";
        int p=0;
        boolean isNegative;
        for (char i : input.toCharArray())  { if(i>96) p=input.indexOf(i); }
        if (""+input.charAt(p+1)=="-")
        while (input.charAt(p)!=41){ // closing bracket ")"
            if (input.charAt(p)>48 && input.charAt(p)<58) X=X.concat(""+input.charAt(p));
            p+=1;
        }

        return Integer.parseInt(X);
    }
    static int separateN(String input){
        String X="";
        int p=input.indexOf(")");
        while (p<input.length()){
            if (input.charAt(p)>48 && input.charAt(p)<58) X=X.concat(""+input.charAt(p));
            p+=1;
        }
        return Integer.parseInt(X);
    }

}