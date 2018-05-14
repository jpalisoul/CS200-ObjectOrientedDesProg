import java.util.Random;

public class Tester {
	
	public static void main(String[] args)
	{
		Hand h = new Hand();
		for(int i = 0; i < 5; i++)
		{
			String newCard;
			newCard = randomCard();
			h.addCard(newCard);
		}
/*		h.addCard("3c");
		h.addCard("4s");
		h.addCard("5d");
		h.addCard("6h");
		h.addCard("7h");*/
		h.printHand();
		h.addCard("8d");
		h.addCard("3d");
		h.removeCard(2);
		h.printHand();
		h.addCard("9s");
		h.addCard("5h");
		h.addCard("As");
		h.addCard("5s");
		h.removeCard("3c");
		h.printHand();	
	}
	
	public static String randomSuit()
	{
		Random gen = new Random();
		int suitRan = gen.nextInt(4);
		String suitLetter = null;
		if (suitRan == 0)
		{
			suitLetter = "c";
		}
		else if(suitRan == 1)
		{
			suitLetter = "d";
		}
		else if (suitRan == 2)
		{
			suitLetter = "h";
		}
		else
		{
			suitLetter = "s";
		}
		return suitLetter;
	}
	
	public static String randomRank()
	{
		Random gen = new Random();
		int rankRan = gen.nextInt(14)+2;
		String rankLetter = null;
		switch (rankRan)
		{
		case 2:
			rankLetter = "2";
			break;
		case 3:
			rankLetter = "3";
			break;
		case 4:
			rankLetter = "4";
			break;
		case 5:
			rankLetter = "5";
			break;
		case 6:
			rankLetter = "6";
			break;
		case 7:
			rankLetter = "7";
			break;
		case 8:
			rankLetter = "8";
			break;
		case 9:
			rankLetter = "9";
			break;
		case 10:
			rankLetter = "10";
			break;
		case 11:
			rankLetter = "J";
			break;
		case 12:
			rankLetter = "Q";
			break;
		case 13:
			rankLetter = "K";
			break;
		case 14:
			rankLetter = "A";
			break;
		}
		return rankLetter;
	}
	
	public static String randomCard()
	{
		String rank = randomRank();
		String suit = randomSuit();
		String card = rank+suit;
		return card;
	}
}



