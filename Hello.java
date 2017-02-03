public class Hello {
   public static  void main(String [] args) {
        if (args.length  != 0){
		String username = args[0];
	
		System.out.println("Hello, "+ 
username.substring(0,1).toUpperCase() + username.substring(1));}
	else{
		System.out.println("Hello, Erick");
	}
   }
}
