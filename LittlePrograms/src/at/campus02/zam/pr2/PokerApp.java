package at.campus02.zam.pr2;

public class PokerApp {
    public static void main(String[] args) {
        PokerCardValue v1, v2; // with null initialized

        v1 = PokerCardValue.EIGHT; // we do not need new here - no new object created
        v2 = PokerCardValue.QUEEN;

        if(v1 != v2){
            System.out.println("different cards");
        }
        if(v1 == PokerCardValue.EIGHT){
            System.out.println("is same");
        }
        switch(v1){
            case ONE:
                System.out.println("one");
                break;
            case TWO:
                System.out.println("two");
                break;
            case EIGHT:
                System.out.println("eight");
                System.out.println(v1);
                break;
            default:
                System.out.println("all other");
        }

        PokerCard card = new PokerCard(PokerCardValue.FIVE, PokerCardColour.HEART);

        for(PokerCardColour c : PokerCardColour.values())
        {
            System.out.println(c);
        }

    }
}
