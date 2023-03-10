package ExceptionHandling;

public class ApplicationException extends RuntimeException{

	
	public ApplicationException(String mesg) {
		super(mesg);
		//The above super keyword will give the message to RuntimeException
	}
	
}
