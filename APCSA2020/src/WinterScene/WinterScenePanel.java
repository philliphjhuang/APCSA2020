package WinterScene;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JPanel;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable {
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	
	private AbstractShape[] tree = new AbstractShape[3];
	
	public WinterScenePanel() {
		setVisible(true);
		// refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<AbstractShape>();
		// populate the list with 50 unique snowflakes
		for (int i = 0; i < 50; i++) {
			shapes.add(new FancySnowFlake((int) (Math.random() * 750) + 10, (int) (Math.random() * 100),(int) (Math.random() * 10), (int) (Math.random() * 10), Color.yellow, 0, (int) (Math.random() * 10) + 1));
		}

		// instantiate a snowman
		sMan = new SnowMan(500, 300, 100, 100);
		// add the rest of the things ;w;
		tree[0] = new Tree(250, 200, 10, 10);
		tree[1] = new Tree(250, 300, 10, 10);
		tree[2] = new Tree(250, 400, 10, 10);
		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		window.setColor(Color.BLUE);
		window.fillRect(0, 0, getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
		window.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 18));
		window.drawString("WINTER SCENE", 25, 40);

		// make the snowman appear
		sMan.draw(window);
		for(AbstractShape as:tree) {
			as.moveAndDraw(window);
		}
		// make the snowflakes appear and move down the screen
		// check to see if any of the snowflakes need to be reset to the top of the
		// screen
		for (AbstractShape s : shapes) {
			s.moveAndDraw(window);
			if (s.getYPos() >= getHeight())
				s.setYPos(0);
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(35);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}