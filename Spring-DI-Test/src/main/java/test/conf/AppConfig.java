package test.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import test.models.CD;
import test.models.CDPlayer;
import test.models.Media;
import test.models.MediaPlayer;

@Configuration
public class AppConfig {
    @Bean
    public Media aTestCD() {
        CD aCD = new CD();
        aCD.setItsData("A Test Data");
        return aCD;
    }
    
    @Bean
    public MediaPlayer<CD> aCDPlayer(CD theCD)
    {
        MediaPlayer<CD> aPlayer = new CDPlayer(theCD);
        return aPlayer;
    }

}
