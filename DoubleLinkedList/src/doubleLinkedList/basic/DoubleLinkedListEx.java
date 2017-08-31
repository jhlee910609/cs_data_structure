package doubleLinkedList.basic;

import circularLinkedList.basic.CircularLinkedListEx.Node;

public class DoubleLinkedListEx {

	public static void main(String[] args) {
		

	}
	
	// 노드 클래스를 설계한다.
		class Node {

			// data field
			public String data;

			// link field
			public Node next;

			// 파라미터 경우의 수에 따른 다양한 생성자를 오버로드한다.
			public Node() {
				this.data = null;
				this.next = null;
			}

			public Node(String data) {
				this.data = data;
				this.next = null;
			}

			public Node(String data, Node link) {
				this.data = data;
				this.next = link;
			}
		}

}
