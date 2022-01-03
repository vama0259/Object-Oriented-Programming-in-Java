package points;
public class Distance {
	public static double getDistance(Point p1, Point p2) {
		double dist = Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
		return dist;
	}
	public static void main(String[] args) {
		Point p1 = new Point(5,5);
		Point p2 = new Point(0,0);
		double dis = getDistance(p1,p2);
		System.out.println(dis);
	}
}
