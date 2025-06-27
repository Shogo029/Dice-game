class Dicegame{
    public static void main(String[] args){
        double rand = Math.random() * 6 + 1;
        int die1 = (int)rand;

        rand = Math.random() * 6 + 1;
        int die2 = (int)rand;

        System.out.println("Rolling dice…");
        System.out.println("Die 1: "+ die1);
        System.out.println("Die 2: "+ die2);
        System.out.println("Total value: "+ (die1+die2));
    }
} 