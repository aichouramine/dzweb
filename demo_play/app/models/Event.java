package models;

public class Event {

	private String name;
	private int attendes;

	public Event() {
	}

	public Event(String name, int attendes) {
		super();
		this.name = name;
		this.attendes = attendes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttendes() {
		return attendes;
	}

	public void setAttendes(int attendes) {
		this.attendes = attendes;
	}

}
