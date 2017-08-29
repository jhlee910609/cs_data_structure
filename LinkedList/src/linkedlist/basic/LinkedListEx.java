package linkedlist.basic;

public class LinkedListEx {
	
	public static void main(String args[]) {
		
		LinkedList l = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		l.insertLastNode("mon");
		l.insertLastNode("wen");
		l.insertLastNode("sun");
		l.printList();
		
		System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
		Node preNode = l.searchNode("wen");
		if(preNode == null)
			System.out.println("failed search >>> nothing ");
		else {
			l.insertMiddleNode(preNode, "fri");
			l.printList();
		}
		
		System.out.println("(3) 원하는 노드 삭제하기");
		l.deleteNode(l, "sun");
		l.printList();
		
		System.out.println("(4) 리스트의 노드를 역순으로 바꾸기");
		l.reverseList();
		l.printList();
		
		System.out.println("(5) 리스트의 마지막 노드 삭제하기");
		l.deleteLastNode();
		l.printList();
	}
}
	// 아래 설계한 ListNode 클래스를 활용하여 LinkedList class 설계한다. 
	class LinkedList{
		
		// 1. head를 멤버변수로 정의한다. 
		private Node head;
		
		// 2. 최초 new 시, head는 null로 초기화한다. 
		public LinkedList() {
			this.head = null;
		}
		
		// 3. insertLastNode라는 의미는 '마지막 노드' 다음에 노드를 link한다는 의미이다.
		public void insertLastNode(String data) {
	
			// 3.1. 새로운 노드를 new한다.
			// 3.2. 노드 new 시, data field에 값을 넣어 초기화한다. 
			Node newNode = new Node(data);
			
			// 3.3. 최초 node 삽입 시, head가 null이기 때문에 분기해준다.
			if(head == null) {
				this.head = newNode;
				
			// 3.4. head를 temp에 담고, node들을 타고타고 끝까지 간다. (단순 연결 리스트에서 마지막 노드의 link는 항상 null이다.)
			} else {
				Node temp = head;
				while(temp.getLink() != null) temp = temp.getLink();
				temp.setLink(newNode);
			}
		}
		
		// 4. 중간에 노드를 삽입할 때, 사용하는 메소드이다. 
		// * 노드를 연결할 때, 반드시 순서를 지켜줘야 한다. 그렇지 않으면 데이터가 유실된다.  
		public void insertMiddleNode(Node preNode, String data) {
			
			// 4.1. 새로운 Node를 new 한다.
			Node newNode = new Node(data);
			
			// 4.2. 인자로 받아온 preNode의 link를 셋팅한다.
			newNode.setLink(preNode.getLink());
			
			// 4.3. preNode의 link로 newNode를 셋팅한다.  
			preNode.setLink(newNode);
		}

		// 5. 노드를 삭제한다. 
		public void deleteLastNode() {
			
			Node pre, temp;
			
			// 5.1. LinkedList의 Node 존재 유/무를 판단한다. 
			if(head == null) return;
			if(head.getLink() == null) {
				head = null;
			} else {
				pre = head;
				temp = head.getLink();
				while(temp.getLink() != null) {
					pre = temp;
					temp = temp.getLink();
				}
				pre.setLink(null);
			}
		}
		
		public void deleteNode(LinkedList l,String data) {
			
			// 1. LinkedList의 head부터 탐색하도록 preNode를 head로 초기화한다.
			Node preNode = l.head;
			
			// 2. 삭제를 원하는 data를 갖고 있는 노드를 찾아낸다. 
			Node deletedNode = l.searchNode(data);
			
			// 3. while문을 통해 다음 링크가 삭제할 링크의 바로 전 노드를 찾아낸다. 
			while(preNode.getLink() != deletedNode) { 	
				
				// 3.1. 찾은 노드를 preNode에 저장한다. 
				preNode = preNode.getLink();
			}
		
			// 4. preNode의 link를 deletedNote의 link로 연결한다.
			preNode.setLink(deletedNode.getLink());
			
			// 5. deletedNode의 다음 링크를 null 처리하여 없앤다. 
			deletedNode.setLink(null);
		}
		
		// 6. 데이터 값으로 노드를 탐색하여 데이터에 맞는 노드를 찾아낸다. 
		public Node searchNode(String data) {
			Node temp = this.head;
			while(temp != null) {
				if(data == temp.getData())
					return temp;
				else temp = temp.getLink();
			}
			return temp;
		}
		
		public void reverseList() {
			Node next = head;
			Node current = null;
			Node pre = null;
			while(next != null) {
				pre = current;
				current = next;
				next = next.getLink();
				current.setLink(pre);
			}
			head = current;
		}
		
		public void printList() {
			Node temp = this.head;
			System.out.printf("L=(");
			while(temp != null) {
				System.out.printf(temp.getData());
				temp = temp.getLink();
				if(temp !=null) {
					System.out.printf(", ");
				}
			}
			System.out.println(")");
				}
			}
		
		
	// 노드 클래스를 설계한다. 
	class Node{
		
		// data field
		private String data;
		
		// link field
		private Node link;
		
		// 파라미터 경우의 수에 따른 다양한 생성자를 오버로드한다.
		public Node() {
			this.data = null;
			this.link = null;
		}
		
		public Node(String data) {
			this.data = data;
			this.link = null;
		}
		
		public Node(String data, Node link) {
			this.data = data;
			this.link = link;
		}
		
		// 멤버변수에 접근할 수 있는 setter와 getter를 만든다.
		public String getData() {
			return this.data;
		}
		
		public Node getLink() {
			return this.link;
		}
		
		public void setLink(Node link) {
			this.link = link;
		}
	}



