package trail;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import  static java.util.Comparator.*;


public class Trail {
	
	int pet=0;
	private Map<Integer,Runner> runners = new TreeMap<> ();
	private Map<String,Location> locations = new TreeMap<> ();
	private Map<String,Delegate> delegates = new TreeMap <>();

    public int newRunner(String name, String surname,int num){
    	Runner r = new Runner(name,surname,pet++);
    	runners.put(pet, r);
        return pet;
    }
    
    public Runner getRunner(int bibNumber){
        return runners.get(bibNumber);
    }
    
    public Collection<Runner> getRunner(String surname){
    	
    			 return runners.values().stream()
    	    		.filter( r -> r.getSurname().equals(surname))
    	    		.collect(toList());
    }
    
    public List<Runner> getRunners(){
        return runners.values().stream().collect(toList());
    }

    public List<Runner> getRunnersByName(){
    	  return runners.values().stream()
    			  .sorted(comparing(Runner::getName)
    					  .thenComparing(Runner::getSurname))
    					  .collect(toList());

    
    }
    
    public void addLocation(String location){
        Location l = new Location(location,locations.size());
        locations.put(location, l);
        
    }

    public Location getLocation(String location){
        return locations.get(location);
    }

    public List<Location> getPath(){
      return locations.values().stream().collect(toList());
    }
    
    public void newDelegate(String name, String surname, String id){
    	Delegate d = new Delegate(name,surname,id);
    	delegates.put(id, d);
    }

    public List<String> getDelegates(){
        return delegates.values().stream()
        		.sorted(comparing(Delegate::getSurname)
        				.thenComparing(Delegate::getName))
        				.map(Delegate::to)
        				.collect(toList());
    }
    

    public void assignDelegate(String location, String delegate) throws TrailException {
    	Delegate d = delegates.get(delegate);
    	Location l = locations.get(location);
    	
    	if (l==null || d==null) throw new TrailException();
    	
    	l.adddelegate(d);
    	
    }
 
    public List<String> getDelegates(String location){
        return null;
    }
    
    public long recordPassage(String delegate, String location, int bibNumber) throws TrailException {
        return -1;
    }
    
    public long getPassTime(String position, int bibNumber) throws TrailException {
        return -1;
    }
    
    public List<Runner> getRanking(String location){
        return null;
    }

    public List<Runner> getRanking(){
        return null;
    }
}
