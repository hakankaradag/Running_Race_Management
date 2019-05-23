package trail;
import java.util.*;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.toList;

public class Location {

	String name;
	Integer num;
	List<Delegate> delegate = new LinkedList<> ();
	
    public Location(String name, Integer num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName(){
        return "name";
    }

    public int getOrderNum(){
        return num;
    }

	public void adddelegate(Delegate d) {
		delegate.add(d);
	}

	public List<String> getdelegate() {
		return delegate.stream()
				.sorted(comparing(Delegate::getSurname)
						.thenComparing(Delegate::getName))
				.map(Delegate::toString)
				.collect(toList());
	}
}
