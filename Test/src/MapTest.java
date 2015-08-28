import java.util.HashMap;
import java.util.Map;


public class MapTest {
	public static void main(String[] args){
//		Map map = new HashMap<String,String>();
//		map.put("1", "2");
//		System.out.println(map);
		
		long currentTime = System.currentTimeMillis();
		String orderId = "oilCardOrder"+Long.toString(currentTime);
		 System.out.println(orderId);
	}
}
