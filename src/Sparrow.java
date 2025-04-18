class Sparrow extends Bird implements Fly, Eat {
    public void eat() {
        System.out.println("Sparrow is eating.");
    }

    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}