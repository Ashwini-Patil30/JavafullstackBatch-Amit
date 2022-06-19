import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Trader
{
String name;
String city;

public Trader(String name, String city) {
super();
this.name = name;
this.city = city;
}

@Override
public String toString() {
return "Trader [name=" + name + ", city=" + city + "]";
}
public String getName() {
return name;
}
public String getCity() {
return city;
}

}

public class Streamtrader {
	
public static void main(String[] args) {

List<Trader> trader = new ArrayList<Trader>();
trader.add(new Trader("jute","vadodara"));
trader.add(new Trader("cotton","pune"));
trader.add(new Trader("textiles","bangalore"));
trader.add(new Trader("marble","indore"));
trader.add(new Trader("iron","delhi"));
trader.add(new Trader("steel","pune"));

//all cities
List<String> city=trader.stream()
.sorted((o1,o2) ->(o1.getCity().compareTo(o2.getCity())))
.map(p->p.city)
.collect(Collectors.toList());
System.out.println(city);

//all traders from pune
List<String> tradercity=trader.stream()
.filter(p->p.getCity().equals("pune"))
.map(p->p.toString())
.collect(Collectors.toList());
System.out.println(tradercity);

//all traders with names sorted
List<String> tradername=trader.stream()
.sorted((o1,o2) ->(o1.getName().compareTo(o2.getName())))
.map(p->p.toString())
.collect(Collectors.toList());
System.out.println(tradername);


//any trader in indore
List<String> tradorcity=trader.stream()
.filter(p->p.getCity().equals("indore"))
.map(p->p.toString())
.collect(Collectors.toList());
System.out.println(tradorcity);

// trader in delhi
List<String> tradorcity1=trader.stream()
.filter(p->p.getCity().equals("delhi"))
.map(p->p.toString())
.collect(Collectors.toList());
System.out.println(tradorcity1);


}

}


