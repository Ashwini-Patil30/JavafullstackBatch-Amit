import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Fruit{

String name;
int calorie;
int price;
String color;

public Fruit(String name, int calorie, int price, String color) {
super();
this.name = name;
this.calorie = calorie;
this.price = price;
this.color = color;
}

@Override
public String toString() {
return "Fruit [name=" + name + ", calorie=" + calorie + ", price=" + price + ", color=" + color + "]";
}



public String getName() {
return name;
}



public int getCalorie() {
return calorie;
}



public int getPrice() {
return price;
}



public String getColor() {
return color;
}

}
public class Streamfruit {



public static void main(String[] args) {

List<Fruit> fruitlist = new ArrayList<Fruit>();
fruitlist.add(new Fruit("apple",11,110,"red"));
fruitlist.add(new Fruit("orange",2,70,"orange"));
fruitlist.add(new Fruit("guava",153,50,"green"));
fruitlist.add(new Fruit("Mango",10,50,"red"));

//descending order of calories
fruitlist.stream()
.sorted((o1,o2)->(o2.getCalorie()-o1.getCalorie()))
.filter(p->p.calorie<100)
.collect(Collectors.toList())
.forEach(p-> System.out.println(p.name));

//displaying color wise
List<String> color = fruitlist.stream()
.sorted((o1,o2) ->(o1.getColor().compareTo(o2.getColor())))
.map(p->p.color)
.collect(Collectors.toList());
System.out.println(color);

//display red color fruit price ascending order
fruitlist.stream()
.filter(p->p.getColor().equals("red"))
.sorted((o1,o2) ->(o1.getColor().compareTo(o2.getColor())))
//.map(p->p.color)
.collect(Collectors.toList())
.forEach(p-> System.out.println(p.name));
}

}
