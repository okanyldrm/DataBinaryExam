
public class DLL {

	public DLLNode first;

	public DLL(DLLNode first) {

		this.first = null;
	}
	
	public void curr() {
		for(DLLNode here=first;first!=null;here=here.left) {
			
		}
	}
	

	public void add(DLLNode node) {

		if (first.equals(null)) {
			first.left = null;
			first.right = null;
			first = node;
		}
		
		else if(first.element<node.element) {
				node.
				first.right=node;
				}
		
		else if(first.element>node.element) {
			first.left=node;
		}
		
		
			}
		

	

}
