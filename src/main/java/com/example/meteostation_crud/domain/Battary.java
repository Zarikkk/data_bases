package com.example.meteostation_crud.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "battary")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class Battary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "capasity", length = 45)
    private String capasity;
    @ManyToOne
    @JoinColumn(name = "producer_id", referencedColumnName = "id", nullable = false)
    private Producer producerId;

    @OneToMany(mappedBy = "battaryId", fetch = FetchType.LAZY)
    private List<Meteostation> meteostations;

    public Battary(Integer id, String capasity, Producer producerId) {
        this.id = id;
        this.capasity = capasity;
        this.producerId = producerId;
    }

    @Override
    public String toString() {
        return "Battary{" +
                "id=" + id +
                ", capasity='" + capasity + '\'' +
                ", producerId=" + producerId.getId() +
                '}'+ "\n";
    }
}
