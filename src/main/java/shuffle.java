/**
 * TESTF�RPUSH
 */

import java.util.LinkedList;
import java.util.List;

public class shuffle {
	public static void main(String[] args) {

		List<Integer> ints = new LinkedList<Integer>();
		for(int i = 1; i < 53; i++) { // Tillf�llig LinkList
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
	static List<Integer> shuffleCards(List<Integer> cardList) { //Statisk f�r den ligger i samma fil som static main
		for (int lol = 0; lol < cardList.size(); lol++) {
			int troll = (int)(Math.random() * cardList.size()); //Slumpar ett index av storleken p� arrayen
			Integer temporaryValueOfCurrentCard = new Integer((cardList.get(troll))); //Sparar ner v�rdet som finns i indexet
			cardList.remove(troll); //Tar bort indexet
			troll = (int)(Math.random() * cardList.size()); //Slumpar ny plats
			cardList.add(troll, temporaryValueOfCurrentCard); //L�gger till v�rdet p� samma index
		}
		return cardList;

	}
	static List<Integer> drawCards(List<Integer> deck,List<Integer> cards, int howManyCards) {
		shuffleCards(deck);
		for(int boll = 0; boll < howManyCards; boll++) {
			Integer temporaryValueOfCurrentCard = new Integer((deck.get(0))); // Sparar det �versta kortet i en tempor�r variabel
			cards.add(0, temporaryValueOfCurrentCard); // Kopierar det �versta kortet och l�gger det p� r�tt plats
			deck.remove(0); //Tar bort det �versta kortet fr�n kortleken
		}
		return cards;
	}
}