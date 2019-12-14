package kniga;

import java.lang.*;
public class testkniga {
    public static void  main(String[] args) {
        kniga k1 = new kniga( 40, "Physics");
        System.out.println("Pages "+ k1.getPage()
            +" name is " + k1.getName());

     kniga k2 = new kniga( 25);
     System.out.println("Pages " + k2.getPage()
         +" name is " + k2.getName());

     kniga k3 = new kniga(20,"Math");
     System.out.println("Pages " + k3.getPage()
         +" name is " + k3.getName());
    }
}
