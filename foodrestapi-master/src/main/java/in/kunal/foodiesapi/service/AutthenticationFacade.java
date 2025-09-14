package in.kunal.foodiesapi.service;

import org.springframework.security.core.Authentication;

public interface AutthenticationFacade {

    Authentication getAuthentication();
}
