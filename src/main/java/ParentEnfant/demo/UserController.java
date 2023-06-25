package ParentEnfant.demo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users") //point d'entree du controlleur=>http//localhost:8080/user
public class UserController {

    @GetMapping(path = "/allUsers")
    public String getAllUsers(){
    return "get all user was called";
}
@PatchMapping
public String updateUser(){
    return "user mis a jour ";
}

@PutMapping
public String createUser(){
    return "user created ";
}
@DeleteMapping
public String deleteUser(){
    return "user deleted ";
}
}
