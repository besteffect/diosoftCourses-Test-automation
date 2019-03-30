//This is the main Class
public class Animal {
    public String name="Musik";
    public String klichka;
    public int weight;
    public String theNumberOflEgs;
    public void askToEat() {
        System.out.println("Hey, master, give me something to eat!");
    }
    public static void main(String[] args) {
        Animal Cat1 = new Animal();
       //Cat1.name="Musik";
        System.out.println("Your cats name is " +Cat1.name);
    }

}

