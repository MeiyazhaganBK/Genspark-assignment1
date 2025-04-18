class Dolphin extends Bird implements Eat, SaySomething {
    public void eat() {
        System.out.println("Dolphin is eating.");
    }

    public void saySomething() {
        System.out.println("Dolphin says: Click Click");
    }
}