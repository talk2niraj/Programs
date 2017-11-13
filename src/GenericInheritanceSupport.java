import java.util.HashMap;
import java.util.Map;

public class GenericInheritanceSupport {

	public static void main(String[] args) {
		Map<? extends Person, String> map;
		map = new HashMap();
//		map.put(new SpecialPerson(), "Special");
		
	}
	
	class Person {
		
	}
	
	class SpecialPerson extends Person {
		
	}
}
