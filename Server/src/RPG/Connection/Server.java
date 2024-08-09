package RPG.Connection;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import RPG.Models.User;
import RPG.Config;
import RPG.Connection.UserSocket;

public class Server {
	
	public ArrayList<UserSocket> users = new ArrayList<UserSocket>();
	public ServerSocket ssket;
	
	public Server() {
		
	}
	
	public void CreateServer() {
		try {
			ssket = new ServerSocket(Config.PORT);
			while (true)
			{
				Socket sk = ssket.accept();
				if (sk != null) {
					UserSocket user = new UserSocket(sk);
					users.add(user);
					user.CreateNewSession();
				}
				System.out.println("uh7tftftrctc");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
