/*
* Create a base class called `Shape`. It should containt 2 methods `getcoord()` and `showcorrd()` to accept X and Y coordinates and to display the same respectively. Create a subclass called Rect. it should also contain a method to display the length and breadth of the rectangle called `showCorrd()`. In main method, execute `showCorrd()` method of Rect class by applying the dynamic method dispatch concept.
*/
import java.util.Scanner;
// Shape Class
class Shape{
protected int coord[]=new int[4];
protected int tos;
Shape()
{
	tos=-1;
}
protected void getCoord()
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Corrd of (x,y) : ");
	coord[++tos]=sc.nextInt();
	coord[++tos]=sc.nextInt();
}
void showcoord()
{
	System.out.print("Coord of Diagonal is ");
	for(int i=0;i<coord.length;i++)
	{
		if(i%2==0)
		{
			System.out.print("( "+coord[i]);
		}
		else
		{
			System.out.print(coord[i]+" )");
		}
	}
}
}
class Rectangle extends Shape{
	private int length;
	private int breadth;
	Rectangle(){
		super();
	}
	void showCorrd()
	{
		System.out.println("Enter the Diagonal-Coordinates of Rectangle: ");
		getCoord();
		getCoord();
		length=coord[0]-coord[2];
		breadth=coord[1]-coord[3];
		if(length<0)
		{
			length*=-1;
		}
		if(breadth<0)
		{
			breadth*=-1;
		}
		System.out.println("Length of Rectangle is : "+ length+"and  Breadth is : "+breadth);
	}
}
class ShapeDemo
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.showCorrd();
	}
}