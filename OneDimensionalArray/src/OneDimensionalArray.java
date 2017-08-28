
public class OneDimensionalArray {

	public static void main(String[] args) {
		// 1. 1차원 배열을 정의한다. 
		int sale[] = {157, 209, 251, 312};
		
		// 2.확인한다.
		for(int i=0; i < sale.length; i++) {
			System.out.printf("%d/4분기 : sale[%d] = %d %n", i+1, i, sale[i]);
		}
	}
}
