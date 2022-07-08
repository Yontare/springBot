package org.tg.bot.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(
        basePackages = {
                "org.tg.bot.persistence.service"
        })
@EnableJpaRepositories(basePackages = {
        "org.tg.bot.persistence.repository"
})
@EntityScan(basePackages = {
        "org.tg.bot.persistence.model"
})
public class PersistenceConfig {
}
