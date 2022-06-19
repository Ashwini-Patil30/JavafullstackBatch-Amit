import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Transaction{
String trader;
int year;
int value;

public Transaction(String trader, int year, int value) {
super();
this.trader = trader;
this.year = year;
this.value = value;
}

@Override
public String toString() {
return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
}

public String getTrader() {
return trader;
}

public int getYear() {
return year;
}

public int getValue() {
return value;
}

}
public class Streamtransaction {

public static void main(String[] args) {

List<Transaction> transactions = new ArrayList<Transaction>();
transactions.add(new Transaction("jute",2000,210));
transactions.add(new Transaction("Cotton",1990,202));
transactions.add(new Transaction("Copper",2011,203));
transactions.add(new Transaction("Iron",2019,201));
transactions.add(new Transaction("Steel",2011,220));

//transactions in 2011
List<String> trans = transactions.stream()
.filter(p->p.year == 2011)
.sorted((o1,o2)->(o1.getValue()-o2.getValue()))
.map(p->p.toString())
.collect(Collectors.toList());
System.out.println(trans);

//all transactions
List<String> trans1 =transactions.stream()
.map(p->p.toString())
.collect(Collectors.toList());
System.out.println(trans1);

//highest transaction value

Optional<Object> highest =transactions.stream()
.max(Comparator.comparing(Transaction::getValue))
.map(p->p.value);
System.out.println(highest);

//lowest transaction value
Optional<Object> lowest =transactions.stream()
.min(Comparator.comparing(Transaction::getValue))
.map(p->p.value);
System.out.println(lowest);
}



}
