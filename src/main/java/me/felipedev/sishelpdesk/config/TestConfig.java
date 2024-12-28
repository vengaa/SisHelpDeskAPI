package me.felipedev.sishelpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import me.felipedev.sishelpdesk.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbService;
    
    @jakarta.annotation.PostConstruct
    public void instanciaDB() {
        this.dbService.instanciaDB();
    }
}
