
public class Rank
{
	int NONE = 0;
	int LOWACE = 1;
	int _2 = 2;
	int _3 = 3;
	int _4 = 4;
	int _5 = 5;
	int _6 = 6;
	int _7 = 7;
	int _8 = 8;
	int _9 = 9;
	int _10 = 10;
	int JACK = 11;
	int QUEEN = 12;
	int KING = 13;
	int ACE = 14;
	
	public static String num2rank(int input)
	{
		String Rank = "";
		switch (input)
		{
		case 0: 
			Rank = "NONE";
			break;
		case 1:
			Rank = "LOWACE";
			break;
		case 2:
			Rank = "_2";
			break;
		case 3:
			Rank = "_3";
			break;
		case 4:
			Rank = "_4";
			break;
		case 5:
			Rank = "_5";
			break;
		case 6:
			Rank = "_6";
			break;
		case 7:
			Rank = "_7";
			break;
		case 8:
			Rank = "_8";
			break;
		case 9:
			Rank = "_9";
			break;
		case 10:
			Rank = "_10";
			break;
		case 11:
			Rank = "JACK";
			break;
		case 12:
			Rank = "QUEEN";
			break;
		case 13:
			Rank = "KING";
			break;
		case 14:
			Rank = "ACE";
			break;
		}
		return Rank;
	}
	
	public static int string2rank(String input)
	{
		int Rank = 0;
		switch (input)
		{
		case "2":
			Rank = 2;
			break;
		case "3":
			Rank = 3;
			break;
		case "4":
			Rank = 4;
			break;
		case "5":
			Rank = 5;
			break;
		case "6":
			Rank = 6;
			break;
		case "7":
			Rank = 7;
			break;
		case "8":
			Rank = 8;
			break;
		case "9":
			Rank = 9;
			break;
		case "10":
			Rank = 10;
			break;
		case "J":
			Rank = 11;
			break;
		case "Q":
			Rank = 12;
			break;
		case "K":
			Rank = 13;
			break;
		case "A":
			Rank = 14;
			break;
		}
		return Rank;
	}
}
