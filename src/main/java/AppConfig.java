import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pluralsight")
public class AppConfig {

    /*@Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        return service;
    }


    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();

    }
    */
}
