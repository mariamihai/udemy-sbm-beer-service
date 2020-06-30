package guru.springframework.sbmbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class SbmBeerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmBeerServiceApplication.class, args);
    }

}
