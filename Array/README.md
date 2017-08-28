# 선형 리스트

> 목표 : 평소에 이미 코드로 사용하고 있던 개념들이지만 개념적인 공부를 위해 기초부터 다시 공부하기로 한다.

- 리스트에서 나열한 원소들 간에 순서를 가지고 있는 리스트를 선형 리스트(Linear List) 또는 순서 리스트(Ordered List)라고 한다.
- 선형 리스트는 원소들 간의 논리적인 순서와 메모리에 저장하는 물리적인 순서가 같은 구조로되어 있는데, 이러한 구조를 순차 자료구조라 한다.
- '메모리에 실제 저장되는 순서' == '논리 순서'이다.



### 1. 1차원 배열의 순차 표현

- 1차원 배열을 정의하고, for문을 돌려 값이 제대로 저장되어 있는지 확인한다.

```java
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
```



### 2. 2차원 배열의 순차 표현

> 2차원 배열은 머리 속에 표를 그려 이해해보면 훨씬 쉽게 이해할 수 있다.

![](https://ws3.sinaimg.cn/large/006tNc79gy1fizpa5rzmtj30dw0aftgg.jpg)

```java
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
```

- 예시
- 1 row가 sale[0]의 데이터에 해당한다. 
- 2 row가 sale[1]의 데이터에 해당한다. 



### 3. 3차원 배열의 순차 배열

- 아래와 같은 자료들을 정리할 때, 3차원 배열

![](https://ws4.sinaimg.cn/large/006tNc79gy1fizpa40v6zj30dw0afdmw.jpg)

```java
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
					System.out.printf("%d/4분기 : sale[%d][%d][%d] = %d%n"
                                      , k+1, i, j, k, sales[i][j][k]);
				}
				System.out.println("===============================");
			}
		}
	}
}
```



### 4. 배열 장/단점

##### 4.1. 장점

- 자료들의 index를 활용하여 빠른 탐색이 가능하다.

##### 4.2. 단점

- 원소들을 삽입/삭제할 경우, 전체 원소들을 뒤로 밀어내거나 앞으로 당겨서 순서를 유지해야 하기 때문에 추가적인 <u>**오버헤드**</u>가 발생하게 된다. 
- 따라서 삽입, 삭제 연산이 많이 필요한 문제에서 순차 자료구조를 사용하는 것은 비효율적이다.



> **오버헤드(overhead)**는 어떤 처리를 하기 위해 들어가는 간접적인 처리 시간 · 메모리 등을 말한다.
>
>   예를 들어 A라는 처리를 단순하게 실행한다면 10초 걸리는데, 안전성을 고려하고 부가적인 B라는 처리를 추가한 결과 처리시간이 15초 걸렸다면, 오버헤드는 5초가 된다. 또한 이 처리 B를 개선해 B'라는 처리를 한 결과, 처리시간이 12초가 되었다면, 이 경우 오버헤드가 3초 단축되었다고 말한다.