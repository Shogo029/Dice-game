import java.util.Scanner;

class Dicegame{
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hallo, "+name+ "!");

        double rand = Math.random() * 6 + 1;
        int die1 = (int)rand;
        rand = Math.random() * 6 + 1;
        int die2 = (int)rand;
        System.out.println("Rolling the dice…");
        System.out.println("Die 1: "+ die1);
        System.out.println("Die 2: "+ die2);
        System.out.println("Total value: "+ (die1+die2));

        if(die1+die2 > 7) System.out.println(name +" won!");
        else System.out.println(name + " lost");
    }
} 