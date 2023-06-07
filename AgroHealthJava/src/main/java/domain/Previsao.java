package domain;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Previsao")
public class Previsao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_Previsao")
    @SequenceGenerator(name = "SQ_Previsao", sequenceName = "SQ_Previsao")
    @Column(name = "id_previsao")
    private long id;
    @Column(name = "data_previsao")
    private LocalDate data;
    @Column(name = "quantidade_prevista")
    private int quantidadePrevista;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(
            name = "id_cultura",
            referencedColumnName = "id_cultura",
            foreignKey = @ForeignKey(
                    name = "Previsao_Cultura_FK",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private Cultura cultura;

    public Previsao() {
    }

    public Previsao(long id, LocalDate data, int quantidadePrevista, Cultura cultura) {
        this.id = id;
        this.data = data;
        this.quantidadePrevista = quantidadePrevista;
        this.cultura = cultura;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getQuantidadePrevista() {
        return quantidadePrevista;
    }

    public void setQuantidadePrevista(int quantidadePrevista) {
        this.quantidadePrevista = quantidadePrevista;
    }
}
