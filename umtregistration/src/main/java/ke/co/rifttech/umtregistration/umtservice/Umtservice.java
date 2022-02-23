package ke.co.rifttech.umtregistration.umtservice;

import ke.co.rifttech.umtregistration.umtRepository.UmtUserRepository;
import ke.co.rifttech.umtregistration.userregistration.Umtuser;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Umtservice {
    private final Umtuser umtuser;
    private final UmtUserRepository umtUserRepository;

    public Umtuser addUmtusers( Umtuser umtuser) {
        return umtUserRepository.save(umtuser);
    }
    public List getAllusers(){
        return umtUserRepository.findAll();
    }
    public Umtuser updateuser(Umtuser umtuser){
        return umtUserRepository.save(umtuser);
    }
    public Umtuser findUmtUser(Long id){
        return  umtUserRepository.findUmtUserById(id).orElseThrow(()-> new IllegalStateException("User with id" +id+"not found"));
    }
    public void deleteuser(Long id){
        umtUserRepository.deleteById(id);
    }
}
