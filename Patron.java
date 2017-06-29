/**
 * Created by tousifchowdhury on 2/16/15.
 */
public class Patron extends java.lang.Object implements Prioritizable{



    private java.lang.String n;
    private int c;
    private boolean r;

    /**
     * this is the patron class.
     * @param n the name
     * @param c the coolness
     * @param r regular or not
     */


    public Patron (java.lang.String n, int c, boolean r){
        this.n = n;
        this.c = c;
        this.r = r;

    }

    /**
     * coolness, name, priority
     * @return either the coolness, or regularity or priority
     */


    public int coolness(){
        return this.c;
    }

    public boolean regularity(){
        return this.r;
    }

    public java.lang.String name(){
        return this.n;
    }

    public double getPriority(){
        if (this.r == true)
                return this.c +.5;
        else
            return this.c;
    }


    /**
     * prints the name when the patron gets admitted.
     */

    public void printWhenAdmitted(){
        if (regularity() == true){
            System.out.print("Regular ");
        }
        System.out.println(this.n + " with coolness factor: " + coolness() + " get in!" );


    }



}
