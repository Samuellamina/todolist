package spring.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getHelloMessage(String user, int age) {
        return "Hello " + user + " your age is " + age;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to the Demo application";
    }
}
