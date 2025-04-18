class Pigeon extends Bird implements Fly {
    FlyingBehaviour flyingBehaviour;

    public Pigeon(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void fly() {
        flyingBehaviour.flyingBehaviour();
    }
}
