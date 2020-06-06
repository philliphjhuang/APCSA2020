package FinalProject;

public class Location {
	
	public int x;
	public int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Location location) {
		if(x == location.x && y == location.y) {
			return true;
		}
		return false;
	}
	
}
