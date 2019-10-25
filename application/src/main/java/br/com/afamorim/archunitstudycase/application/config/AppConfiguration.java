package br.com.afamorim.archunitstudycase.application.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class AppConfiguration {

//    @Bean
//    @ConditionalOnMissingBean(IGameRepositoryPort.class)
//    public IGameRepositoryPort inmemoryBean(){
//        log.info("Initializing InMemory Adapter");
//        return new InMemoryAdapter();
//    }
//
//    /**
//     * Defines bean of Application Business
//     * @param infraestructure
//     * @return
//     */
//    @Bean
//    public IGameUseCase businessBean(IGameRepositoryPort infraestructure){
//        log.info("Initializing Business");
//        return new GameBusiness(infraestructure);
//    }
}
