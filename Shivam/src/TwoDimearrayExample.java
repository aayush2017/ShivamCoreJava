
public class TwoDimearrayExample {
	public static void main(String s[]) {
		int[][] arr= {{1,2,3}, {4,5,6}};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(i+ " " +arr[i][j]);
			}
		}
	}
}
