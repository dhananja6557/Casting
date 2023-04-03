public class Parent {
    String name;
    void display() {
        System.out.println("Super Class is Running!");
    }
}
class Child extends Parent {
    int age;
    void display() {
        System.out.println("Sub Class is Running!");
    }
}
class Downcasting {
    public static void main(String[] args) {
        Parent p = new Child(); // Upcasted Object
        p.name = "Dhana";
        Child c = (Child) p; // Downcasted Object
        c.age = 30;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }

}