package Lesson11Recursion;

import java.util.ArrayList;

public class pairStar {
    
    private ArrayList <String> in;
    private ArrayList <String> out;
    private String id;

    pairStar(ArrayList<String>i, ArrayList<String>o, String inid){
        in = i;
        out = o;
        id = inid;
    }
    
    public static void main(String[] args) {
        ArrayList<String>testData = new ArrayList();
        ArrayList<String>expected = new ArrayList();
        
        testData.add("hello");
        testData.add("xxyy");
        testData.add("aaaa");
        testData.add("aaab");
        testData.add("aa");
        
        expected.add("hel*lo");
        expected.add("x*xy*y");
        expected.add("a*a*a*a");
        expected.add("a*a*ab");
        expected.add("a*a");
        
        pairStar problem = new pairStar(testData,expected,"pairStar");
        problem.solve();
    }

    public String pairStar(String str) {
        //stopping state
        if (str.length() <= 1) {
            return str; //since it is a string, you use nothing
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }
    
    public void solve(){
        for (int i = 1; i < in.size(); i++) {
            System.out.print(id + " (" + in.get(i) + ") -> ");
            System.out.print(out.get(i) + "\tResult: ");
            String result = pairStar(in.get(i));
            System.out.print(result + "\t\t");
            System.out.print("Expected: " + out.get(i) + " Result: " + result);
            if(result.equals(out.get(i))){
                System.out.println("OK");
            }
            else{
                System.out.println("FAIL");
            }
        }
    }

}
