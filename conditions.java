public class conditions
{
 	public static void main(String[] args)
	{
  		for (int j = 0; j < 2; j++)
  		{
   			for (int k = 0; k < 10; k++)
   			{
    			System.out.print(j + "" + k);
    			if (k == 5)
    			{
     				break;//Takes out of loop using k
    			}
   			}
  		}

  		System.out.println("");

  		outer: //using labels to break out of the outer loop
  			for(int j = 0; j < 2; j++)
  			{
				for(int k = 0; k < 10; k++)
				{
					System.out.print(j + "" + k);
					if(k == 5)
					{
						break outer;//Takes out of loop using j
					}
				}
			}

		System.out.println("");
 	}
}