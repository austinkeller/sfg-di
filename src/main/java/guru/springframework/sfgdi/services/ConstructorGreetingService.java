package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements guru.springframework.sfgdi.services.GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
