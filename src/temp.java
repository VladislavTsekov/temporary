public class temp {
    private String input;
    private int [][] mat;

    public static void main(String[] args) {
        String xx="12/\n34";
        for (int i = 0; i < xx.length(); i++) {
            if (xx.contains("\n")) { System.out.println(true); xx=xx.replaceFirst("\n",""); }
        }
        temp obj = new temp("2 4 6\n 6 8 3");
        for (int i = 0; i < obj.getRow(1).length; i++) {
            System.out.print(obj.getRow(1)[i]+" ");
        }
    }

    public temp(String matrixAsString){
        this.input=matrixAsString;
//        int k=0,i=0,j=0;
//        while (k<matrixAsString.length()){
//            String temp="";
//            if (matrixAsString.charAt(k)>47 && matrixAsString.charAt(k)<58){
//                temp=temp.concat(""+matrixAsString.charAt(k));
//            }
//            if (matrixAsString.charAt(k)==' '){
//                mat[i][j]=Integer.parseInt(temp);
//                temp="";
//                j+=1;
//            }
//            if (matrixAsString.charAt(k)=='n')
//            k++;
//        }
    }

    public int[] getRow(int rowNumber){
        int[] result= new int[getColumnsCount()];
        int p=0;
        for (int j=0; j<=rowNumber; j++){
            int i=0;
            while (i<result.length){
                if (input.charAt(p)>47 && input.charAt(p)<58){
                    result[i]=Integer.parseInt(""+input.charAt(p));
                    i++;
                }
                p++;
            }
        }

        return result;
    }

    public int[] getColumn(int columnNumber){
        return null;
    }

    public int getRowsCount(){
        String temp=input;
        int count=0, i=0;
        if (temp==null || temp.equals("")) return 0; else count++;
        while (i<temp.length()){
            if (temp.contains("\n")) { count++; temp=temp.replaceFirst("\n"," "); }
        }
        return count;
    }

    public int getColumnsCount(){
        int count=0, i=0;
        while (this.input.charAt(i)!='\n' && i<this.input.length()){
            if (this.input.charAt(i)>47 && this.input.charAt(i)<58) count++;
            i+=1;
        }
        return count;
    }
}