package org.tg.bot.bot.service;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface UpdateService {
    Update getUpdate(String text);
}
