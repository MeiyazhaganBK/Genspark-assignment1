class Crow extends Bird implements Fly, Eat, SaySomething {
    public void eat() {
        System.out.println("Crow is eating.");
    }

    public void fly() {
        System.out.println("Crow is flying.");
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public void saySomething() {
        System.out.println("Crow says: Caw Caw");
    }
}