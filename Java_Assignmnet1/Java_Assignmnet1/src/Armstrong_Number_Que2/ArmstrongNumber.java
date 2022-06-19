package Armstrong_Number_Que2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		   for (int i = 100 ; i <= 1000 ; i++)
           {
                      int j = i;
                      int a = 0;
                      int b = 0;

                      while (j > 0)
                       {
                                   a = j % 10;
                                   b = b + (a * a * a);
                                   j = j / 10;
                       }
                       if (i == b)
                        {
                                   System.out.println(i);
                         }
            }

	}

}
