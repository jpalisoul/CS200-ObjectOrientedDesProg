
public class Card {

	private String suit, rank;

	
	public Card(String suit, String rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public static String getSuit(int input)
	{
		String suit = "";
		suit = Suit.num2suit(input);
		return suit;
	}
	
	public static String getRank(int input)
	{
		String rank = "";
		rank = Rank.num2rank(input);
		return rank;
	}
	
	public static String getName(String suit, String rank)
	{
		String getNameOutput = "";
		
		String first = "";
		first = suit.substring(0, 1);
		
		String rest = "";
		rest = suit.substring(1);
		rest = rest.toLowerCase();
		
		String suitOut = first+rest;
		
		switch(rank)
		{
		case "NONE":
			getNameOutput = "EMPTY";
			break;
		case "LOWACE":
			getNameOutput = "Ace of " + suitOut + "s";
			break;
		case "_2":
			getNameOutput = "Two of " + suitOut + "s";
			break;
		case "_3":
			getNameOutput = "Three of " + suitOut + "s";
			break;
		case "_4":
			getNameOutput = "Four of " + suitOut + "s";
			break;
		case "_5":
			getNameOutput = "Five of " + suitOut + "s";
			break;
		case "_6":
			getNameOutput = "Six of " + suitOut + "s";
			break;
		case "_7":
			getNameOutput = "Seven of " + suitOut + "s";
			break;
		case "_8":
			getNameOutput = "Eight of " + suitOut + "s";
			break;
		case "_9":
			getNameOutput = "Nine of " + suitOut + "s";
			break;
		case "_10":
			getNameOutput = "Ten of " + suitOut + "s";
			break;
		case "JACK":
			getNameOutput = "Jack of " + suitOut + "s";
			break;
		case "QUEEN":
			getNameOutput = "Queen of " + suitOut + "s";
			break;
		case "KING":
			getNameOutput = "King of " + suitOut + "s";
			break;
		case "ACE":
			getNameOutput = "Ace of " + suitOut + "s";
			break;
		}
		return getNameOutput;
	}
	public static String getAbbrev(String suit, String rank)
	{
		String getAbbrevOutput = "";
		
		String suitOut = "";
		suitOut = suit.substring(0, 1);
		suitOut = suitOut.toLowerCase();
		
		switch(rank)
		{	
		case "NONE":
			getAbbrevOutput = "EMPTY";
			break;
		case "LOWACE":
			getAbbrevOutput = "A" + suitOut;
			break;
		case "_2":
			getAbbrevOutput = "2" + suitOut;
			break;
		case "_3":
			getAbbrevOutput = "3" + suitOut;
			break;
		case "_4":
			getAbbrevOutput = "4" + suitOut;
			break;
		case "_5":
			getAbbrevOutput = "5" + suitOut;
			break;
		case "_6":
			getAbbrevOutput = "6" + suitOut;
			break;
		case "_7":
			getAbbrevOutput = "7" + suitOut;
			break;
		case "_8":
			getAbbrevOutput = "8" + suitOut;
			break;
		case "_9":
			getAbbrevOutput = "9" + suitOut;
			break;
		case "_10":
			getAbbrevOutput = "10" + suitOut;
			break;
		case "JACK":
			getAbbrevOutput = "J" + suitOut;
			break;
		case "QUEEN":
			getAbbrevOutput = "Q" + suitOut;
			break;
		case "KING":
			getAbbrevOutput = "K" + suitOut;
			break;
		case "ACE":
			getAbbrevOutput = "A" + suitOut;
			break;
		}
		return getAbbrevOutput;
	}
	public static void printCard(String suit, String rank)
	{
		String abbrev, name;
		
		abbrev = getAbbrev(suit, rank);
		name = getName(suit, rank);
		
		System.out.println("Name: "+name+ " / Rank: "+abbrev);
	}
}
