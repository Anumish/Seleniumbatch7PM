package OOPS;


// it is a simple class which is going to implement all the methods of ClassD class

public class Mailbox extends ClassD{


	
	public void compose() {
		// TODO Auto-generated method stub
		
		System.out.println("composing an email");
		
	}

	
	public void delete() {
		// TODO Auto-generated method stub
		
		System.out.println("mail deletion");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mailbox m= new Mailbox();
		
		m.login();
		
		
	}


}
