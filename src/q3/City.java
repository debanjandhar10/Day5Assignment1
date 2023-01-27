package q3;

import java.util.HashMap;

class CityNotFoundException extends Exception {
	public CityNotFoundException(String message) {
		super(message);
	}
}

public class City {
	HashMap<Integer, String> h;
	City() {
		h = new HashMap<Integer, String>();
		h.put(110057, "c1");
		h.put(3477, "c2");
		h.put(45678, "c3");
		h.put(6778890, "c4");
	}
	public String findCityByZipCode(int zipCode) throws Exception {
		if(!h.containsKey(zipCode))
			throw new CityNotFoundException("City not found");
		return h.get(zipCode);
	}
	public static void main(String[] args) throws Exception {
		City c = new City();
		System.out.println(c.findCityByZipCode(3477));
		try {
			System.out.println(c.findCityByZipCode(11));
		}
		catch (CityNotFoundException e) {
			System.out.println("Caught Error: "+e);
			System.out.println("Error Stack Trace: ");
			e.printStackTrace();
		}
	}
}
