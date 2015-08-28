
public class SplitTest {
	public static void main(String args[]){
		String s = "a,b,c,d,e,f,g";
		String[] a = s.split(",");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
