package FinalProject;

import java.awt.Color;
import java.awt.Graphics;

public class SnakeBody {
	private Location location;
	private int size;

	public SnakeBody(Location loc, int size) {
		this.location = loc;
		this.size = size;
	}
	
	public void setLocation(Location loc) {
		this.location = loc;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void drawHead(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(location.x * size, location.y * size, size, size);;
	}
	
	public void drawBody(Graphics g) {
		g.setColor(Snake.SNAKE_COLOR);
		g.drawRect(location.x * size, location.y * size, size, size);
	}
}
