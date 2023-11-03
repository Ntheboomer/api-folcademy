package trabajofolcademy.saludo.api.Exceptions.ExceptionsKinds;
public class UserBadRequestException extends RuntimeException{
    public UserBadRequestException(String message){ super(message); }
}