package Lesson11Recursion;

public class Factorial {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x + "! = " + fact1(x));
        System.out.println(x + "! = (recursive) " + factRecursion(x));
    }
    
    //recursive way
    public static int factRecursion(int num){
        if(num==1)
            return 1;
        else
            return num * factRecursion(num-1);
    }

    //normal way
    public static int fact1(int num) {
        int answer = num;
        for (int i = num - 1; i > 1; i--) {
            answer = answer * i;
        }
        return answer;
    }
    
    //WHAT NOT TO DO
    //this may cause stack overflow if called for num < 7
    /*
    public static int badMethod(int num){
        if(num==7)
            return 7;
        else return badMethod(num-1);
    }
    */
}
