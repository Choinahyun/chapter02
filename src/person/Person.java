package person;

public class Person {
    int age;
    public String name;
    protected int height;
    private int weight;

    public Person() {
    	System.out.println("Person() called");
    }
    
    public Person (String name) {
    	this.name = name;
    	System.out.println("Person (String name) called");
    }
}


