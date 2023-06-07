package domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Colheita")
public class Colheita {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COLHEITA")
    @SequenceGenerator(name = "SQ_COLHEITA", sequenceName = "SQ_COLHEITA")
    @Column(name = "ID_COLHEITA")
    private long id;
    @Column(name = "data_colheita")
    private String data_colheita;
    @Column(name = "ds_colheita")
    private String descricao;
    @Column(name = "tp_sensor")
    private String tipo;
    @Column(name = "prioridade_sensor")
    private String prioridade;
    @Column(name = "equipe_responsavel")
    private String equipe_responsavel;
    @Column(name = "tel_equipe_responsavel")
    private String telefone_equipe_responsavel;
    @Column(name = "email_equipe_responsavel")
    private String email_equipe_responsavel;

    public Colheita() {
    }

    public Colheita(long id, String data_colheita, String descricao, String tipo, String prioridade, String equipe_responsavel, String telefone_equipe_responsavel, String email_equipe_responsavel) {
        this.id = id;
        this.data_colheita = data_colheita;
        this.descricao = descricao;
        this.tipo = tipo;
        this.prioridade = prioridade;
        this.equipe_responsavel = equipe_responsavel;
        this.telefone_equipe_responsavel = telefone_equipe_responsavel;
        this.email_equipe_responsavel = email_equipe_responsavel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData_colheita() {
        return data_colheita;
    }

    public void setData_colheita(String data_colheita) {
        this.data_colheita = data_colheita;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getEquipe_responsavel() {
        return equipe_responsavel;
    }

    public void setEquipe_responsavel(String equipe_responsavel) {
        this.equipe_responsavel = equipe_responsavel;
    }

    public String getTelefone_equipe_responsavel() {
        return telefone_equipe_responsavel;
    }

    public void setTelefone_equipe_responsavel(String telefone_equipe_responsavel) {
        this.telefone_equipe_responsavel = telefone_equipe_responsavel;
    }

    public String getEmail_equipe_responsavel() {
        return email_equipe_responsavel;
    }

    public void setEmail_equipe_responsavel(String email_equipe_responsavel) {
        this.email_equipe_responsavel = email_equipe_responsavel;
    }
}
