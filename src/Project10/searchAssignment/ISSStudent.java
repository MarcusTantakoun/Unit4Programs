
package Project10.searchAssignment;

public class ISSStudent implements Comparable{
    private String name;
    private String address;
    private int id;
    
    public ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public String toString(){
        return "  Name: " + name + "\n  Address: " + address + "\n  ID: " + id;
    }
    
    public int getID(){
        return id;
    }

    public int compareTo(Object t) {
        if(this.id > ((ISSStudent)t).getID()){
            return 1;
        }
        else if(this.id < ((ISSStudent)t).getID()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
