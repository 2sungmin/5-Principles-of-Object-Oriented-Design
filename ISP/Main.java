package ISP;

public class Main {
	public static void main(String[] args) {
		Ray r = new Ray();
	    System.out.println(r.drive());
	    System.out.println(r.breaks());
	    Telsa t = new Telsa();
	    System.out.println(t.autoDrive());
	    System.out.println(t.autoParking());
	    System.out.println(t.drive());
	    System.out.println(t.breaks());
	   }
	}
