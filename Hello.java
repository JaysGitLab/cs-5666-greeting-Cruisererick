public class Hello {
   public static  void main(String [] args) {
        if (args.length  != 0){
		String username;
		String aux = args[0];
		if(aux.equals("-me")  && args.length>2){	
			String Pname = args[1] ;
			username = args[2];
			System.out.println("Hello " + username.substring(0,1).toUpperCase() + username.substring(1) +", My name is " + Pname.substring(0,1).toUpperCase() + Pname.substring(1) + ". How are you today, " + username.substring(0,1).toUpperCase() + username.substring(1) + "?"); 
		}
		else{
			username = args[0];
		
		System.out.println("Hello, "+ 
username.substring(0,1).toUpperCase() + username.substring(1));}
	}
	else{
		System.out.println("Hello, Erick");
	}
   }
}
