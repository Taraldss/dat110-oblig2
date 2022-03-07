package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		Client displayClient = new Client("displayDevice", Common.BROKERHOST, Common.BROKERPORT);
		
		// - connect to the broker
		displayClient.connect();
		// - create the temperature topic on the broker
		displayClient.createTopic(Common.TEMPTOPIC);
		// - subscribe to the topic
		displayClient.subscribe(Common.TEMPTOPIC);
		// - receive messages on the topic
		for(int i = 0; i < COUNT; i++) {
			PublishMsg message = (PublishMsg) displayClient.receive();
			System.out.println("Display: " + message.getMessage());
		}
		
		
		// - unsubscribe from the topic
		
		displayClient.unsubscribe(Common.TEMPTOPIC);
		// - disconnect from the broker
		
		displayClient.disconnect();
		
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
//		throw new UnsupportedOperationException(TODO.method());
		
	}
}
