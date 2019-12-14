package kniga;

import java.lang.*;
public class kniga {
    private String name;
    private int page;


    public kniga() {
        name = "Physics";
        page = 20;
    }
    public kniga(int p) {
        name = "Bible";
        page = p;
    }
    public kniga(int p, String n) {
        name = n;
        page = p;
    }

    public int getPage() { return page; }
    public String getName() { return name; }
}
