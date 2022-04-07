public class InvalidException extends Exception{
	
	 public InvalidException(String message) {
		 super(message);
		 System.out.println(message);
	    }
}