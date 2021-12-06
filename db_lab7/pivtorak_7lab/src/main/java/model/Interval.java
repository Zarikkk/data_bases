package model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "service_interval")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity

public class Interval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private String date;
    @Column(name = "time", length = 45)
    private String time;

    @OneToMany(mappedBy = "intervalId", fetch = FetchType.EAGER)
    private List<MeteostationInfo> meteostationInfoes;

    public Interval(Integer id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}' + "\n";
    }
}
