import java.util.Scanner;
public class Tusk5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int den = Integer.parseInt(parts[0]);
        int mes = Integer.parseInt(parts[1]);
        int god = Integer.parseInt(parts[2]);
        if (mes < 3) {
            mes += 12;
            god -= 1;
        }
        int poslcifr = god % 100;
        int pervcifr = god / 100;
        int denNedeli = (den + (13 * (mes + 1)) / 5 + poslcifr + (poslcifr / 4) + (pervcifr / 4) - (2 * pervcifr)) % 7;
        denNedeli = (denNedeli + 6) % 7;
        String[] vsedni = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(vsedni[denNedeli]);
    }
}