package FinalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeBody head;
	private ArrayList<SnakeBody> snake;

	private Direction currentDirection;

	private boolean canMove = true;
		
	public Snake(Location location) {
		snake = new ArrayList<SnakeBody>();
		head = new SnakeBody(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		snake.add(new SnakeBody(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		return head.getLocation();
	}

	public void update() {
		Location l;
		switch (currentDirection) {
		case UP:
			l = new Location(head.getLocation().x, head.getLocation().y - 1);
			break;
		case DOWN:
			l = new Location(head.getLocation().x, head.getLocation().y + 1);
			break;
		case RIGHT:
			l = new Location(head.getLocation().x + 1, head.getLocation().y);
			break;
		case LEFT:
			l = new Location(head.getLocation().x - 1, head.getLocation().y);
			break;
		default:
			l = new Location(head.getLocation().x, head.getLocation().y);
			break;
		}

		for (int i = snake.size() - 1; i >= 1; i--) {
			snake.get(i).setLocation(snake.get(i - 1).getLocation());
		}

		head.setLocation(l);

		canMove = true;
		
		isOutOfBounds();
	}

	public void setDirection(Direction d) {
		if (canMove = true) {
			if (currentDirection != Direction.RIGHT && d == Direction.LEFT) {
				currentDirection = d;
			}
			if (currentDirection != Direction.UP && d == Direction.DOWN) {
				currentDirection = d;
			}
			if (currentDirection != Direction.LEFT && d == Direction.RIGHT) {
				currentDirection = d;
			}
			if (currentDirection != Direction.DOWN && d == Direction.UP) {
				currentDirection = d;
			}
		}
		canMove = false;
	}

	public void reset(Location loc) {
		snake.clear();
		head.setLocation(loc);
		snake.add(head);
	}

	public void isOutOfBounds() {
		if(head.getLocation().x > 14) {
			Location outOfBoundsToTheRight = new Location(0, head.getLocation().y);
			head.setLocation(outOfBoundsToTheRight);
		}
		if(head.getLocation().x < 0) {
			Location outOfBoundsToTheLeft = new Location(14, head.getLocation().y);
			head.setLocation(outOfBoundsToTheLeft);
		}
		if(head.getLocation().y > 11) {
			Location outOfBoundsToTheBot = new Location(head.getLocation().x, 0);
			head.setLocation(outOfBoundsToTheBot);
		}
		if(head.getLocation().y < 0) {
			Location outOfBoundsToTheTop = new Location(head.getLocation().x, 11);
			head.setLocation(outOfBoundsToTheTop);
		}
	}

	public boolean isHeadCollidingWithBody() {
		for (int i = snake.size() - 1; i > 0; i--) {
			if (snake.get(i).getLocation().equals(head.getLocation())) {
				return true;
			}
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		for (int i = snake.size() - 1; i >= 0; i--) {
			if (loc.equals(snake.get(i).getLocation())) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (int i = 0; i < snake.size(); i++) {
			if(i == 0) {
				snake.get(i).drawHead(g);			
			} else {
				snake.get(i).drawBody(g);
			}
		}
	}
}
