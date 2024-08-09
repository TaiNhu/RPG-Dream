package RPG.Models;

import java.net.Socket;
import java.util.UUID;

public class User {
	public Socket sk1;
	public Thread th;
	public String id; 
	
	public User (Socket sk1) {
		this.sk1 = sk1;
		this.id = UUID.randomUUID().toString();
	}
	
	public void setThread(Thread th) {
		this.th = th;
	}
}
