package stack.basic;

public class StackEx {

	public static void main(String[] args) {
		int stackSize = 5;
		char deletedItem;
		ArrayStack as = new ArrayStack(stackSize);

		as.push('a');
		as.printStack();

		as.push('b');
		as.printStack();

		as.push('c');
		as.printStack();

		deletedItem = as.pop();
		if (deletedItem != 0)
			System.out.println("deleted item : " + deletedItem);
		as.printStack();
	}
}
