public class Klingon implements Alien
{
    String name;
    boolean isFriendly = true;
    int health = 35;

    public Klingon (String name, boolean isFriendly, int health)
    {
        this.name = name;
        this.isFriendly = isFriendly;
        this.health = health;
    }//end 3 arg constructor

    @Override
    public void fight(int damage)
    {
        if (isFriendly == true)
            System.out.println("Fighting would break the Khitomer Accord.");
        else
        {
            health = health - damage;
            System.out.println("Damage dealt!");
        }//end else
    }//end method fight

    @Override
    public String toString()
    {
        String result = "A Klingon by the name of " + name;
        if (isFriendly == true)
            result += " who claims to be your friend, has ";
        else
            result += " who is clearly your enemy, has ";
        result += health + " health.";
        return result;
    }
}//end class Klingon
