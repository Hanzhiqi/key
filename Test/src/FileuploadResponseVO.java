
public class FileuploadResponseVO {
	public String cloudStorageNodeId = null;
	public String fileUri = null;
	public String storageUri;
	public String reserved = null;
	
	public String status = Status_OK;
	public String exception_detail = null;

	public static String Status_OK = "ok";
	public static String Status_EXCEPTION = "exception";
	
	public static String EXCEPTION_detail_nocloudstoragenode = "no cloudstoragenode";
}
