package com.example.meteostation_crud.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "service")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity

public class ServiceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "date", length = 45)
    private String date;

    @OneToMany(mappedBy = "serviceId", fetch = FetchType.LAZY)
    private List<MeteostationInfo> meteostationInfoes;

    public ServiceInfo(Integer id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ServiceInfo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}'+ "\n";
    }
}
