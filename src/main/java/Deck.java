import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Cards> cards = new ArrayList<Cards>();
    public List<Cards> halfOne = new ArrayList<Cards>();
    public List<Cards> halfTwo = new ArrayList<Cards>();
    private int i;

    public List<Cards> getCards() {
        return cards;
    }

    public List<Cards> getHalfOne() {
        return halfOne;
    }

    public List<Cards> getHalfTwo() {
        return halfTwo;
    }

    public List<Cards> collectCards() {//создали колоду
        for (Suit suit : Suit.values()) {
            for (Par par : Par.values()) {
                this.cards.add(new Cards(suit, par));
            }
        }
        return cards;
    }
    public void show() {//показать созданную колоду
        System.out.println("созданную колоду");
        for (Cards c:cards) {
            System.out.println(c);
        }
        System.out.println("...показали");
    }


    public void division(List<Cards> deck) {//показать созданную колоду
        this.cards=deck;
        int i=deck.size();
        for (int k=0;k<i/2;k++){
            halfOne.add(cards.get(k));
        }
        for (int k=i/2;k>=i;k++){
            halfTwo.add(cards.get(k));
        }

    }

    public void showHalfOne() {//показать созданную колоду
        System.out.println("первая половина");
        for (Cards c:cards) {
            System.out.println(c);
        }
    }
    public void showHalfTwo() {//показать созданную колоду
        System.out.println("вторая половина");
        for (Cards c:cards) {
            System.out.println(c);
        }
    }


}
