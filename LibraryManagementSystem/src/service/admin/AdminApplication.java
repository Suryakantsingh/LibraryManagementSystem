package service.admin;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("rest")

public class AdminApplication extends Application {
	private Set<Object> singleton = new HashSet();
	
	public AdminApplication(){
		singleton.add(new AdminService());
	}
	
	public Set<Object> getSingleton(){
		return singleton;
	}

}
