class Animal {
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
    void sing() {
        System.out.println("I am Singing");
    }
    // 1.b
    void sing(String song){
        System.out.println(song);
    }
}

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

// 1.a. Unit Test.
// Test in a Separate Module as follows for the equality of the o/p using Junit

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

