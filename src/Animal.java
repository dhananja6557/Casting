public class Animal {
    String name;
    void setName() {
        System.out.println("Elephant");
    }
}
class Fish extends Animal {
    String color;
    @Override
    void setName() {
        System.out.println("Blue Fish");
    }
}
class Run {
    public static void main(String[] args) {
        Animal a = new Fish(); // Upcast Object
        a.name = "Alaguduwa";
        Fish f = new Fish();
        f.name = "Linna";
        f.color = "Gray";
        System.out.println("Name : " + a.name);
        a.setName();
        System.out.println("Name : " + f.color);
    }
}
