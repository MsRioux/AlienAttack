public class Dalek implements Alien
{
    int health;
    double designation;

    public Dalek(double designation, int health)
    {
        this.designation = designation;
        this.health = health;
    }//end 2 arg constructor

    @Override
    public void fight(int damage)
    {
        health = health - (damage/2);
    }// end fight method which overrides method from interface Alien

    @Override
    public String toString()
    {
        return "Dalek " + designation + " has health level " + health;
    }
}// end class Dalek which is a Alien
