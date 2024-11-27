package com.kp.design.patterns.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException {
		Subject ch = new Channel();
		Observer s1 = new Subscriber("user1");
		Observer s2 = new Subscriber("user2");
		ch.subscribe(s2);
		ch.subscribe(s1);
//		ch.notifyChanges("Tutorial on Java");
//		ch.notifyChanges("Tutorial on JS");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to upload video");
			System.out.println("Press 2 to create new subscriber");
			System.out.println("Press 3 to unsubscribe user");
			System.out.println("Press 4 to exit");
			int ip = Integer.parseInt(br.readLine());
			if(1 == ip) {
				System.out.println("Enter video title : ");
				String title = br.readLine();
				ch.notifyChanges(title);
				
			} else if(2 == ip) {
				System.out.println("Enter subscriber name : ");
				String userNm = br.readLine();
				Observer user = new Subscriber(userNm);
				ch.subscribe(user);
			}  else if(3 == ip) {
				System.out.println("Enter subscriber name : ");
				String userNm = br.readLine();
				Subscriber user = new Subscriber(userNm);
				ch.unSubscribe(user);
			} else {
				System.out.println("Bye!");
			}
		}
	}
}
