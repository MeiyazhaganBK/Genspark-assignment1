//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Fly> allFlyingBirds = new ArrayList<>();

        Sparrow sparrow = new Sparrow();
        Crow crow = new Crow();
        Pigeon pigeon = new Pigeon(new PigeonSparrowFlyingBehaviour());
        Eagle eagle = new Eagle();

        allFlyingBirds.add(sparrow);
        allFlyingBirds.add(crow);
        allFlyingBirds.add(pigeon);
        allFlyingBirds.add(eagle);

        for (Fly bird : allFlyingBirds) {
            bird.fly();
        }
    }
}