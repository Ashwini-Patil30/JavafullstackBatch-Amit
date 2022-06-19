
public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("StringBuffer ");
		buffer.append(" is a peer class of string"+"that provides much of"+"functionality of strings.");
		System.out.println(buffer);
		StringBuffer buffer1 = new StringBuffer("It is used to at the specified index position");
		buffer1.insert(14, "insert text ");
		System.out.println(buffer1);
		StringBuffer buffer2 = new StringBuffer("This method returns the reversed object on which it was called");
		buffer2.reverse();
		System.out.println("String buffer after reversing = " + buffer2);
		}



}
