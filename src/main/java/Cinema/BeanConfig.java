package Cinema;

import Cinema.Seats;
import Cinema.Statistics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    private final Seats roomCinema = new Seats();
    private final Statistics statistics = new Statistics();

    @Bean
    public Seats getRoomCinema(){
        return roomCinema;
    }

    @Bean
    public Statistics getStatistics(){
        return statistics;
    }
}
