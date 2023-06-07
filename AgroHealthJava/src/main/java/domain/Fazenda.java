package domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Fazenda")
public class Fazenda {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_Fazenda")
    @SequenceGenerator(name = "SQ_Fazenda", sequenceName = "SQ_Fazenda")
    @Column(name = "id_fazenda")
    private long id;
    @Column(name = "nome_fazenda")
    private String nome;
    @Column(name = "endereco_fazenda")
    private String endereco;
    @Column(name = "tamanho_fazenda")
    private int tamanho;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(
            name = "id_usuario",
            referencedColumnName = "id_usuario",
            foreignKey = @ForeignKey(
                    name = "Fazenda_Usuario_FK",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    private Usuario usuario;

    public Fazenda() {
    }

    public Fazenda(long id, String nome, String endereco, int tamanho, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.usuario = usuario;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
