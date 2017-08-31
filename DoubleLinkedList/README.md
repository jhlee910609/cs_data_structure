# 이중 연결 리스트 (Doubly Linked List)

### 1. 이중 연결 리스트란

- 단순 연결 리스트에서 선행 노드에 접근하기가 어렵다는 점을 개선하여 원형 연결 리스트를 설계했다.
- 하지만 원형 연결 리스트에서도 현재 노드의 바로 이전 노드에 접근하려면 전체 리스트를 한바퀴 순회해야 하는 문제가 발생한다.
- 이런 문제를 개선하여 양쪽 방향으로 리스트에 있는 각각의 노드들을 순회할 수 있도록 연결한 리스트를 이중 연결 리스트(Doubly Linked List)라고 한다.

> 이중 연결 리스트는 아래 그림과 같이 두 개의 링크 필드(Link field)와 한 개의 데이터 필드(Data field)로 구성한다.

![](http://algorithms.tutorialhorizon.com/files/2016/03/Doubly-Linked-List.png)