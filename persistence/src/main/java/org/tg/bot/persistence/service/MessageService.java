package org.tg.bot.persistence.service;

public interface MessageService {
    String getMessage(Long id);
    Long saveMessage(String message);

    String generateRandomAnswer();
}
