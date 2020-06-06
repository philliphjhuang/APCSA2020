package FinalProject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakeGame implements ActionListener, KeyListener {
	public static final int WIDTH = 15;
	public static final int HEIGHT = 12;
	public static final int WINDOW_SCALE = 50;
	public static final int WINDOW_WIDTH = WINDOW_SCALE * WIDTH;
	public static final int WINDOW_HEIGHT = WINDOW_SCALE * HEIGHT;

	private JFrame window;
	private JPanel panel;

	private Snake snake;

	private Timer timer;

	private int numOfApplesEaten = -1;
	
	private Location appleLocation;
	
	private BufferedImage apple;
	public SnakeGame() {
		snake = new Snake(new Location(WIDTH / 2, HEIGHT / 2));

		window = new JFrame("Snake");
		panel = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;

				g2.setColor(Color.BLACK);
				g2.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

				try {
				    apple = ImageIO.read(new File("apple.png"));
				} catch (IOException e) {
					System.out.println("Can't load image");
				}
				g2.drawImage(apple, appleLocation.x * WINDOW_SCALE, appleLocation.y * WINDOW_SCALE, Snake.BODY_SIZE, Snake.BODY_SIZE, panel);
				snake.draw(g);
			}
		};

		panel.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		window.add(panel);

		timer = new Timer(0, this);

		window.pack();
		window.addKeyListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

		setAppleLocation();

		startGame();
	}

	public void startGame() {
		String instructions = "Snake Game\n\nby Phillip Huang\n\nThe player controls the snake by moving up, down, left, or right. There will be a food spawning on the map on a random location, the player’s goal is to make the snake eat the food. \nAs the snake eats the food, a new food will spawn on another location. The snake grows longer as it eats more food, so make sure the snake does not bite itself! Try making the longest snake possible.";
		
		JOptionPane.showMessageDialog(null, instructions);
		timer.setDelay(120);
		
		timer.start();
	}

	public static void main(String[] args) {
		new SnakeGame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			snake.setDirection(Direction.UP);
			break;
		case KeyEvent.VK_DOWN:
			snake.setDirection(Direction.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			snake.setDirection(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			snake.setDirection(Direction.RIGHT);
			break;
		case KeyEvent.VK_SPACE:
			snake.feed();
		}
	}

	private void setAppleLocation() {
		Random rand = new Random();
		Location l = new Location(rand.nextInt(WIDTH),rand.nextInt(HEIGHT));
		appleLocation = l;
		while(snake.isLocationOnSnake(appleLocation)==true) {
			l = new Location(rand.nextInt(WIDTH),rand.nextInt(HEIGHT));
			appleLocation = l;
		}
		numOfApplesEaten++; 
	}

	private void gameOver() {
		timer.stop();
		JOptionPane.showMessageDialog(null, "You're dead.\nYour score was " + numOfApplesEaten);
		String input = JOptionPane.showInputDialog("Do you want to play again? (y/n)");
		if(input.equalsIgnoreCase("y")) {
			snake.reset(new Location(WIDTH/2,HEIGHT/2));
			numOfApplesEaten = -1;
			setAppleLocation();
			timer.start();
		} else {
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		snake.update();
		
		if(snake.isHeadCollidingWithBody()) {
			gameOver();
		}
		
		if(snake.getHeadLocation().equals(appleLocation)) {
			snake.feed();
			setAppleLocation();
		}
		
		panel.repaint();
	}
}