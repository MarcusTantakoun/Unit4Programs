
package Project10.assignments;

import Lesson10InsertDelete.*;

public class Person implements Comparable{
    private String name, gender;
    private int age;
    
    public Person(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public int getAge(){
        return age;
    }
    
    public String toString(){
        //ex: Bob: age 12, male
        return name + ": age " + age + ", " + gender;
    }

    public int compareTo(Object t) {
        String othername = ((Person)t).getName();
        return name.compareTo(othername);
    }
    
    /*public final boolean setName(String nm) {
        boolean nameBlank = nm.equals("");
        if (nameBlank) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }    
    
    public final boolean setAge(int a) {
        boolean ageBlank = (a<0 || age >100);
        if (ageBlank) {
            return false;
        } else {
            age = a;
            return true;
        }
    }*/
}
