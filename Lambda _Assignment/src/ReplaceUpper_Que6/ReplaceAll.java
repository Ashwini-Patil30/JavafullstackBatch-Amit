package ReplaceUpper_Que6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class ReplaceAll {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ArrayList<String> words = new ArrayList<>(Arrays.asList("ashu","priyu","ruchi","new"));
		System.out.println("original array : "+words);
		words.replaceAll(new MyOperator());
		System.out.println("uppercase array : "+words);
}
}
class MyOperator implements UnaryOperator<String>
{

	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return t.toUpperCase(); 
	}
}
