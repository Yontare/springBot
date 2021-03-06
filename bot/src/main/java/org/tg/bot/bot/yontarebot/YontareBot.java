package org.tg.bot.bot.yontarebot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.tg.bot.persistence.service.MessageService;

@Component
public class YontareBot extends TelegramLongPollingBot {
    private final MessageService messageService;

    public YontareBot(MessageService messageService) {
        this.messageService = messageService;
    }

    @Value("${tg.bot.name}")
    private String name;

    @Value("${tg.bot.token}")
    private String token;

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage();
            String text = update.getMessage().getText();
            StringBuilder sb = new StringBuilder();
            for (String s : text.split("\\.")) {
                sb.append(s);
                sb.append(" ");
            }
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(sb.toString().trim());
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return name;
    }

    @Override
    public String getBotToken() {
        return token;
    }
}