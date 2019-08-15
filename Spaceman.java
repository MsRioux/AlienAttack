public class Spaceman
{
    //Instance variables
    String name, rank;
    int health;

    public Spaceman(String name, String rank, int health)
    {
        this.name = name;
        this.rank = rank;
        this.health = health;
    }// end three arg constructor

    // Getters / Accessors

    //  Setters / Mutators

    // toString

    @Override
    public String toString() {
        return "Spaceman " + name + " is Rank " + rank + " and has " + health + " health.";
    }
}//end object class Spaceman
