public class Cards {
    private Par par;
    private Suit suit;

    public Cards(Suit suit, Par par) {
        this.par = par;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "{" + par + suit +
                '}';
    }
}
