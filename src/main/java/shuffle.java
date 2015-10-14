/**
 * TESTFÖRPUSH
 */

import java.util.LinkedList;
import java.util.List;

public class shuffle {
	public static void main(String[] args) {

		List<Integer> ints = new LinkedList<Integer>();
		for(int i = 1; i < 53; i++) { // Tillfällig LinkList
			ints.add(i);
		}
		//shuffleCards(ints); //Blandar korten
		List<Integer> playerHand = new LinkedList<Integer>(); //Spelarens hand
		drawCards(ints,playerHand, 2); //Dra kort
		System.out.println("Playerhand: "); // Skriver ut spelarhand
		for (int is : playerHand) {
			System.out.printf("%d ", is);
		}
		System.out.println();
		for (int is : ints) { // Skriver ut resterande kort
			System.out.printf("%d ", is);
		}
			System.out.println();
}
	static List<Integer> shuffleCards(List<Integer> cardList) { //Statisk för den ligger i samma fil som static main
		for (int lol = 0; lol < cardList.size(); lol++) {
			int troll = (int)(Math.random() * cardList.size()); //Slumpar ett index av storleken på arrayen
			Integer temporaryValueOfCurrentCard = new Integer((cardList.get(troll))); //Sparar ner värdet som finns i indexet
			cardList.remove(troll); //Tar bort indexet
			troll = (int)(Math.random() * cardList.size()); //Slumpar ny plats
			cardList.add(troll, temporaryValueOfCurrentCard); //Lägger till värdet på samma index
		}
		return cardList;

	}
	static List<Integer> drawCards(List<Integer> deck,List<Integer> cards, int howManyCards) {
		shuffleCards(deck);
		for(int boll = 0; boll < howManyCards; boll++) {
			Integer temporaryValueOfCurrentCard = new Integer((deck.get(0))); // Sparar det översta kortet i en temporär variabel
			cards.add(0, temporaryValueOfCurrentCard); // Kopierar det översta kortet och lägger det på rätt plats
			deck.remove(0); //Tar bort det översta kortet från kortleken
		}
		return cards;
	}
}