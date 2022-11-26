//Exercise : 15 min : google String functionsString str=“import java.util.*;class JavaExample{public static void main(String args[]){ArrayList<String> alist=new ArrayList<String>();alist.add("Gregor Clegane");alist.add("Khal Drogo");//iterating ArrayListfor(String str:alist)System.out.println(str);}}”Stack1: {, {Stack2: }, }Stack3: (, (Stack4: ),),)Scan the str, and prepare six stack for the bracketsCreate stacks for {, }, (, ), [, ]Compare the size of the stacks bracket pair-wise.If they do not match: display an error message else say: Compiled successfully.

package ExercxisePkg_6;

import java.util.Stack;

public class Exercise_stack {
	public static void main(String[] args) {
		String s="The previous list: []The current emp added: Emp [id=101, name=E1]\r\n"+ "The previous list: [Emp [id=101, name=E1]]\r\n"+ "The current emp added: Emp [id=102, name=E2]\r\n"+ "The previous list: [Emp [id=101, name=E1], Emp [id=102, name=E2]]\r\n"+ "The current emp added: Emp [id=103, name=E3]\r\n"+ "";
		Stack<Character> curly_start=new Stack<>();
		Stack<Character> curly_end=new Stack<>();
		Stack<Character> simple_start=new Stack<>();
		Stack<Character> simple_end=new Stack<>();
		Stack<Character> square_start=new Stack<>();
		Stack<Character> square_end=new Stack<>();
		for(char c:s.toCharArray()) {
			if(c=='{')
				curly_start.push(c);
			else if(c=='}')
				curly_end.push(c);
			else if(c=='(')
				simple_start.push(c);
			else if(c==')')
				simple_end.push(c);
			else if(c=='[')
				square_start.push(c);
			else if(c==']')
				square_end.push(c);
			}
		if(curly_start.size()!=curly_end.size()) {
			System.out.println("error");
			}
		else if(simple_start.size()!=simple_end.size()) {
			System.out.println("error");
			}
		else if(square_start.size()!=square_end.size()) {
			System.out.println("error");
			}
		else {System.out.println("Compilation successful");
		}
	}
}
