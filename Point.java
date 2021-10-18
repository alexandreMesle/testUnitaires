public class Point
{
	private int abs, ord;

	public Point(int abs, int ord)
	{
		setAbs(abs);
		setOrd(ord);
	}

	public Point()
	{
		this(0, 0);
	}

	public int getOrd()
	{
		return ord;
	}

	public int getAbs()
	{
		return abs;
	}

	public void setOrd(int ord)
	{
		this.ord = ord;
	}

	public void setAbs(int abs)
	{
		this.abs = abs;
	}

	public Point add(Point p)
	{
		return new Point(getAbs() + p.getAbs(), getOrd() + p.getOrd());
	}

	public boolean equals(Point p)
	{
		return getAbs() == p.getAbs() && getOrd() == p.getOrd();
	}
}
