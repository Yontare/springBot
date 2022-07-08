package org.tg.bot.bot.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.tg.bot.bot.service.UpdateService;

@Service
public class UpdateServiceImpl implements UpdateService {

    @Value("${tg.bot.chat-id}")
    private Long chatId;

    @Override
    public Update getUpdate(String text) {
        Chat chat = new Chat();
        Update update = new Update();
        Message message = new Message();

        chat.setId(chatId);
        message.setText(text);
        message.setChat(chat);
        update.setMessage(message);

        return update;
    }
}
