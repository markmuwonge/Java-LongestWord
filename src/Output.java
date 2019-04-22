
public class Output {
	
	public void longestWord(String msg)
	{
		String longestWord = "";
		int longestWordLength = 0;
		
		String currentWord = "";
		
		boolean multipleLongestWords = false;
		
		if (!(msg.substring(msg.length() -1, msg.length()).equals(" "))) //spaces needed to detect end of word
		{
			msg = msg + " "; //add space to the end of msg
		}
		
		for (int x = 0; x < msg.length(); x++)
		{
			if (msg.substring(x, x + 1).equals(" ")) //space detected (end of word)
			{
				if (currentWord.length() > longestWordLength) //if built word is longer than the current longest word
				{
					longestWord = currentWord;
					longestWordLength = currentWord.length();
					
					currentWord = "";
				}
				else if (currentWord.length() == longestWordLength)
				{
					longestWord = longestWord + ", " + currentWord;
					currentWord = "";
				}
				else
				{
					currentWord = ""; //reset current word
				}		
			}
			else if (!(msg.substring(x, x + 1).equals(","))) //dont count comma as word
			{
				currentWord = currentWord + msg.substring(x, x + 1); //build a word
				
			}
		}
		
		for (int x = 0; x < longestWord.length(); x++)
		{
			if (longestWord.substring(x, x + 1).equals(","))
			{
				multipleLongestWords = true;
			}
		}
		
		if (multipleLongestWords == true)
		{
			System.out.println("'"+longestWord+"'" + " are the longest words with " + longestWordLength + " characters" );
		}
		else
		{
			System.out.println("'"+longestWord+"'" + " is the longest word with " + longestWordLength + " characters" );
		}
		
	
	}

}
