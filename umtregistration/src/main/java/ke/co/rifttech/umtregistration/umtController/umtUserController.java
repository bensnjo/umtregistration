package ke.co.rifttech.umtregistration.umtController;

import ke.co.rifttech.umtregistration.umtservice.Umtservice;
import ke.co.rifttech.umtregistration.userregistration.Umtuser;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor
public class umtUserController {
    private final Umtservice umtservice;

    @GetMapping(path = "/all")
    public ResponseEntity<List<Umtuser>> allUsers(){
        List<Umtuser> allUsers=umtservice.getAllusers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }
    @GetMapping(path = "find/{id}")
    public ResponseEntity<Umtuser> findUser(@PathVariable("id") Long id){
       Umtuser umtuser=umtservice.findUmtUser(id);
        return new ResponseEntity< >(umtuser, HttpStatus.OK);
    }
    @PostMapping(path = "/adduser")
    public ResponseEntity<Umtuser> saveUser(@RequestBody Umtuser umtuser){
        Umtuser newUmtUser=umtservice.addUmtusers(umtuser);
        return new ResponseEntity< >(newUmtUser, HttpStatus.CREATED);
    }
    @PutMapping(path = "/updateuser")
    public ResponseEntity<Umtuser> updateUser(@RequestBody Umtuser umtuser){
        Umtuser updateUmtUser=umtservice.updateuser(umtuser);
        return new ResponseEntity< >(updateUmtUser, HttpStatus.OK);
    }
    @DeleteMapping (path = "/deleteuser/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        umtservice.deleteuser(id);
        return new ResponseEntity< >(HttpStatus.OK);
    }
}
