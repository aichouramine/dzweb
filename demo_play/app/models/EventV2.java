package models;

public class EventV2 {

	private String event;
	private String track;
	private String talk;
	private String schedule;

	public EventV2(String event, String track, String talk, String schedule) {
		super();
		this.event = event;
		this.track = track;
		this.talk = talk;
		this.schedule = schedule;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getTalk() {
		return talk;
	}

	public void setTalk(String talk) {
		this.talk = talk;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

}
