package trabajofolcademy.saludo.api.Exceptions.ExceptionsKinds;
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){ super(message); }
}