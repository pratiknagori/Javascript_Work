public class Dog extends Animal {
    //inheriting the class Animal we use extends keyword
    //<access modifier> <class name> extends <class from which you need to inherit>
    //<then you need to call the constructor of the class> (you can do generate code in intelli j), super keyword

    //unique characteristic of dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //creating a constructor for class Dog and initializing all the parameters. Some parameters can be taken from Animal class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.coat = coat;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.eyes = eyes;
    }

    //This is called method overriding. That is method has same name as the method present in the parent class which is overridden in the sub clas.
    //parent method can be called using the super keyword
    @Override
    public void eat() {
        System.out.println("Dog.eat method called");
        chew();
        super.eat();
    }

    private void chew () {
        System.out.println("Dog.chew () called method called from Dog class");

    }

    public void walk () {
        System.out.println("Dog.walk () called");
        super.move(13);
        //usually write in this way as in the future if you wish to override this method in this class, this will call the move method in the class
        move(5);

    }

    public void run () {
        System.out.println("Dog.run () called");
        super.move(26);
    }
}
