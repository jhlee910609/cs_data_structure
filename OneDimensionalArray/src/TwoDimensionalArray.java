
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// 1. 2차원 배열을 정의한다.
		int sale[][] = new int[][] {{63, 84, 140, 130} , {157, 209, 251, 312}};
		
		// 2.위의 정의한 2차원 배열을 확인한다. 
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%d/4분기 : sale[%d][%d] = %d%n", j+1, i, j, sale[i][j] );
			}
		}
	}
}
