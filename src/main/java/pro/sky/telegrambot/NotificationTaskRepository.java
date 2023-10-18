package pro.sky.telegrambot;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository {
    List<NotificationTask> findByNotificationDateTime(LocalDateTime dateTime);
}
