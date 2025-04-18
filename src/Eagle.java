class Eagle extends Bird implements Fly, Eat, SaySomething {
    public void eat() {
        System.out.println("Eagle is eating.");
    }

    public void fly() {
        System.out.println("Eagle is soaring high.");
    }

    public void saySomething() {
        System.out.println("Eagle says: Screech");
    }
}