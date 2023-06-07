package domain;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Cultura")
public class Cultura {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_Cultura")
    @SequenceGenerator(name = "SQ_Cultura", sequenceName = "SQ_Cultura")
    @Column(name = "id_cultura")
    private long id;
    @Column(name = "nm_cultura")
    private String nome;
    @Column(name = "data_plantio")
    private LocalDate dataPlantio;
    @Column(name = "data_colheita")
    private LocalDate dataColheita;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(
            name = "id_sensor",
            referencedColumnName = "id_sensor",
            foreignKey = @ForeignKey(
                    name = "Cultura_Sensor_FK",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private Sensor sensor;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(
            name = "id_fazenda",
            referencedColumnName = "id_fazenda",
            foreignKey = @ForeignKey(
                    name = "Cultura_Fazenda_FK",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private Fazenda fazenda;

    public Cultura() {
    }

    public Cultura(long id, String nome, LocalDate dataPlantio, LocalDate dataColheita) {
        this.id = id;
        this.nome = nome;
        this.dataPlantio = dataPlantio;
        this.dataColheita = dataColheita;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(LocalDate dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public LocalDate getDataColheita() {
        return dataColheita;
    }

    public void setDataColheita(LocalDate dataColheita) {
        this.dataColheita = dataColheita;
    }
}
