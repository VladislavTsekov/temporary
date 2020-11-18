import java.util.*;
// THIS IS TEMP CLASS FOR QUICK TESTS

class ObservedPin {

    public static void main(String[] args) {
        String observed="369";
        List<List<Integer>> data = new ArrayList<>();
        List <Integer> a1 = new ArrayList<>();
        List <Integer> a2 = new ArrayList<>();
        List <Integer> a3 = new ArrayList<>();
        List <Integer> a4 = new ArrayList<>();
        List <Integer> a5 = new ArrayList<>();
        List <Integer> a6 = new ArrayList<>();
        List <Integer> a7 = new ArrayList<>();
        List <Integer> a8 = new ArrayList<>();
        List <Integer> a9 = new ArrayList<>();
        List <Integer> a0 = new ArrayList<>();
        a1.add(1); a1.add(2); a1.add(4);
        a2.add(1); a2.add(2); a2.add(3); a2.add(5);
        a3.add(2); a3.add(3); a3.add(6);
        a4.add(1); a4.add(4); a4.add(5); a4.add(7);
        a5.add(2); a5.add(4); a5.add(5); a5.add(6); a5.add(8);
        a6.add(3); a6.add(5); a6.add(6); a6.add(9);
        a7.add(4); a7.add(7); a7.add(8);
        a8.add(5); a8.add(7); a8.add(8); a8.add(9); a8.add(0);
        a9.add(6); a9.add(8); a9.add(9);
        a0.add(8); a0.add(0);
        data.add(a0); data.add(a1); data.add(a2); data.add(a3); data.add(a4);
        data.add(a5); data.add(a6); data.add(a7); data.add(a8); data.add(a9);
        LinkedList <String> result = new LinkedList <>();
        for (int a=0; a<data.get(Integer.parseInt(""+observed.charAt(0))).size(); a+=1){
            String temp=""+data.get(Integer.parseInt(""+observed.charAt(0))).get(a);
            if (observed.length()>1)
                for (int b=0; b<data.get(Integer.parseInt(""+observed.charAt(1))).size(); b+=1){
                    temp+=""+data.get(Integer.parseInt(""+observed.charAt(1))).get(b);
                    if (observed.length()>2)
                        for (int c=0; c<data.get(Integer.parseInt(""+observed.charAt(2))).size(); c+=1){
                            temp+=""+data.get(Integer.parseInt(""+observed.charAt(2))).get(c);
                            if (observed.length()>3)
                                for (int d=0; d<data.get(Integer.parseInt(""+observed.charAt(3))).size(); d+=1){
                                    temp+=""+data.get(Integer.parseInt(""+observed.charAt(3))).get(d);
                                    if (observed.length()>4)
                                        for (int e=0; e<data.get(Integer.parseInt(""+observed.charAt(4))).size(); e+=1){
                                            temp+=""+data.get(Integer.parseInt(""+observed.charAt(4))).get(e);
                                            if (observed.length()>5)
                                                for (int f=0; f<data.get(Integer.parseInt(""+observed.charAt(5))).size(); f+=1){
                                                    temp+=""+data.get(Integer.parseInt(""+observed.charAt(5))).get(f);
                                                    if (observed.length()>6)
                                                        for (int g=0; g<data.get(Integer.parseInt(""+observed.charAt(6))).size(); g+=1){
                                                            temp+=""+data.get(Integer.parseInt(""+observed.charAt(6))).get(g);
                                                            if (observed.length()>7)
                                                                for (int h=0; h<data.get(Integer.parseInt(""+observed.charAt(7))).size(); h+=1){
                                                                    temp+=""+data.get(Integer.parseInt(""+observed.charAt(7))).get(h);
                                                                    result.add(temp);
                                                                    temp=temp.substring(0,temp.length()-1);
                                                                }
                                                            else result.add(temp);
                                                            temp=temp.substring(0,temp.length()-1);
                                                        }
                                                    else result.add(temp);
                                                    temp=temp.substring(0,temp.length()-1);
                                                }
                                            else result.add(temp);
                                            temp=temp.substring(0,temp.length()-1);
                                        }
                                    else result.add(temp);
                                    temp=temp.substring(0,temp.length()-1);
                                }
                            else result.add(temp);
                            temp=temp.substring(0,temp.length()-1);
                        }
                    else result.add(temp);
                    temp=temp.substring(0,temp.length()-1);
                }
            else result.add(temp);
        }
        for (String i : result) System.out.print(i+", ");

    }

    public static List<String> getPINs(String observed) {

        return null;
    } // getPINs

} // ObservedPin