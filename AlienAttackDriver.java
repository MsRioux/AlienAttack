public class AlienAttackDriver
{
    public static void main(String[] args) {

        Spaceman bob = new Spaceman("Bob", "Crewman", 20);
        Spaceman flo = new Spaceman("Flo", "Ensign", 35);
        Dalek threeTwo = new Dalek(3.2, 30);
        Dalek fourOne = new  Dalek (4.1, 40);
        Klingon garmok = new Klingon("Garmok", true, 45);
        Klingon burtog = new Klingon("Burtog", false, 50);


        System.out.println("Today's flight crew consists of:");
        System.out.println(bob + "\n" + flo);

        System.out.println("They will be encountering:");
        System.out.println(threeTwo + "\n" + fourOne);
        System.out.println(garmok + "\n" + burtog);


    }//end main method


}//end Driver Class for Alien Attack
