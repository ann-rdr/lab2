package myach;

public class testball {
    public static void main(String[] args) {
        ball b1 = new ball(4, "blue");
        System.out.println("Weight ball " + b1.getWeight()
            +", color is " + b1.getColor());

        ball b2 = new ball(3, "black");
        System.out.println("Weight ball " +b2.getWeight()
            +", color is " + b2.getColor());

        ball b3 = new ball( 5, "white");
        System.out.println("Weight ball " + b3.getWeight()
            +", color is " + b3.getColor());
    }
}
