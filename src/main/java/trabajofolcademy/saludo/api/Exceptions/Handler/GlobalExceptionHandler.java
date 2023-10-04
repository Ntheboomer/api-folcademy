package trabajofolcademy.saludo.api.Exceptions.Handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import trabajofolcademy.saludo.api.Exceptions.Dtos.ErrorMessageDTO;
import trabajofolcademy.saludo.api.Exceptions.ExceptionsKinds.UserBadRequestException;
import trabajofolcademy.saludo.api.Exceptions.ExceptionsKinds.UserNotFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessageDTO> defaultErrorHandler(HttpServletRequest req, Exception e){
        return new ResponseEntity<>(new ErrorMessageDTO(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessageDTO> notFoundHandler(HttpServletRequest req, Exception e){
        return new ResponseEntity<>(new ErrorMessageDTO(e.getMessage()), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(UserBadRequestException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessageDTO> badRequestHandler(HttpServletRequest req, Exception e){
        return new ResponseEntity<>(new ErrorMessageDTO(e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}