package org.tg.bot.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.tg.bot.bot.config.BotConfig;
import org.tg.bot.persistence.config.PersistenceConfig;
import org.tg.bot.web.config.WebConfig;

@Configuration
@Import(value = {BotConfig.class, PersistenceConfig.class, WebConfig.class})
public class AppConfig {
}
