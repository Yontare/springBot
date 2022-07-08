package org.tg.bot.bot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"org.tg.bot.bot.yontarebot", "org.tg.bot.bot.service"})
public class BotConfig {
}
