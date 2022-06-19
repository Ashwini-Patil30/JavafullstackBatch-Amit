package OddLength_Que4;

import java.util.ArrayList;
import java.util.Arrays;

public class Oddlength {
	
	interface StringLength{
		int getLength(String str);
	}
	
		public static void main(String[] args) {
			ArrayList<String> strl=new ArrayList<>(Arrays.asList("Ashu","ruchi","New","priyal"));
			strl.removeIf((String str)->str.length()%2==1);
			System.out.println(strl);
		}

}
