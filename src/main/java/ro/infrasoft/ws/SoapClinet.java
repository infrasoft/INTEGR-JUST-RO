package ro.infrasoft.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import ro.infrasoft.ws.dto.*;

import javax.xml.soap.MessageFactory;
@Service
@Slf4j
public class SoapClinet {

    public static final String DTO_PACKAGE = "ro.infrasoft.ws.dto";
    public static final String JUST_RO_URL = "http://portalquery.just.ro/query.asmx";

    public static final ObjectMapper objectMapper =  new ObjectMapper();
    public CautareDosare2Response cautareDosare2(CautareDosare2 cautareDosare2) {
        try {
            String jsonCautareDosare2 = objectMapper.writeValueAsString(cautareDosare2);
            log.info("S-a cautat:" + "\n" + jsonCautareDosare2);
            SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory(
                    MessageFactory.newInstance());
            messageFactory.afterPropertiesSet();

            WebServiceTemplate webServiceTemplate = new WebServiceTemplate(
                    messageFactory);
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

            marshaller.setContextPath(DTO_PACKAGE);

            webServiceTemplate.setMarshaller(marshaller);
            webServiceTemplate.setUnmarshaller(marshaller);

            CautareDosare2Response cautareDosare2Response = (CautareDosare2Response) webServiceTemplate
                    .marshalSendAndReceive(
                            JUST_RO_URL,
                            cautareDosare2);
            String jsonCautareDosare2Response = objectMapper.writeValueAsString(cautareDosare2Response);
            log.info("Rezultat: " + "\n" + jsonCautareDosare2Response);
            return cautareDosare2Response;
        } catch (Exception s) {
            log.error(String.valueOf(s));
        }
        return null;
    }

    public CautareSedinteResponse cautareSedinte(CautareSedinte cautareSedinte) {
        try {
            String jsonCautareSedinte = objectMapper.writeValueAsString(cautareSedinte);
            log.info("S-a cautat:" + "\n" + jsonCautareSedinte);
            SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory(
                    MessageFactory.newInstance());
            messageFactory.afterPropertiesSet();

            WebServiceTemplate webServiceTemplate = new WebServiceTemplate(
                    messageFactory);
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

            marshaller.setContextPath(DTO_PACKAGE);
            marshaller.afterPropertiesSet();

            webServiceTemplate.setMarshaller(marshaller);
            webServiceTemplate.setUnmarshaller(marshaller);
            webServiceTemplate.afterPropertiesSet();

            CautareSedinteResponse cautareSedinteResponse = (CautareSedinteResponse) webServiceTemplate
                    .marshalSendAndReceive(
                            JUST_RO_URL,
                            cautareSedinte);

            String jsonCautareSedinteResponse = objectMapper.writeValueAsString(cautareSedinteResponse);
            log.info("Rezultat: " + "\n" + jsonCautareSedinteResponse);
            return cautareSedinteResponse;
        } catch (Exception s) {
            log.error(String.valueOf(s));
        }
        return null;
    }
}
