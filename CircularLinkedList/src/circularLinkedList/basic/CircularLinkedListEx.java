package circularLinkedList.basic;

import org.omg.CORBA.Current;

/**
 * @author JunHee
 *
 */
public class CircularLinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class CircularLinkedList {
		
		public Node head;
		
		public CircularLinkedList() {
			this.head = null;
		}
		
		public void insertLastNode(String data) {
			
			Node newNode = new Node(data);
			
			if(head == null) {
				head = newNode;
				newNode.next = newNode;
				
			} else {
				Node currentNode = head;
				while(currentNode.next != head) currentNode = currentNode.next;
				newNode.next = currentNode.next;
				currentNode.next = newNode;
			}
		}
		
		public void inserFirstNode(String data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				
			} else {
				Node currentNode = head;
				while(currentNode.next != head) currentNode = currentNode.next;
				newNode.next =currentNode.next;
				currentNode.next = newNode;
				head = newNode;
				
			}
		}
		
		public void insertMiddle(Node preNode, String data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
			} else {
				Node currentNode = head;
				while(currentNode.next != preNode) currentNode = currentNode.next;
				currentNode = currentNode.next;
				newNode.next = currentNode.next;
				currentNode.next = newNode;
			}
			
		}
		
		public void deleteLastNode() {
			if(head == null) {
				System.out.println("삭제할 노드가 존재하지 않습니다.");
			} else {
				Node preNode = head;
				Node currentNode = head.next;
				
				// 원형 연결 리스트의 노드들을 한 바퀴 다 돌았을 때, 
				while(currentNode.next != head) {
					preNode = currentNode;
					currentNode = currentNode.next;
				}
				preNode.next = currentNode;
			}
		}
		
		public void deleteFirstNode() {
			if(head == null) {
				System.out.println("삭제할 노드가 존재하지 않습니다.");
			} else {
				Node currentNode = head;
				while(currentNode.next != head) {
					currentNode = currentNode.next;
				}
				Node oldNode = currentNode.next;
				head = oldNode.next;
				currentNode.next = head;
			}
		}
		
		public void deleteMiddleNode(String data) {
			Node newNode = new Node(data);
			if(head == null) {
				System.out.println("삭제할 노드가 존재하지 않습니다.");
			} else {
				Node preNode =head;
				Node currentNode = head.next;
				while(currentNode.data != newNode.data) {
					preNode = head;
					currentNode = head.next;
				}
				preNode.next = currentNode.next;
			}
		}
		
		public Node searchNode(String data) {
			Node tempNode = new Node(data);
			if(head == null) {
				System.out.println("찾을 수 있는 노드가 없습니다.");
				return null;
			} else {
				Node currentNode = head;
				while(currentNode.data != tempNode.data) currentNode = currentNode.next;
				return currentNode;
			}
		}
		
		public void printList() {
			if(head == null) {
				System.out.println("출력할 리스트가 없습니다.");
			} else {
				Node currentNode = head;
				System.out.print("[ ");
				while(currentNode.next != head){
					System.out.print(currentNode.data + "");
					currentNode = currentNode.next;
				}
				System.out.print(currentNode.data);
				System.out.print(" ]");
				System.out.println("모든 리스트 출력완료!");				
			}			
		}
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
