package externalconfiguration.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProfileController {

	@Value("${secondvariable}")
	private String welcomeMessage;
	
	

	@GetMapping("/welcome")
	public String getDataBaseConnectionDetails() {
		return welcomeMessage;
	}
}
