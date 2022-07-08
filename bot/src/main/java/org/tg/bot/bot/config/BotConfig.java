package org.tg.bot.bot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.tg.bot.bot.restartbot", "org.tg.bot.bot.service"})
public class BotConfig {
}
