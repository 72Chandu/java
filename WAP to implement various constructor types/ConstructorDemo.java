class ConstructorDemo {
    private String name;
    private int age;
    public ConstructorDemo() {  // Default Constructor
        this.name = "Default Name";
        this.age = 0;
        System.out.println("Default Constructor Called");
    }

    
    public ConstructorDemo(String name, int age) {  // Parameterized Constructor
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }
    public ConstructorDemo(ConstructorDemo obj) { // Copy Constructor
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("Copy Constructor Called");
    }

    public void display() { // Method to display object data
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        obj1.display();

        ConstructorDemo obj2 = new ConstructorDemo("Alice", 25);
        obj2.display();

        ConstructorDemo obj3 = new ConstructorDemo(obj2);
        obj3.display();
    }
}
