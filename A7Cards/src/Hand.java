import java.util.ArrayList;

public class Hand 
{
	static ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand(){
		ArrayList<Card> array = new ArrayList<Card>();
		this.cards = array;
	}
	
	/*public Hand(ArrayList<Card> array)
	{
		this.cards = array;
	}*/
	
	public static void addCard(String input)
	{
		char suitAbbrev;
		char rankAbbrev;
		
		String suitStringAbbrev = "";
		String rankStringAbbrev = "";
		
		if(input.length() < 3)
		{
			rankAbbrev = input.charAt(0);
			rankStringAbbrev = Character.toString(rankAbbrev);
			rankStringAbbrev = rankStringAbbrev.toUpperCase();
			
			suitAbbrev = input.charAt(1);
			suitStringAbbrev = Character.toString(suitAbbrev);
			suitStringAbbrev = suitStringAbbrev.toLowerCase();
		}
		else
		{
			char rankAbbrev2;
			rankAbbrev = input.charAt(0);
			rankAbbrev2 = input.charAt(1);
			rankStringAbbrev = Character.toString(rankAbbrev);
			rankStringAbbrev += Character.toString(rankAbbrev2);
			rankStringAbbrev = rankStringAbbrev.toUpperCase();
			
			suitAbbrev = input.charAt(2);
			suitStringAbbrev = Character.toString(suitAbbrev);
			suitStringAbbrev = suitStringAbbrev.toLowerCase();
		}
		
		int SuitNum, RankNum;
		
		SuitNum = Suit.string2Num(suitStringAbbrev);
		RankNum = Rank.string2rank(rankStringAbbrev);
		
		String suit, rank, name, abbrev;
		
		suit = Card.getSuit(SuitNum);
		rank = Card.getRank(RankNum);
		
		//print statement for the testing of assignment 7
		name = Card.getName(suit, rank);
		abbrev = Card.getAbbrev(suit, rank);
		System.out.println("Adding Card:    "+name+"  ("+abbrev+")");
		
		Card card = new Card(suit, rank);
		cards.add(card);
	}
	
	public static void removeCard(String input)
	{
		String suit, rank, abbrev, name;
		for (int i = 0; i<cards.size(); i++)
		{
			suit = cards.get(i).getSuit();
			rank = cards.get(i).getRank();
			abbrev = cards.get(i).getAbbrev(suit, rank);
			name  = cards.get(i).getName(suit, rank);
			if(input.contains(abbrev))
			{
				System.out.println("Removing Card:  " + name + "  (" + abbrev + ", at index " + i + ")");
				cards.remove(i);
				break;
			}
		}
	}
	public static void removeCard(int input)
	{
		String suit, rank, abbrev, name;
		for(int i=0; i<cards.size(); i++)
		{
			cards.get(i);
			if(input == i)
			{
				//the next lines are for printing information.
				suit = cards.get(i).getSuit();
				rank = cards.get(i).getRank();
				abbrev = cards.get(i).getAbbrev(suit, rank);
				name = cards.get(i).getName(suit, rank);
				System.out.println("Removing Card:  Index " + input + ", " + name + " (" + abbrev + ")");
				//end of gathering print information
				cards.remove(i);
				break;
			}
		}
	}
	public static void printHand()
	{
		String rank, suit, abbrev, print = "", name;
		int counter = 0;
		//getting the print for the Printing hand statement
		for(int i=0; i<cards.size(); i++)
		{
			rank = cards.get(i).getRank();
			suit = cards.get(i).getSuit();
			abbrev = Card.getAbbrev(suit, rank);
			print += abbrev + "  ";
			counter++;
		}
		System.out.println("Printing Hand:  " + counter + " cards  -  " + print);
		for(int i=0; i<cards.size(); i++)
		{
			rank = cards.get(i).getRank();
			suit = cards.get(i).getSuit();
			name = Card.getName(suit, rank);
			System.out.println("                    "+name);
		}
	}
	
	public static void gameStats()
	{
		
	}
}
