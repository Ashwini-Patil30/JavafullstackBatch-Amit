package Shapes_Que5;


abstract class Shape {
		abstract void draw();
	}

	class Line extends Shape
	{
		public void draw()
		{
		System.out.println("this is a line");
		}
	}

		class Rectangle extends Shape
		{
			public void draw() 
			{
			System.out.println("this is a Rectangle");
			}
		}
			
		class Cube extends Shape
			{
				public void draw()
				{
				System.out.println("this is a cube");
				}
			}
			
public class ShapeMain
{

	public static void main(String[] args)
	{
		Line l =new Line();
		l.draw();
		Rectangle r =new Rectangle();
		r.draw();
		Cube c =new Cube();
		c.draw();
		
		//2nd way creating instance of derived class to invoke parent class method
		
		/*
		 * Shape s=new Cube(); s.draw();
		 */
	}

}
