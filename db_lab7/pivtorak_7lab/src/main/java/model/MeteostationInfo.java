package model;

import lombok.*;

import javax.persistence.*;

@Table(name = "meteostation_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity

public class MeteostationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "temperature", length = 45)
    private String temperature;
    @Column(name = "humidity", length = 45)
    private String humidity;
    @ManyToOne
    @JoinColumn(name = "wind_id", referencedColumnName = "id", nullable = false)
    private WindInfo windId;
    @ManyToOne
    @JoinColumn(name = "interval_id", referencedColumnName = "id", nullable = false)
    private Interval intervalId;
    @ManyToOne
    @JoinColumn(name = "meteostation_id",referencedColumnName = "id", nullable = false)
    private Meteostation meteostationId;
    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id", nullable = false)
    private ServiceInfo serviceId;

    @Override
    public String toString() {
        return "MeteostationInfo{" +
                "id=" + id +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", windId=" + windId.getId() +
                ", intervalId=" + intervalId.getId() +
                ", meteostationId=" + meteostationId.getId() +
                ", serviceId=" + serviceId.getId() +
                '}'+ "\n";
    }
}
