package org.tg.bot.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.tg.bot.web.rest")
public class WebConfig {
}
