package org.tg.bot.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tg.bot.persistence.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
