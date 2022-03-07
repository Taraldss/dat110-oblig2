package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	private String message;
	private String topic;

	public PublishMsg (String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	
	@Override
	public String toString() {
		return "PublishMsg [message=" + message + ", topic=" + topic + "]";
	}

	public String getMessage() {
		return message;
	}
}
