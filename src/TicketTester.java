/**
 * Tests the ticket class.
 *
 * @author myurkunas
 */
public class TicketTester {
    public static void main(String[] args) {
        Ticket n = new Ticket(10);
        System.out.println("Ticket: " + n);
        System.out.println("Identifier: " + n.getIdentifier());
        System.out.println("Ticket Value: " + n.getTicketValue());
    }
}
