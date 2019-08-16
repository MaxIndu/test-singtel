class commonAncestor{
    private boolean canFly;

    commonAncestor(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

}

class Butterfly extends commonAncestor {

    Butterfly(){
        super(true);
    }

    void song(){
        System.out.println("No sound");
    }
}

class Caterpillar extends commonAncestor {
    Caterpillar() {
        super(false);
    }

    void walk() {
        System.out.println("I can walk");
    }
}


public class SolutionD {

    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly();
        Caterpillar caterpillar = new Caterpillar();

        System.out.println(butterfly.isCanFly());
        System.out.println(caterpillar.isCanFly());
    }
}
