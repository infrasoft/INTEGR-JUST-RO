package ro.infrasoft.ws;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import ro.infrasoft.ws.dto.*;

import javax.xml.soap.MessageFactory;

@Service
public class SoapClinet {

    public static final String DTO_PACKAGE = "ro.infrasoft.ws.dto";
    public static final String JUST_RO_URL = "http://portalquery.just.ro/query.asmx";

    public CautareDosare2Response cautareDosare2(CautareDosare2 cautareDosare2) {
        try {
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
            return cautareDosare2Response;
        } catch (Exception s) {
            s.printStackTrace();
            System.out.println(s);
        }
        return null;
    }

    public CautareSedinteResponse cautareSedinte(CautareSedinte cautareSedinte) {
        try {
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

            return cautareSedinteResponse;
        } catch (Exception s) {
            s.printStackTrace();
            System.out.println(s);
        }
        return null;
    }
}
