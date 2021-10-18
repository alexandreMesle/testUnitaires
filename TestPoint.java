import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class TestPoint
{
	@Test
	public void testPointIntInt()
	{
		Point p = new Point(3, 2);
		assertTrue(p.getAbs() == 3 && p.getOrd() == 2);
	}

	@Test
	public void testGetOrd()
	{
		Point p = new Point();
		p.setOrd(5);
		assertTrue(p.getOrd() == 5);
		p.setOrd(-1);
		assertTrue(p.getOrd() == -1);
		p.setAbs(4);
		assertTrue(p.getOrd() == -1);
	}

	@Test
	public void testGetAbs()
	{
		Point p = new Point();
		p.setAbs(5);
		assertTrue(p.getAbs() == 5);
		p.setAbs(-1);
		assertTrue(p.getAbs() == -1);
		p.setOrd(4);
		assertTrue(p.getAbs() == -1);
	}

	@Test
	public void testEquals()
	{
		Point p = new Point(3, 5);
		assertTrue(p.equals(p));
		Point q = new Point(3, 5);
		assertTrue(p.equals(q) && q.equals(p));
		assertTrue(!p.equals(new Point(5, 3)));
		assertTrue(!p.equals(new Point(3, 6)));
		assertTrue(!p.equals(new Point(4, 5)));
	}

	@Test
	public void testAdd()
	{
		Point p = new Point(3, 5), q = new Point(2, 3);
		assertTrue(p.add(p).equals(new Point(6, 10)));
		assertTrue(p.add(p).equals(new Point(6, 10)));
		assertTrue(p.add(q).equals(new Point(5, 8)));
		assertTrue(p.add(q).equals(q.add(p)));
	}

}
