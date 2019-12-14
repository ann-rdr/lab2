package myach;

public class ball {
    private String color;
    private int weight;


    public ball() {
        color = "blue";
        weight = 2;
    }
    public ball(int w) {
        color = "black";
        weight = w;
    }
    public ball(int w, String c) {
        color = c;
        weight = w;
    }

    public int getWeight() { return weight; }
    public String getColor() { return color; }
}
