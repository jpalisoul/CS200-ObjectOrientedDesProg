
public class Suit
{
	private static int CLUB = 0, DIAMOND = 1, HEART = 2, SPADE = 3;
	
	public static String num2suit(int input)
	{	
		String Suit = "";
		switch (input)
		{
		case 0:
			Suit = "CLUB";
			break;
		case 1:
			Suit = "DIAMOND";
			break;
		case 2:
			Suit = "HEART";
			break;
		case 3:
			Suit = "SPADE";
			break;
		}
		return Suit;
	}
	
	public static int string2Num(String input)
	{
		int Suit = 0;
		switch (input)
		{
		case "c":
			Suit = 0;
			break;
		case "d":
			Suit = 1;
			break;
		case "h":
			Suit = 2;
			break;
		case "s":
			Suit = 3;
			break;
		}
		return Suit;
	}
}
