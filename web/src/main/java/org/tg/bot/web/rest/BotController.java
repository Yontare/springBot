package org.tg.bot.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.tg.bot.bot.service.UpdateService;
import org.tg.bot.bot.restartbot.RestartBot;

@RestController
public class BotController {

    private final RestartBot restartBot;
    private final UpdateService updateService;

    public BotController(RestartBot restartBot, UpdateService updateService) {
        this.restartBot = restartBot;
        this.updateService = updateService;
    }

    @GetMapping("/restartRequest/{restartParameters}")
    public void restartRequest(@PathVariable String restartParameters) {
        restartBot.onUpdateReceived(updateService.getUpdate(restartParameters));
    }
}
