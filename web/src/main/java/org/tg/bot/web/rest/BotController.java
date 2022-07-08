package org.tg.bot.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.tg.bot.bot.service.UpdateService;
import org.tg.bot.bot.yontarebot.YontareBot;

@RestController
public class BotController {

    private final YontareBot yontareBot;
    private final UpdateService updateService;

    public BotController(YontareBot yontareBot, UpdateService updateService) {
        this.yontareBot = yontareBot;
        this.updateService = updateService;
    }

    @GetMapping("/restartRequest/{restartParameters}")
    public void restartRequest(@PathVariable String restartParameters) {
        yontareBot.onUpdateReceived(updateService.getUpdate(restartParameters));
    }
}
