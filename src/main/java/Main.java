import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.collectCards();
        deck.show();
        deck.division(deck.getCards());
        deck.showHalfOne();
        System.out.println();
        deck.showHalfTwo();
        FaroShuffle faroShuffle=new FaroShuffle();
        faroShuffle.shuffleFaro(deck.getHalfOne(),deck.getHalfTwo());

    }
}
