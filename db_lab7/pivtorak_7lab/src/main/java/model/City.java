package model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 45)
    private String name;
    @OneToMany(mappedBy = "cityId", fetch = FetchType.LAZY)
    private List<Location> locations;

    public City(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'+ "\n";
    }
}
