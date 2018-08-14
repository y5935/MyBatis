package cn.hl.vo;

public class ClassRoom {
	private int roomId;
	private String roomName;
	private String description;
	private int state;
	
	public ClassRoom() {
	}

	public ClassRoom(int roomId, String roomName, String description, int state) {
		this.roomId = roomId;
		this.roomName = roomName;
		this.description = description;
		this.state = state;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "ClassRoom [roomId=" + roomId + ", roomName=" + roomName
				+ ", description=" + description + ", state=" + state + "]";
	}
}
