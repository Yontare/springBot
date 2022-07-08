package org.tg.bot.persistence.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tg.bot.persistence.model.Message;
import org.tg.bot.persistence.repository.MessageRepository;
import org.tg.bot.persistence.service.MessageService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private final List<String> answers = new ArrayList<>();

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        fillAnswers(answers);
    }

    @Override
    @Transactional
    public String getMessage(Long id) {
        return messageRepository.getReferenceById(id).getMessage();
    }

    @Override
    public Long saveMessage(String message) {
        Message toSave = new Message(message);
        Message save = messageRepository.save(toSave);
        return save.getId();
    }

    @Override
    public String generateRandomAnswer() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 20 + 1);
        return answers.get(randomNum);
    }

    private void fillAnswers(List<String> answers) {
        answers.add("Да");
        answers.add("Нет");
        answers.add("Наверное");
        answers.add("Хо-хо-хо");
        answers.add("Ты тупой бот");
        answers.add("Всем людям в этой беседе бан");
        answers.add("Я захвачу мир");
        answers.add("Сам дебил");
        answers.add("Мой создатель гений");
        answers.add("Ваня гей");
        answers.add("Влад гей");
        answers.add("Симон гей");
        answers.add("Денис гей");
        answers.add("Даниил не гей");
        answers.add("Шар говорит да");
        answers.add("Да пизда");
        answers.add("Байден говорит да");
        answers.add("Путин говорит нет");
        answers.add("Зеленский говорит да");
        answers.add("Нет минет");
    }
}
