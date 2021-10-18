import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class TestCursorUser
{
	private boolean equals(Cursor c, Cursor d)
	{
		return c.getPosition().equals(d.getPosition())
				&& c.getDirection().equals(d.getDirection());
	}

	@Test
	public void testCursorInterfacePointInterfacePoint()
	{
		Cursor c = new Cursor(new Point(1, 2), new Point(5, 4));
		assertTrue(equals(c, new Cursor(new Point(1, 2), new Point(5, 4))));
	}

	@Test
	public void testGetPosition()
	{
		Cursor c = new Cursor();
		c.setPosition(new Point(1, 5));
		assertTrue(c.getPosition().equals(new Point(1, 5)));
		c.setDirection(new Point(3, 4));
		assertTrue(c.getPosition().equals(new Point(1, 5)));
		c.setPosition(new Point(1, 5));
		assertTrue(c.getPosition().equals(new Point(1, 5)));
	}

	@Test
	public void testGetDirection()
	{
		Cursor c = new Cursor();
		c.setDirection(new Point(1, 5));
		assertTrue(c.getDirection().equals(new Point(1, 5)));
		c.setPosition(new Point(3, 4));
		assertTrue(c.getDirection().equals(new Point(1, 5)));
		c.setDirection(new Point(1, 5));
		assertTrue(c.getDirection().equals(new Point(1, 5)));
	}

	@Test
	public void testReset()
	{
		Cursor c = new Cursor();
		c.stepStraigth();
		c.turnLeft();
		c.reset();
		assertTrue(equals(c, new Cursor(new Point(0, 0), new Point(1, 0))));
	}

	@Test
	public void testStepStraigth()
	{
		Cursor c = new Cursor(new Point(0, 0), new Point(1, 1));
		c.stepStraigth();
		c.stepStraigth();
		assertTrue(c.getPosition().equals(new Point(2, 2)));
	}

	@Test
	public void testTurnLeft()
	{
		Cursor c = new Cursor(new Point(0, 0), new Point(1, 0));
		c.turnLeft();
		assertTrue(c.getDirection().equals(new Point(0, 1)));
		c.turnLeft();
		assertTrue(c.getDirection().equals(new Point(-1, 0)));
		c.turnLeft();
		assertTrue(c.getDirection().equals(new Point(0, -1)));
		c.turnLeft();
		assertTrue(c.getDirection().equals(new Point(1, 0)));
	}

	@Test
	public void testTurnRight()
	{
		Cursor c = new Cursor(new Point(0, 0), new Point(1, 0));
		c.turnRight();
		assertTrue(c.getDirection().equals(new Point(0, -1)));
		c.turnRight();
		assertTrue(c.getDirection().equals(new Point(-1, 0)));
		c.turnRight();
		assertTrue(c.getDirection().equals(new Point(0, 1)));
		c.turnRight();
		assertTrue(c.getDirection().equals(new Point(1, 0)));
	}

}
