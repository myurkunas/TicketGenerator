import java.util.Random;

/**
 * A ticket is an object that is a random number for systems that require unique identifiers.
 * Tickets have the format: #-10^n
 * @author myurkunas
 */
public class Ticket {

    private int a; // first int in ticket (known as 'identifier')
    private int n; // remaining int of ticket value (known as 'ticket value')
    private int t; // entire ticket as integer (known as 'ticket')
    private int length; // length of ticket

    Random rand = new Random();

    /**
     * Explicit Constructor
     * @param length the length of the entire ticket.
     */
    public Ticket(int length)
    {
        this.length = length;
        a = (rand.nextInt(9)+1);
        n = (rand.nextInt((int) Math.pow(10,length - 1)));
        t = a * (int)Math.pow(10, length - 1) + n;
    }

    /**
     * a method that gets the identifier of the ticket
     * @return ticket identifier
     */
    public int getIdentifier() {
        return a;
    }

    /**
     * a method that gets the ticket value
     * @return ticket value
     */
    public int getTicketValue() {
        return n;
    }

    /**
     * Overrides the toString method from the Object class.
     * @return ticket
     */
    public String toString() {
        return "# " + a + "-" + n;
    }


}
