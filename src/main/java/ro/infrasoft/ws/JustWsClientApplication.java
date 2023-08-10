package ro.infrasoft.ws;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition
public class JustWsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustWsClientApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {
		return new OpenAPI()
				.info(new Info()
								.title("INTEGR-JUST-RO")
								.version(appVersion)
								.description(appDesciption)
								.termsOfService("http://swagger.io/terms/"));
	}

}
