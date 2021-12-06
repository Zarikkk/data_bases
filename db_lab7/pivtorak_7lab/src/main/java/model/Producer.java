package model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "producer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity

public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "country", length = 45)
    private String country;

    @OneToMany(mappedBy = "producerId", fetch = FetchType.EAGER)
    private List<Battary> battaries;

    @OneToMany(mappedBy = "producerId", fetch = FetchType.LAZY)
    private List<Meteostation> meteostations;

    public Producer(Integer id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}'+ "\n";
    }
}
