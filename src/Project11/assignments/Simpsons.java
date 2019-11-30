
package Project11.assignments;

public class Simpsons {
    
    static String start[] = {"Simpsons in cave", "Lisa Trapped with Burns",
        "Burns at Moe's", "Moe with Edna", "Edna in school"};
    
    static String end[] = {"Simpsons leave cave", "Lisa takes picture with Burns",
        "Burns gets gold", "Moe puts gold in machine", "Edna stays on as teacher"};

    public static void main(String[] args) {
        Story(0);
    }
    
    public static void Story(int index){
        System.out.println(start[index]);
        if(index < start.length - 1)
            Story(index+1);
        System.out.println(end[index]);
    }
    
}
