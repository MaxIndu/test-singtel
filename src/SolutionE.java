import java.lang.reflect.Method;

public class SolutionE {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                // new Fish(),
                // new Shark(),
                // new Clownfish(),
                //new Dolhpin(),
                //new Frog(),
                //new Dog(),
                // new Butterfly()
                //new Cat()
        };

        // If it needed to be from same origin as animal, We can use interface for the animal.
        // But at this point too late.
    }

    private int countWalkable(Animal[] animals){

        int count = 0;

        // We can use this to check for canWalk property of the Animal, if there's one in the Animal.
        // Otherwise we would have to check for the method. But it's a bad practice and takes high cost.

        for (Animal animal : animals){

            Method canWalk = null;
            try {
                canWalk = Animal.class.getMethod("walk", (Class<?>[]) null);
            } catch (NoSuchMethodException | SecurityException e) {
                // Exception handler
                e.printStackTrace();
            }

            if(canWalk != null) {
                count++;
            }
        }

        return count;
    }
}
