
public class ThreeDimensionalArray {

	public static void main(String[] args) {
		
		// 1. 3차원 배열을 정의한다.
		int[][][] sales = {{{63, 84, 140, 130}, {157, 209, 251, 312}},
						  {{59, 80, 130, 135}, {149, 187, 239, 310}}};
		
		// 2. 저장된 배열을 확인한다.
		for(int i=0; i<2; i++) {
			System.out.printf("<<%d 팀>> %n", i+1);
			for(int j=0; j<2; j++) {
				for(int k=0; k<4; k++) {
					System.out.printf("%d/4분기 : sale[%d][%d][%d] = %d%n", k+1, i, j, k, sales[i][j][k]);
				}
				System.out.println("===============================");
			}
		}
	}
}
