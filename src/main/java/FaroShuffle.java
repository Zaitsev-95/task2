import java.util.ArrayList;
import java.util.List;

public class FaroShuffle {
    public List<Cards> halfOne ;
    public List<Cards> halfTwo ;
    private List<Cards> mixedDeck=new ArrayList<Cards>();
    public List<Cards> shuffleFaro(List<Cards> halfOne,List<Cards> halfTwo){
        this.halfOne=halfOne;
        this.halfTwo=halfTwo;
        for (int i=0;i<halfOne.size();i++){
            mixedDeck.add(halfOne.get(i));
            mixedDeck.add(halfTwo.get(i));
        }
        System.out.println("перемешанная Faro Shuffle способом: "+mixedDeck);
return mixedDeck;
    }
}
