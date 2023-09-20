package trabajofolcademy.saludo.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class saludoController {

    @GetMapping("/hello")
    public String hello(){
        return "hola mundo";
    }

    @PostMapping("/goodbye")
    public String goodbye(){
        return "Adios, Hasta luego!";
    }
}
