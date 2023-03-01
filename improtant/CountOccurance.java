package improtant;

public class CountOccurance
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		String text = "$$hari090 600@gmail .com";
		char[] charArray = text.toCharArray();
		
		int letter = 0;
		int number = 0;
		int splchar= 0;
		int space  = 0;
		
		for (int i = 0; i <charArray.length; i++)
		{
			if (Character.isLetter(charArray[i]))
			{
				letter++;
				System.out.println(charArray[i]);
			}
			else
				if (Character.isDigit(charArray[i]))
				{
					number++;
					System.out.println(charArray[i]);
				}
				else
				{
					splchar++;
					System.out.println(charArray[i]);
				}
			if (Character.isSpace(charArray[i]))
			{
				space++;
				System.out.println(charArray[i]);
			}
			System.out.println(letter);
			System.out.println(number);
			System.out.println(splchar);
			System.out.println(space);	
		}
		
	}

}
