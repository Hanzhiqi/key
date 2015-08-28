import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;


public class Upload {
	public static void main(String[] args){
		
		
		JSONObject json = new JSONObject();
		json = JSONObject.fromObject(frTest());
		
		System.out.println(json);
	}
	
	
	public static FileuploadResponseVO frTest(){
		FileuploadResponseVO fr = new FileuploadResponseVO();
		fr.fileUri = "fileUri";
		fr.cloudStorageNodeId = "cloudStorageNodeId";
		fr.storageUri = "storageUri";
		return fr;
	}
}
