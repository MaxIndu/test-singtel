
// B. Fish class

class swimmable{

    void swim(){
        System.out.println("I can swim");
    }
}

class Fish extends swimmable{

    private Size size;
    private String color;
    private String speciality;

    Fish(Size size, String color, String speciality) {
        this.size = size;
        this.color = color;
        this.speciality = speciality;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fish{");
        sb.append("size=").append(size);
        sb.append(", color='").append(color).append('\'');
        sb.append(", speciality='").append(speciality).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Clownfish extends Fish {
    Clownfish(){
        super(Size.SMALL, "Orange", "make jokes");
    }
}

class Shark extends Fish {
    Shark(){
        super(Size.LARGE, "Grey", "Eat other fish");
    }
}

// B.3
class Dolphin extends swimmable{
    // Inherits only swim avoid other behaviours and properties from the Fish
}


public class SolutionB {
    public static void main(String[] args) {
        Clownfish clownfish = new Clownfish();
        System.out.println(clownfish);
        Shark shark = new Shark();
        System.out.println(shark);
    }
}


