package RPG.Connection;

import java.net.Socket;
import java.util.ArrayList;
import RPG.Models.User;
import java.lang.Thread;
import java.util.UUID;

public class UserSocket {
	public User us;

	public UserSocket(Socket sk) {
		this.us = new User(sk);
	}

	public void CreateNewSession() {
		this.us.setThread(new Thread() {
			@Override
			public void run() {
				while (true)
				{
					
				}
			}
		});
		this.us.th.start();
	}
	
}
