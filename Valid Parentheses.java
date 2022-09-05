public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char cur : s.toCharArray()) {
		if (cur == '(')
			stack.push(')');
		else if (cur == '{')
			stack.push('}');
		else if (cur == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != cur)
			return false;
	}
	return stack.isEmpty();
}
