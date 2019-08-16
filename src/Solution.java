class Animal {
    void walk(){
        System.out.println("I am walking");
    }
    void sing() {
        System.out.println("I am Singing");
    }
    // 1.b
    void sing(String song){
        System.out.println(song);
    }

}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}

class Duck extends Bird {

    // A.2.a.  An overridden wrapper, or we can use directly the super method with input args.
    void sing(){
        sing("Quack, quack");
    }

    void swim(){
        System.out.println("I'm swimming");
    }

}

// A.2.c - Chicken
class Chicken extends Animal{
    void sing(){
        sing("Cluck, cluck");
    }
}

// A.3.a A Rooster
class Rooster extends Bird{
    void sing(){
        sing("Cock-a-doodle-doo");
    }
}
// A.3.b : Rooster is same as a chicken but it can fly

// A.3.c : We can use composition (HAS-A) relation instead of IS-A.
//          Please look at 'RoosterComposition.java'

class Parrot extends Bird{

    private String song;

    Parrot(String song){
        this.song = song;
    }

    void sing(){
        super.sing(song);
    }
}

// Fish

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        // A.4. Parrots. Here we can add any parrot's song with the constructor.
        // If a parrot changes it's voice dynamically we can add it through a setter.
        Parrot parrotWithDogs = new Parrot("Woof, woof");
        Parrot parrotWithCats = new Parrot("Meow");
        Parrot parrotWithRooster = new Parrot("Cock-a-doodle-doo");

        parrotWithDogs.sing();

    }
}

// 1.a. Unit Test.
// Test in a Separate Module as follows for the equality of the o/p using Junit (Test.java)

/*
    public class Test {
        @Test
        public void animalSingTest() {
            Bird bird = new Bird();
            // Test for equality
            assertEquals(0, bird.sing(), "I am Singing");
        }
    }
*/

// 1.b. Optimization: Its better to provide the content as a input arguments because it introduces
//      low coupling, re-usability, code size reduction


// 2. There's a problem in the current inheritance tree if chicken is implemented using existing bird
//      because it inherits 'fly' from Bird.

