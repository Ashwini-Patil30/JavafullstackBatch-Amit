package FirstLetter_Que5;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class FirstLetter {
	public static void main(String[] args)
	{
	String[] strArray = { "Ashu", "priyu", "new", "pranav", "lalit", "ruchi" };
	System.out.println(Arrays.stream(strArray).filter(Objects::nonNull).
	map(s->s.charAt(0)).collect(Collectors.toList()));
	}
}

