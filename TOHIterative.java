
public class TOHIterative {
	
	public static void move(int[] fromTower, int[] toTower, int[] c, int disks) {
		toTower[(++toTower[0])+1] = fromTower[(fromTower[0]--)+1];
			
	}
	
	public static void main(String args[]) {
		int disks = 3;
		
		int i = 0;
		
		int[] a = new int[disks + 2];
		int[] b = new int[disks + 2];
		int[] c = new int[disks + 2];
		
		// Initialize the poles
		for (i=disks+1; i>1;--i) {
			a[i] = disks -i + 2; // the disks at start
			b[i] = c[i] = 0;		// no disks here at start
		}
		a[0] = disks;				// current number of disks
		b[0] = c[0] = 0;
		
		// the pole id's
		a[1] = 1;
		b[1] = 2;
		c[1] = 3;
		
		for (i=disks+1; i>1;--i) {
			System.out.println(a[i]);	
		}
		System.out.println("\n");
		move(a,b,c,disks);
		
		for (i=disks+1; i>1;--i) {
			System.out.println(a[i]);	
		}
		System.out.println("\n");
		
	}
}