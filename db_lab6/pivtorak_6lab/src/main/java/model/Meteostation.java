package model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "meteostation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity

public class Meteostation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "instalation_date")
    private String instalationDate;
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    private Location locationId;
    @ManyToOne
    @JoinColumn(name = "producer_id", referencedColumnName = "id", nullable = false)
    private Producer producerId;
    @ManyToOne
    @JoinColumn(name = "battary_id", referencedColumnName = "id", nullable = false)
    private Battary battaryId;


    @OneToMany(mappedBy = "meteostationId", fetch = FetchType.LAZY)
    private List<MeteostationInfo> meteostationInfoes;

    public Meteostation(Integer id, String name, String instalationDate, Location locationId, Producer producerId, Battary battaryId) {
        this.id = id;
        this.name = name;
        this.instalationDate = instalationDate;
        this.locationId = locationId;
        this.producerId = producerId;
        this.battaryId = battaryId;
    }

    @Override
    public String toString() {
        return "Meteostation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", instalationDate='" + instalationDate + '\'' +
                ", locationId=" + locationId.getId() +
                ", producerId=" + producerId.getId() +
                ", battaryId=" + battaryId.getId() +
                '}'+ "\n";
    }
}
