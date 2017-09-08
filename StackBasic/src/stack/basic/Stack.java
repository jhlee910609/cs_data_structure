package stack.basic;

public interface Stack {
	
	// stack 기본 자료구조에 필요한 메소드 interface로 정의 
	boolean isEmpty();
	boolean isFull();
	
	void push(char item);
	char pop();
	void delete();
	
	// 최상의 자료를 return하는 메소드 peek 
	char peek();
}
