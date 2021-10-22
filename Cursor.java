public class Cursor
{
	private Point position, direction;

	public Cursor()
	{
		reset();
	}

	public Cursor(Point position, Point direction)
	{
		setPosition(position);
		setDirection(direction);
	}

	public void setDirection(Point direction)
	{
		this.direction = direction;
	}

	public void setPosition(Point position)
	{
		this.position = position;
	}

	public Point getPosition()
	{
		return position;
	}

	public Point getDirection()
	{
		return direction;
	}

	public void reset()
	{
		setPosition(new Point(0, 0));
		setDirection(new Point(1, 0));
	}

	public void stepStraigth()
	{
		setPosition(getPosition().add(getDirection()));
	}

	public void turnRight()
	{
		setDirection(new Point(getDirection().getOrd(), - getDirection().getAbs()));
	}

	public void turnLeft()
	{
		setDirection(new Point(-getDirection().getOrd(), getDirection().getAbs()));
	}
}
