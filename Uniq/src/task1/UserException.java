package task1;

class BalajiException extends Exception{
	public BalajiException(String msg) {
		super(msg);
	}
}



public class UserException {

	public static void main(String[] args) throws BalajiException {
		int age=16;
		
		if(age>=18) {
			System.out.println("Eligible To Vote");
		}else {
			throw new BalajiException("Not Eligible To Vote");
		}

	}

}
