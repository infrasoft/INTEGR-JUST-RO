package ro.infrasoft.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.infrasoft.ws.dto.*;

@RestController
public class SoapClientController {

    @Autowired
    SoapClinet client;

    @PostMapping(value = "/cautareDosare2")
    public CautareDosare2Response cautareDosare2(@RequestBody CautareDosare2 cautareDosare2) throws Exception{
        return client.cautareDosare2(cautareDosare2);
    }

    @PostMapping(value = "/cautareSedinte")
    public CautareSedinteResponse cautareSedinte(@RequestBody CautareSedinte cautareSedinte) throws Exception{
        return client.cautareSedinte(cautareSedinte);
    }
}
