package trabajofolcademy.saludo.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trabajofolcademy.saludo.api.Models.Dtos.UserAddDTO;
import trabajofolcademy.saludo.api.Models.Dtos.UserReadDTO;
import trabajofolcademy.saludo.api.Services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserReadDTO>> listall(){
    return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<UserReadDTO> add(@RequestBody UserAddDTO userAddDTO){
    return ResponseEntity.ok(userService.add(userAddDTO));
    }

}
