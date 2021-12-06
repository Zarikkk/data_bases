package model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "location")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "coordinates", length = 45)
    private String coordinates;
    @Column(name = "adress", length = 45)
    private String adress;
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
    private City cityId;

    @OneToMany(mappedBy = "locationId",fetch = FetchType.LAZY)
    private List<Meteostation> meteostations;

    public Location(Integer id, String coordinates, String adress, City cityId) {
        this.id = id;
        this.coordinates = coordinates;
        this.adress = adress;
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", coordinates='" + coordinates + '\'' +
                ", adress='" + adress + '\'' +
                ", cityId=" + cityId.getId() +
                '}' + "\n";
    }
}
