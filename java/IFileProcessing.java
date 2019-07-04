import java.util.Map;

public interface IFileProcessing{
	
	public String addKey(String key,String value);
	
	public String removeKey(String key);
	
	public String getKey(String key);
	
	public Map<String,String> getMap();
}