package exceptions;

/**
 * Created by Cedric on 7/04/2017.
 */
public class DomainException extends Exception {

    private static final long serialVersionUID=1L;
    public DomainException(){

    }

    public DomainException(String message, Throwable exception){
        super(message, exception);
    }

    public DomainException(String message)
    {
        super(message);
    }

    public DomainException(Throwable exception){
        super (exception);
    }
}
