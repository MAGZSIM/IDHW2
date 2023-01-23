public class Main {
    public static void main(String[] args) {

        int ticketPrice = 1000;
        boolean ticketPaid = true;

        int bonus = ticketPaid ? 20 : 0;

        int bonusMiles = ticketPrice / bonus;

        System.out.println(" Начисленно бонусных миль: " + bonusMiles);

    }
}