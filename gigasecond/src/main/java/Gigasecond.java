import java.time.LocalDate;
import java.time.LocalDateTime;
public class Gigasecond {
    private long gigaSeconds = (long) Math.pow(10,9);
    private LocalDateTime time;
    public Gigasecond(LocalDate moment) {
        this.time = LocalDateTime.from(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.time = moment;
    }

    public LocalDateTime getDateTime() {
        return time.plusSeconds(gigaSeconds);
    }
}
