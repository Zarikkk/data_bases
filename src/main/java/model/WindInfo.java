package model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "wind_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class WindInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "direction", length = 20)
    private String direction;
    @Column(name = "speed", length = 45)
    private String speed;
    @OneToMany(mappedBy = "windId", fetch = FetchType.LAZY)
    private List<MeteostationInfo> meteostationInfoes;

    public WindInfo(Integer id, String direction, String speed) {
        this.id = id;
        this.direction = direction;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "WindInfo{" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                ", speed='" + speed + '\'' +
                '}' + "\n";
    }
}
