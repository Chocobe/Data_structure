package eraser;

public interface Eraser {
//	private int size_x;
//	private int size_y;
//	private int size_z;
	
	public abstract void set_size_x(int _x);
	public abstract void set_size_y(int _y);
	public abstract void set_size_z(int _z);
	
	public abstract int get_size_x();
	public abstract int get_size_y();
	public abstract int get_size_z();
	
	public abstract void erase();
}
