public class RoosterComposition {

    private boolean canFly;
    private String song;
    private boolean canWalk;

    void fly() {
        if (canFly) {
            System.out.println("I am flying");
        } else {
            System.out.println("I can't fly");
        }
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    void sing() {
        System.out.println(this.song);
    }

    public void setSong(String song) {
        this.song = song;
    }

    void walk() {
        if (canWalk) {
            System.out.println("I am walking");
        } else {
            System.out.println("I can't walk");
        }
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }
}
