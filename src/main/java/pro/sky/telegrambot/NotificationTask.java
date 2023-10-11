package pro.sky.telegrambot;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "notification_task")
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chat_id", nullable = false)
    private Long chatId;

    @Column(name = "notification_date_time", nullable = false)
    private LocalDateTime notificationDatetime;

    public NotificationTask(Long id, Long chatId, LocalDateTime notificationDatetime) {
        this.id = id;
        this.chatId = chatId;
        this.notificationDatetime = notificationDatetime;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public LocalDateTime getNotificationDatetime() {
        return notificationDatetime;
    }

    public void setNotificationDatetime(LocalDateTime notificationDatetime) {
        this.notificationDatetime = notificationDatetime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationTask that = (NotificationTask) o;
        return id.equals(that.id) && chatId.equals(that.chatId) && notificationDatetime.equals(that.notificationDatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chatId, notificationDatetime);
    }

    @Override
    public String toString() {
        return "NotificationTask{" +
                "id=" + id +
                ", chatId=" + chatId +
                ", notificationDatetime=" + notificationDatetime +
                '}';
    }
}
