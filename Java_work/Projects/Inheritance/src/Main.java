public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal animal = new Animal("Animal", 1 ,1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");

        //eat method is defined in Animal class, but the object of Dog class can access the eat method.
        //As Dog is INHERITING the properties of Animal

        //Also, if eat method is defined in the Dog class as well then
        // This is will search for eat method in Dog class first, then it will check in the parent class
        dog.eat();
        dog.walk();
        dog.run();

        System.out.println("****************************************************************************");

        //Challenge
        Ferrari ferrari = new Ferrari(36);
        ferrari.steer(45);
        ferrari.accelerate(30);
        ferrari.accelerate(20);
        ferrari.accelerate(-42);

        System.out.println("****************************************************************************");

        //Cylinder challenge
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Circle circle1 = new Circle(-5);



    }
}